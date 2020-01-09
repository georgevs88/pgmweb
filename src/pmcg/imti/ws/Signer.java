package pmcg.imti.ws;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

import javax.xml.crypto.MarshalException;
import javax.xml.crypto.dsig.CanonicalizationMethod;
import javax.xml.crypto.dsig.DigestMethod;
import javax.xml.crypto.dsig.Reference;
import javax.xml.crypto.dsig.SignatureMethod;
import javax.xml.crypto.dsig.SignedInfo;
import javax.xml.crypto.dsig.Transform;
import javax.xml.crypto.dsig.XMLSignature;
import javax.xml.crypto.dsig.XMLSignatureException;
import javax.xml.crypto.dsig.XMLSignatureFactory;
import javax.xml.crypto.dsig.dom.DOMSignContext;
import javax.xml.crypto.dsig.keyinfo.KeyInfo;
import javax.xml.crypto.dsig.keyinfo.KeyInfoFactory;
import javax.xml.crypto.dsig.keyinfo.X509Data;
import javax.xml.crypto.dsig.spec.C14NMethodParameterSpec;
import javax.xml.crypto.dsig.spec.TransformParameterSpec;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import sun.misc.BASE64Encoder;

public class Signer {

	private static PrivateKey privateKey;

	public static String xmlSigner(String conteudo) {
		//		FileOutputStream os;
		StringWriter sw = new StringWriter();
		try {
			// Instantiating the Document to be Signed
			ByteArrayInputStream xml = new ByteArrayInputStream(
					new String(conteudo.getBytes(), "ISO-8859-1").getBytes());
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			DocumentBuilder builder = dbf.newDocumentBuilder();
			Document doc = builder.parse(xml);

			XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
			KeyInfo ki = loadCertificates(Constantes.Certificados.arquivo_pfx, Constantes.Certificados.senha_pfx, fac);

			// Creating a Signing Context
			DOMSignContext dsc = new DOMSignContext(privateKey, doc.getDocumentElement());

			// Assembling the XML Signature
			Reference ref = fac.newReference("", fac.newDigestMethod(DigestMethod.SHA1, null),
					Collections.singletonList(fac.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null)),
					null, null);
			SignedInfo si = fac.newSignedInfo(
					fac.newCanonicalizationMethod(CanonicalizationMethod.EXCLUSIVE, (C14NMethodParameterSpec) null),
					fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null), Collections.singletonList(ref));
			XMLSignature signature = fac.newXMLSignature(si, ki);

			// Generating the XML Signature
			signature.sign(dsc);

			// Printing or Displaying the Resulting Document
			//			if (args.length > 1) {
			//			os = new FileOutputStream("/tmp/testeAssinado.xml");

			// JDI			os = new FileOutputStream("C://keystore//testeAssinado.xml");
			//			} else {
			//os = System.out;
			//			}
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer trans = tf.newTransformer();
			trans.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
			// JDI			trans.transform(new DOMSource(doc), new StreamResult(os));
			trans.transform(new DOMSource(doc), new StreamResult(sw));

			// VALIDAR
			/*
			 * NodeList nl = doc.getElementsByTagNameNS(XMLSignature.XMLNS,
			 * "Signature"); if (nl.getLength() == 0) { throw new Exception(
			 * "Cannot find Signature element"); }
			 * 
			 * KeyStore keyStore = KeyStore.getInstance("PKCS12"); keyStore.load(new
			 * FileInputStream(new File(arquivo_pfx)), new
			 * String(senha_pfx).toCharArray()); KeyManagerFactory keyFactory =
			 * KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm()
			 * ); keyFactory.init(keyStore, new String(senha_pfx).toCharArray());
			 * KeyManager[] keyMgr = keyFactory.getKeyManagers();
			 * 
			 * DOMValidateContext valContext = new DOMValidateContext(new
			 * X509KeySelector(keyStore), nl.item(0)); XMLSignature ass =
			 * fac.unmarshalXMLSignature(valContext); boolean coreValidity =
			 * ass.validate(valContext); if(coreValidity){ System.out.println(
			 * "\n\nSignature Validation passed"); }else{ System.out.println(
			 * "\n\nSignature Validation Failed"); }
			 */
		} catch (Exception e) {
			System.out.println("ERRO AO ASSINAR XML");
		}
		return sw.toString();
	}

	public static String xmlDecompSigner(String conteudo)
			throws NoSuchAlgorithmException, InvalidAlgorithmParameterException, KeyStoreException,
			CertificateException, FileNotFoundException, IOException, UnrecoverableKeyException,
			ParserConfigurationException, SAXException, MarshalException, XMLSignatureException, TransformerException {
		XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
		Reference ref = fac.newReference("", fac.newDigestMethod("http://www.w3.org/2000/09/xmldsig#sha1", null),
				Collections.singletonList(fac.newTransform("http://www.w3.org/2000/09/xmldsig#enveloped-signature",
						(TransformParameterSpec) null)),
				null, null);
		SignedInfo si = fac.newSignedInfo(
				fac.newCanonicalizationMethod("http://www.w3.org/2001/10/xml-exc-c14n#",
						(C14NMethodParameterSpec) null),
				fac.newSignatureMethod("http://www.w3.org/2000/09/xmldsig#rsa-sha1", null),
				Collections.singletonList(ref));
		String pass = Constantes.Certificados.senha_pfx;
		String stAlias = "1";
		String stAliasPass = pass;
		KeyStore ks = KeyStore.getInstance("PKCS12");
		ks.load(new FileInputStream(Constantes.Certificados.arquivo_pfx), pass.toCharArray());
		String alias = stAlias.equals("1") ? ks.aliases().nextElement() : stAlias;
		String aliasPass = stAliasPass;
		PrivateKey key = (PrivateKey) ks.getKey(alias, aliasPass.toCharArray());
		Certificate[] chain = ks.getCertificateChain(alias);
		X509Certificate cert = (X509Certificate) ks.getCertificate(alias);
		KeyInfoFactory kif = fac.getKeyInfoFactory();
		ArrayList<Object> x509Content = new ArrayList<Object>();
		x509Content.add(cert.getSubjectX500Principal().getName());
		x509Content.add(cert);
		X509Data xd = kif.newX509Data(x509Content);
		KeyInfo ki = kif.newKeyInfo(Collections.singletonList(xd));
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		dbf.setNamespaceAware(true);
		ByteArrayInputStream xml = new ByteArrayInputStream(new String(conteudo.getBytes(), "ISO-8859-1").getBytes());
		DocumentBuilder builder = dbf.newDocumentBuilder();
		Document doc = builder.parse(xml);
		StringWriter sw = new StringWriter();
		//            Document doc = dbf.newDocumentBuilder().parse(new FileInputStream(this.stFileXml));
		DOMSignContext dsc = new DOMSignContext(key, (Node) doc.getDocumentElement());
		XMLSignature signature = fac.newXMLSignature(si, ki);
		signature.sign(dsc);
		//            FileOutputStream os = new FileOutputStream(this.stOutFileXml);
		TransformerFactory tf = TransformerFactory.newInstance();
		Transformer trans = tf.newTransformer();
		trans.transform(new DOMSource(doc), new StreamResult(sw));
		return sw.toString();
	}

	public static void xmlFileSigner(String caminhoArquivo) {
		try {
			// Instantiating the Document to be Signed
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			dbf.setNamespaceAware(true);
			DocumentBuilder builder = dbf.newDocumentBuilder();
			Document doc = builder.parse(new FileInputStream(new File(caminhoArquivo)));

			XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM");
			KeyInfo ki = loadCertificates(Constantes.Certificados.arquivo_pfx, Constantes.Certificados.senha_pfx, fac);

			// Creating a Signing Context
			DOMSignContext dsc = new DOMSignContext(privateKey, doc.getDocumentElement());

			// Assembling the XML Signature
			Reference ref = fac.newReference("", fac.newDigestMethod(DigestMethod.SHA1, null),
					Collections.singletonList(fac.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null)),
					null, null);
			SignedInfo si = fac.newSignedInfo(
					fac.newCanonicalizationMethod(CanonicalizationMethod.EXCLUSIVE, (C14NMethodParameterSpec) null),
					fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null), Collections.singletonList(ref));
			XMLSignature signature = fac.newXMLSignature(si, ki);

			// Generating the XML Signature
			signature.sign(dsc);

			// Printing or Displaying the Resulting Document
			OutputStream os;
			//			if (args.length > 1) {
			os = new FileOutputStream("C://keystore//testeAssinado.xml");
			//			} else {
			//os = System.out;
			//			}
			TransformerFactory tf = TransformerFactory.newInstance();
			Transformer trans = tf.newTransformer();
			trans.setOutputProperty(OutputKeys.ENCODING, "ISO-8859-1");
			trans.transform(new DOMSource(doc), new StreamResult(os));

			// VALIDAR
			/*
			 * NodeList nl = doc.getElementsByTagNameNS(XMLSignature.XMLNS,
			 * "Signature"); if (nl.getLength() == 0) { throw new Exception(
			 * "Cannot find Signature element"); }
			 * 
			 * KeyStore keyStore = KeyStore.getInstance("PKCS12"); keyStore.load(new
			 * FileInputStream(new File(arquivo_pfx)), new
			 * String(senha_pfx).toCharArray()); KeyManagerFactory keyFactory =
			 * KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm()
			 * ); keyFactory.init(keyStore, new String(senha_pfx).toCharArray());
			 * KeyManager[] keyMgr = keyFactory.getKeyManagers();
			 * 
			 * DOMValidateContext valContext = new DOMValidateContext(new
			 * X509KeySelector(keyStore), nl.item(0)); XMLSignature ass =
			 * fac.unmarshalXMLSignature(valContext); boolean coreValidity =
			 * ass.validate(valContext); if(coreValidity){ System.out.println(
			 * "\n\nSignature Validation passed"); }else{ System.out.println(
			 * "\n\nSignature Validation Failed"); }
			 */
		} catch (Exception e) {
			System.out.println("ERRO AO ASSINAR XML");
		}
	}

	public static String assinarString(String desafio) {
		try {
			byte[] data = desafio.getBytes("ISO-8859-1");
			Signature sig = Signature.getInstance("SHA1withRSA");
			if (privateKey == null) {
				loadCertificates(Constantes.Certificados.arquivo_pfx, Constantes.Certificados.senha_pfx,
						XMLSignatureFactory.getInstance("DOM"));
			}
			sig.initSign(privateKey);
			sig.update(data);
			byte[] signatureBytes = sig.sign();
			String retorno = new BASE64Encoder().encode(signatureBytes);
			//System.out.println("Singature: " + retorno);
			return retorno;
		} catch (UnsupportedEncodingException e) {
			System.out.println("ERRO AO ASSINAR STRING");
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			System.out.println("ERRO AO ASSINAR STRING");
			e.printStackTrace();
		} catch (InvalidKeyException e) {
			System.out.println("ERRO AO ASSINAR STRING");
			e.printStackTrace();
		} catch (SignatureException e) {
			System.out.println("ERRO AO ASSINAR STRING");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("ERRO AO ASSINAR STRING");
			e.printStackTrace();
		}
		return null;

		/*XMLSignatureFactory fac = XMLSignatureFactory.getInstance("DOM"); 
		KeyInfo ki = new Signer().loadCertificates(Constantes.Certificados.arquivo_pfx, Constantes.Certificados.senha_pfx, fac);
		//Assembling the XML Signature
		Reference ref = fac.newReference("", fac.newDigestMethod(DigestMethod.SHA1, null), Collections.singletonList(fac.newTransform(Transform.ENVELOPED, (TransformParameterSpec) null)), null, null); 
		SignedInfo si = fac.newSignedInfo(fac.newCanonicalizationMethod(CanonicalizationMethod.EXCLUSIVE, (C14NMethodParameterSpec) null), fac.newSignatureMethod(SignatureMethod.RSA_SHA1, null), Collections.singletonList(ref));
		Signature signature = fac.newXMLSignature(si, ki); 
		
		signature.update(desafio.getBytes()); 
		byte[] assinatura = signature.sign(); */
	}

	public static KeyInfo loadCertificates(String certificado, String senha, XMLSignatureFactory signatureFactory)
			throws Exception {

		InputStream entrada = new FileInputStream(certificado);
		KeyStore ks = KeyStore.getInstance("pkcs12");
		try {
			ks.load(entrada, senha.toCharArray());
		} catch (IOException e) {
			throw new Exception("Senha do Certificado Digital incorreta ou Certificado inválido.");
		}

		KeyStore.PrivateKeyEntry pkEntry = null;
		Enumeration<String> aliasesEnum = ks.aliases();
		while (aliasesEnum.hasMoreElements()) {
			String alias = (String) aliasesEnum.nextElement();
			if (ks.isKeyEntry(alias)) {
				pkEntry = (KeyStore.PrivateKeyEntry) ks.getEntry(alias,
						new KeyStore.PasswordProtection(senha.toCharArray()));
				privateKey = pkEntry.getPrivateKey();
				break;
			}
		}

		X509Certificate cert = (X509Certificate) pkEntry.getCertificate();

		KeyInfoFactory keyInfoFactory = signatureFactory.getKeyInfoFactory();
		List<X509Certificate> x509Content = new ArrayList<X509Certificate>();

		x509Content.add(cert);
		X509Data x509Data = keyInfoFactory.newX509Data(x509Content);
		return keyInfoFactory.newKeyInfo(Collections.singletonList(x509Data));
	}
}

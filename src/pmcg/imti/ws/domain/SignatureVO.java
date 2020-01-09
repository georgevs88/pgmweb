package pmcg.imti.ws.domain;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;

@XStreamAlias(value = "Signature")
public class SignatureVO {
	
	@XStreamAlias("xmlns")
	private String xmlns;
	
	@XStreamAlias(value = "SignedInfo")
	private SignedInfoVO signedInfo;
	
	@XStreamAlias("SignatureValue")
	private String signatureValue;
	
	@XStreamAlias(value = "KeyInfo")
	private KeyInfoVO keyInfo;

	public SignedInfoVO getSignedInfo() {
		return signedInfo;
	}

	public void setSignedInfo(SignedInfoVO signedInfo) {
		this.signedInfo = signedInfo;
	}

	public String getSignatureValue() {
		return signatureValue;
	}

	public void setSignatureValue(String signatureValue) {
		this.signatureValue = signatureValue;
	}

	public KeyInfoVO getKeyInfo() {
		return keyInfo;
	}

	public void setKeyInfo(KeyInfoVO keyInfo) {
		this.keyInfo = keyInfo;
	}
	
	public static SignatureVO fromXml(String xml) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.processAnnotations(SignatureVO.class);
		return (SignatureVO) xstream.fromXML(xml);
	}

	public static String toXML(SignatureVO resp) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.addImmutableType(String.class);
		xstream.processAnnotations(SignatureVO.class);
		return xstream.toXML(resp);
	}
	
}

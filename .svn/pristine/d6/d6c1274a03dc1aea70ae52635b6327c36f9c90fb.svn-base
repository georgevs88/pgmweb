package pmcg.imti.ws.domain;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;

@XStreamAlias(value = "SignedInfo")
public class SignedInfoVO {
	@XStreamAlias(value = "CanonicalizationMethod")
	private CanonicalizationMethodVO canonicalizationMethod;
	
	@XStreamAlias(value = "SignatureMethod")
	private SignatureMethodVO signatureMethod;
	
	@XStreamAlias(value = "Reference")
	private ReferenceVO reference;
	
	public CanonicalizationMethodVO getCanonicalizationMethod() {
		return canonicalizationMethod;
	}

	public void setCanonicalizationMethod(CanonicalizationMethodVO canonicalizationMethod) {
		this.canonicalizationMethod = canonicalizationMethod;
	}

	public SignatureMethodVO getSignatureMethod() {
		return signatureMethod;
	}

	public void setSignatureMethod(SignatureMethodVO signatureMethod) {
		this.signatureMethod = signatureMethod;
	}

	public ReferenceVO getReference() {
		return reference;
	}

	public void setReference(ReferenceVO reference) {
		this.reference = reference;
	}

	public static SignedInfoVO fromXml(String xml) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.processAnnotations(SignedInfoVO.class);
		return (SignedInfoVO) xstream.fromXML(xml);
	}

	public static String toXML(SignatureVO resp) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.addImmutableType(String.class);
		xstream.processAnnotations(SignatureVO.class);
		return xstream.toXML(resp);
	}

}

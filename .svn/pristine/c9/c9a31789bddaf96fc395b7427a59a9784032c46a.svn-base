package pmcg.imti.ws.domain;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;

@XStreamAlias(value = "Reference")
public class ReferenceVO {
	
	@XStreamAlias("URI")
	private String uri;
	
	@XStreamAlias(value = "Transforms")
	private TransformsVO transforms;
	
	@XStreamAlias(value = "DigestMethod")
	private DigestMethodVO digestMethod;
	
	@XStreamAlias(value = "DigestValue")
	private String digestValue;
	
	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public TransformsVO getTransforms() {
		return transforms;
	}

	public void setTransforms(TransformsVO transforms) {
		this.transforms = transforms;
	}

	public DigestMethodVO getDigestMethod() {
		return digestMethod;
	}

	public void setDigestMethod(DigestMethodVO digestMethod) {
		this.digestMethod = digestMethod;
	}

	public String getDigestValue() {
		return digestValue;
	}

	public void setDigestValue(String digestValue) {
		this.digestValue = digestValue;
	}

	public static ReferenceVO fromXml(String xml) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.processAnnotations(ReferenceVO.class);
		return (ReferenceVO) xstream.fromXML(xml);
	}

	public static String toXML(SignatureVO resp) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.addImmutableType(String.class);
		xstream.processAnnotations(SignatureVO.class);
		return xstream.toXML(resp);
	}
}

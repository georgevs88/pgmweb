package pmcg.imti.ws.domain;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;

@XStreamAlias(value = "DigestMethod")
public class DigestMethodVO {
	
	@XStreamAlias("Algorithm")
	private String algorithm;
	
	public String getAlgorithm() {
		return algorithm;
	}

	public void setAlgorithm(String algorithm) {
		this.algorithm = algorithm;
	}

	public static DigestMethodVO fromXml(String xml) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.processAnnotations(DigestMethodVO.class);
		return (DigestMethodVO) xstream.fromXML(xml);
	}

	public static String toXML(SignatureVO resp) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.addImmutableType(String.class);
		xstream.processAnnotations(SignatureVO.class);
		return xstream.toXML(resp);
	}
}

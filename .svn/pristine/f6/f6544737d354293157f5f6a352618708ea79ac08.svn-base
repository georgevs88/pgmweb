package pmcg.imti.ws.domain;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;

@XStreamAlias(value = "KeyInfo")
public class KeyInfoVO {
	@XStreamAlias(value = "X509Data")
	private X509DataVO x509Data;
	
	public X509DataVO getX509Data() {
		return x509Data;
	}

	public void setX509Data(X509DataVO x509Data) {
		this.x509Data = x509Data;
	}

	public static KeyInfoVO fromXml(String xml) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.processAnnotations(KeyInfoVO.class);
		return (KeyInfoVO) xstream.fromXML(xml);
	}

	public static String toXML(KeyInfoVO resp) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.addImmutableType(String.class);
		xstream.processAnnotations(KeyInfoVO.class);
		return xstream.toXML(resp);
	}
}

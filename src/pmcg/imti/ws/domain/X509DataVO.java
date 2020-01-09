package pmcg.imti.ws.domain;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;

@XStreamAlias(value = "X509Data")
public class X509DataVO {
	
	@XStreamAlias("X509Certificate")
	private String x509Certificate;

	public String getX509Certificate() {
		return x509Certificate;
	}

	public void setX509Certificate(String x509Certificate) {
		this.x509Certificate = x509Certificate;
	}
	
	public static X509DataVO fromXml(String xml) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.processAnnotations(X509DataVO.class);
		return (X509DataVO) xstream.fromXML(xml);
	}

	public static String toXML(SignatureVO resp) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.addImmutableType(String.class);
		xstream.processAnnotations(SignatureVO.class);
		return xstream.toXML(resp);
	}
	
	

}

package pmcg.imti.ws.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;

@XStreamAlias(value = "MessageId")
public class MessageIdVO {
	
	public MessageIdVO(String serviceId, String msgDesc) {
		super();
		this.serviceId = serviceId;
		this.version = "1.0";
		this.msgDesc = msgDesc;
		Long time = new Date().getTime();
		this.code = time.toString();
		this.fromAddress = "PGE";
		this.toAddress = "TJ";
		this.date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
	
	public MessageIdVO(String serviceId, String msgDesc, String code) {
		super();
		this.serviceId = serviceId;
		this.version = "1.0";
		this.msgDesc = msgDesc;
		Long time = new Date().getTime();
		this.code = code;
		this.fromAddress = "PGE";
		this.toAddress = "TJ";
		this.date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
	}
	
	/*
	<ServiceId>SolicitaLogon</ServiceId>
	<Version>1.0</Version>
	<MsgDesc>Solicitação do Desafio de Logon</MsgDesc>
	<Code>1457120979875</Code>
	<FromAddress>PGM</FromAddress>
	<ToAddress>TJ</ToAddress>
	<Date>2016-03-04</Date>
	*/
	@XStreamAlias("ServiceId")
	private String serviceId;
	
	@XStreamAlias("Version")
	private String version;
	
	@XStreamAlias("MsgDesc")
	private String msgDesc;
	
	@XStreamAlias("Code")
	private String code;
	
	@XStreamAlias("FromAddress")
	private String fromAddress;
	
	@XStreamAlias("ToAddress")
	private String toAddress;
	
	@XStreamAlias("Date")
	private String date;

	public String getServiceId() {
		return serviceId;
	}

	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getMsgDesc() {
		return msgDesc;
	}

	public void setMsgDesc(String msgDesc) {
		this.msgDesc = msgDesc;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getFromAddress() {
		return fromAddress;
	}

	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
	}

	public String getToAddress() {
		return toAddress;
	}

	public void setToAddress(String toAddress) {
		this.toAddress = toAddress;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	public static MessageIdVO fromXml(String xml) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.processAnnotations(MessageIdVO.class);
		return (MessageIdVO) xstream.fromXML(xml);
	}

	public static String toXML(MessageIdVO resp) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.addImmutableType(String.class);
		xstream.processAnnotations(MessageIdVO.class);
		return xstream.toXML(resp);
	}
	
	
}

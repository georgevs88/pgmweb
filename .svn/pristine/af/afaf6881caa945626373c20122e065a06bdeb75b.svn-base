package pmcg.imti.ws.domain;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.io.xml.DomDriver;

@XStreamAlias(value = "Message")
public class ConfirmaLogonVO {
	@XStreamAlias(value = "MessageId")
	private MessageIdVO messageId;
	@XStreamAlias(value = "MessageBody")
	private MessageBodyVO messageBody = new MessageBodyVO();
	
	public ConfirmaLogonVO(String code) {
		super();
		messageId = new MessageIdVO("ConfirmaLogon","Confirmação do Desafio de Login", code);
	}

	public static ConfirmaLogonVO fromXml(String xml) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.processAnnotations(ConfirmaLogonVO.class);
		return (ConfirmaLogonVO) xstream.fromXML(xml);
	}

	public static String toXML(ConfirmaLogonVO resp) {
		XStream xstream = new XStream(new DomDriver());
		xstream.autodetectAnnotations(true);
		xstream.processAnnotations(ConfirmaLogonVO.class);
		return "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>" + xstream.toXML(resp);
	}

	public MessageIdVO getMessageId() {
		return messageId;
	}

	public void setMessageId(MessageIdVO messageId) {
		this.messageId = messageId;
	}

	public MessageBodyVO getMessageBody() {
		return messageBody;
	}

	public void setMessageBody(MessageBodyVO messageBody) {
		this.messageBody = messageBody;
	}
	
	
}

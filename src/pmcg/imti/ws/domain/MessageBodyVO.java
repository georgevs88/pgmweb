package pmcg.imti.ws.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value = "MessageBody")
public class MessageBodyVO {

	//	@XStreamOmitField
	@XStreamAlias(value = "Resposta")
	private RespostaVO resposta = new RespostaVO();

	public RespostaVO getResposta() {
		return resposta;
	}

	public void setResposta(RespostaVO resposta) {
		this.resposta = resposta;
	}

	@XStreamAlias(value = "DesafioAssinado")
	private String desafioAssinado;

	public String getDesafioAssinado() {
		return desafioAssinado;
	}

	public void setDesafioAssinado(String desafioAssinado) {
		this.desafioAssinado = desafioAssinado;
	}

}

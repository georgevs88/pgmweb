package pmcg.imti.ws.domain;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias(value = "Resposta")
public class RespostaVO {
	@XStreamAlias(value = "Mensagem")
	private MensagemVO mensagem = new MensagemVO();
	@XStreamAlias("Desafio")
	private String desafio;

	public String getDesafio() {
		return desafio;
	}

	public void setDesafio(String desafio) {
		this.desafio = desafio;
	}
}

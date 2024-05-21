package entidade;

import entidade.enums.Especializacao;

public class PacientePlano extends Paciente{
	
	private Double coparticipacao;
	
	public PacientePlano() {
		super();
}
	
	public PacientePlano(String nome,Double valorDaConsulta,Especializacao especializacao, Double coparticipacao) {
		super(nome,valorDaConsulta,especializacao);
			this.coparticipacao = coparticipacao;
	}
	
	public double getCoparticipacao() {
		return coparticipacao;
	}
	
	public void setCoparticipacao(double coparticipacao) {
		this.coparticipacao = coparticipacao;
	}
	
	public double valorFinal() {
		return getValorDaConsulta() - (getValorDaConsulta() * coparticipacao/100);
	}
	
	@Override
	public String formaDePagamento() {
		return "PACIENTE:"+getNome()
				+ " - ESPECIALIZAÇÃO:"
				+ getEspecializacao()
				+ " - FORMA DE PAGAMENTO: COPARTICIPAÇÃO"
				+ " - VALOR PAGO: R$"
				+String.format("%.2f", valorFinal());
	}
}

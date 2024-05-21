package entidade;

import entidade.enums.Especializacao;

public class PacienteCartao extends Paciente {
	
	private Double taxaDeServico;
	
	public PacienteCartao() {
		super();
	}
	
	public PacienteCartao(String nome, Double valorDaConsulta,Especializacao especializacao, Double taxaDeServiço) {
		super(nome,valorDaConsulta,especializacao);
		this.taxaDeServico = taxaDeServiço;
	}
	
	public double getTaxaDeServico() {
		return taxaDeServico;
	}
	
	public void setTaxaDeServico(double taxaDeServico) {
		this.taxaDeServico = taxaDeServico;
	}
	
	public double valorFinal() {
		return getValorDaConsulta() + (getValorDaConsulta() * taxaDeServico/100);
	}
	
	public String formaDePagamento() {
		return "PACIENTE:"+getNome()
				+ " - ESPECIALIZAÇÃO:"
				+ getEspecializacao()
				+ " - FORMA DE PAGAMENTO: CREDITO"
				+ " - VALOR PAGO: R$"
				+String.format("%.2f", valorFinal());
	}
}

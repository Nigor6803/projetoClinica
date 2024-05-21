package entidade;

import entidade.enums.Especializacao;

public class Paciente {
	
	private String nome;
	private Double valorDaConsulta;
	private Especializacao especializacao; 
	
	public Paciente() {
		}
	
	public Paciente(String nome, Double valorDaConsulta, Especializacao especializacao) {
		this.nome = nome;
		this.valorDaConsulta = valorDaConsulta;
		this.especializacao = especializacao;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getValorDaConsulta() {
		return valorDaConsulta;
	} 
	
	public void setValorDaConsulta(double valorDaConsulta) {
		this.valorDaConsulta = valorDaConsulta;
	}
	
	public Especializacao getEspecializacao() {
		return especializacao;
	}
	
	public void setEspecializacao(Especializacao especializacao) {
		this.especializacao = especializacao;
	}
	
	public String formaDePagamento() {
		return "PACIENTE:"+nome
				+ " - ESPECIALIZAÇÃO:"
				+ especializacao
				+ " - FORMA DE PAGAMENTO: A VISTA"
				+ " - VALOR PAGO: R$"
				+String.format("%.2f", valorDaConsulta);
	}
}

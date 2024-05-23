package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Paciente;
import entidade.PacienteCartao;
import entidade.PacientePlano;
import entidade.enums.Especializacao;

public class Progama {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner edd = new Scanner(System.in);
		
		List <Paciente> lista = new ArrayList<>();
		
		System.out.print("QUANTOS PACIENTES:");
		int n = edd.nextInt();
		
		for (int i = 1;i<=n;i++) {
			System.out.println("REGISTRO DO "+i+"º PACIENTE");
			
			System.out.print("NOME:");
			edd.nextLine();
			String nome = edd.nextLine();
			System.out.print("ESPECIALIZAÇÃO:");
			String cargo = edd.nextLine();
			System.out.print("VALOR DA CONSULTA:");
			double valor = edd.nextDouble();
			
			System.out.println("FORMA DE PAGAMENTO:");
			System.out.println("A - DINHEIRO/DEBITO/PIX");
			System.out.println("B - CARTÃO CREDITO");
			System.out.println("C - COPARTICIPAÇÃO");
			System.out.print("OPÇÃO:");
			char resp = edd.next().charAt(0);
			
			if(resp == 'A') {
				
				lista.add(new Paciente(nome,valor,Especializacao.valueOf(cargo)));
			}
			else if(resp == 'B') {
				
				System.out.print("TAXA DE SERVIÇO EM %:");
				double taxaDeSservico = edd.nextDouble();
				
				lista.add(new PacienteCartao(nome,valor,Especializacao.valueOf(cargo),taxaDeSservico));
			}
			else {
				System.out.print("TAXA DE DESCONTO EM %:");
				double coparticipacao = edd.nextDouble();
				
				lista.add(new PacientePlano(nome, valor, Especializacao.valueOf(cargo), coparticipacao));
			}
		}
		
		System.out.println("RELATORIO DO DIA");
		for(Paciente pac : lista) {
			System.out.println(pac.formaDePagamento());
		}
		edd.close();

	}

}

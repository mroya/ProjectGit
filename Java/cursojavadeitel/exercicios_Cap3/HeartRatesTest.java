package cursojavadeitel.exercicios_Cap3;

import java.util.Scanner;

public class HeartRatesTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		String pessoaNome; 
		String pessoaSobrenome;
		int pessoaAnoNasc; 
		int pessoaMesNasc;
		int pessoaDiaNasc;
		int anoAtual;
		
		System.out.println("---Cáculo de Frequência Cardíaca Alvo---");
		
		System.out.print("Informe o Nome: ");
		pessoaNome = input.nextLine();
		System.out.print("Informe o Sobrenome: ");
		pessoaSobrenome = input.nextLine();
		System.out.print("Informe o Ano Atual: ");
		anoAtual = input.nextInt();
		System.out.print("Infome o Ano de nascimento: ");
		pessoaAnoNasc = input.nextInt();
		System.out.print("Informe o Mês de Nascimento: ");
		pessoaMesNasc = input.nextInt();
		System.out.print("Informe o Dia do Nascimento: ");
		pessoaDiaNasc = input.nextInt();
		
		// Instanciando a classe
		HeartRates hrates1 = new HeartRates(pessoaNome, pessoaSobrenome, pessoaAnoNasc, pessoaMesNasc, pessoaDiaNasc, anoAtual);
		
		// Chamada dos Métodos
		hrates1.CalculaIdade();
		hrates1.HeartRatesMax();
		hrates1.HeartRatesFCA();
		
		// Imprimindo os resultados
		System.out.println("\n\t Resultado dos dados \n");
		System.out.printf("Nome: %s %s - Data de Nascimento: %d/ %d/ %d\n", hrates1.getNome(), hrates1.getSobrenome(), hrates1.getDiaNasc(), 
				hrates1.getMesNasc(), hrates1.getAnoNasc());
		System.out.printf("Sua idade é de %d anos.\n", hrates1.CalculaIdade());
		System.out.printf("Seu número Máximo de batimentos Cardíaco é de %d bpm.\n",hrates1.HeartRatesMax());
		System.out.printf("Seu Alvo de Frequência Cardíaca é de %.2f até %.2f", hrates1.getFca1(), hrates1.getFca2());

		input.close();

	}// fim método main

}// fim da classe HeartratesTest

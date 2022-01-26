package cursojavadeitel.exercicios_Cap2;

import java.util.Scanner;

public class calcIMCTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		// Variáveis de Instância
		String pessoaNome;
		String pessoaSobrenome;
		int anoAtual;
		int pessoaAnoNasc;
		double pessoaPeso;
		double pessoaAltura;

		@SuppressWarnings("unused")
		int pessoaIdadeAtual;
		@SuppressWarnings("unused")
		double pessoaIMC;

		System.out.print("\t Cáclculo IMC \n");
		System.out.println("---------------------------------------");
		System.out.print("Informe o Nome: ");
		pessoaNome = input.nextLine();
		System.out.print("Informe o Sobrenome: ");
		pessoaSobrenome = input.nextLine();
		System.out.print("Informe o Ano Atual: ");
		anoAtual = input.nextInt();
		System.out.print("Informe o Ano de Nascimento: ");
		pessoaAnoNasc = input.nextInt();
		System.out.print("Informe o Peso:(kg) ");
		pessoaPeso = input.nextDouble();
		System.out.print("Informe a Altura:(mt) ");
		pessoaAltura = input.nextDouble();

		calcIMC imcPessoa = new calcIMC(pessoaNome, pessoaSobrenome, anoAtual, pessoaAnoNasc, pessoaPeso, pessoaAltura);

		// Carrega os Métodos
		imcPessoa.CalcIdade();
		imcPessoa.CalcIMC();
		imcPessoa.letterTab();

		// Imprime os dados
		System.out.println();
		System.out.printf("A idade do paciente %s %s é %d anos.\n", imcPessoa.getNome(), imcPessoa.getSobrenome(),
				imcPessoa.getIdadeAtual());
		System.out.printf("O IMC do paciente %s %s é de %.2f.\n", imcPessoa.getNome(), imcPessoa.getSobrenome(),
				imcPessoa.getIMC());
		System.out.printf("%s\n", imcPessoa.letterTab());
		input.close();

	}

}

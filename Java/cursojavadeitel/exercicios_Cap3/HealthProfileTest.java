package cursojavadeitel.exercicios_Cap3;

import java.util.Scanner;

public class HealthProfileTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String pacienteNome;
		String pacienteSobrenome;
		String pacienteSexo;
		int pacienteMesNasc;
		int pacienteDiaNasc;
		int pacienteAnoNasc;
		int anoAtual;
		double pacienteAltura;
		double pacientePeso;

		System.out.println("\n\t Prontuário Médico \n");

		System.out.print("Informe o Nome do paciente: ");
		pacienteNome = input.nextLine();
		System.out.print("Informe o Sobrenome do Paciente: ");
		pacienteSobrenome = input.nextLine();
		System.out.print("Informe o Sexo do Paciente(M/F): ");
		pacienteSexo = input.nextLine();
		System.out.print("Informe o Mês do Nascimento: ");
		pacienteMesNasc = input.nextInt();
		System.out.print("Informe o Dia do Nascimento: ");
		pacienteDiaNasc = input.nextInt();
		System.out.print("informe o Ano do Nascimento: ");
		pacienteAnoNasc = input.nextInt();
		System.out.print("Informe o Ano Atual: ");
		anoAtual = input.nextInt();
		System.out.print("Informe a Altura do Paciente: ");
		pacienteAltura = input.nextDouble();
		System.out.print("Informe o Peso do Paciente: ");
		pacientePeso = input.nextDouble();

		// Instanciando a classe
		HealthProfile helthPro = new HealthProfile(pacienteNome, pacienteSobrenome, pacienteSexo, pacienteMesNasc,
				pacienteDiaNasc, pacienteAnoNasc, anoAtual, pacienteAltura, pacientePeso);

		// Chamando os métodos
		helthPro.calculoIdade();
		helthPro.calculoFCM();
		helthPro.calculoFCA();
		helthPro.calculoIMC();
		

		// Imprimindo os Resultados
		System.out.println("\n\t Dados do Paciente \n");
		System.out.printf("Nome do Paciente: %s %s\n", helthPro.getNome(), helthPro.getSobrenome());
		System.out.printf("Idade do Paciente: %d anos \n", helthPro.calculoIdade());
		System.out.printf("Altura do Paciente é %.2f mt\n", helthPro.getAltura());
		System.out.printf("O peso do Paciente é %.2f kg\n", helthPro.getPeso());
		System.out.printf("O IMC atual do Paciente é %.2f\n", helthPro.calculoIMC());
		System.out.printf("A frequência Cardiaca máxima é de %.2f bpm\n", helthPro.calculoFCM());
		System.out.printf("A frequência Alvo Cardíaca é de %.2f bpm até %.2f bpm", helthPro.getFCA1(), helthPro.getFCA2());

		input.close();

	}// fim main

}// fim classe

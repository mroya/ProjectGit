package cursojavadeitel.exercicios_Cap5;

import java.util.Scanner;

public class JurosCompostos {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int continuar = 1;
		double amount; // Quantia em depósito ao fim de cada ano
		double principal = 1000.0; // quantidade inicial antes dos juros
		double rate = 0; // taxa de juros

		while (continuar == 1) {
			System.out.print("Informe a taxa de Juros: ");
			rate = input.nextDouble();

			// exibe cabeçalhos
			System.out.printf("%s%20s %n", "Year", "Amount on deposit");

			// calcula quantidade de depósito para cada um dos dez anos
			for (int year = 1; year <= 10; ++year) {
				// Calcula nova quantidade durante ano especificado
				amount = principal * Math.pow(1.0 + rate / 100, year);

				// exibe o ano e a quantidade
				System.out.printf("%4d%,20.2f%n", year, amount);

			} // fim comando for

			System.out.println("--------------------------------------------------");
			System.out.print("Gostaria de fazer mais algum cálculo: 1-Sim / 2-Não ");
			continuar = input.nextInt();
			System.out.println();
			
			// sentinela while
			if (continuar != 1) {
				break;
			} // fim do if

		} // fim do comando while
		
		System.out.println("Obrigado, volte sempre!");

	} // fim do método main

}// fim do classe JurosCompostos

package cursojavadeitel.exercicios_Cap5;

import java.util.Scanner;

public class GraficoBarras {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		char simbolo = '*';
		System.out.println("*** Exibição de barras de gráfico ***");

		for (int i = 1; i <= 1; i++) {
			System.out.print("Informe o 1º número entre 1 à 30: ");
			int num1 = input.nextInt();
			for (int j = 1; j <= 1; j++)
				System.out.printf("Informe o 2º número entre 1 à 30: ");
				@SuppressWarnings("unused")
				int num2 = input.nextInt();
			for (int k = 1; k <= 1; k++)
				System.out.printf("Informe o 3º número entre 1 à 30: ");
				@SuppressWarnings("unused")
				int num3 = input.nextInt();
			for (int l = 1; l <= 1; l++)
				System.out.printf("Informe o 4º número entre 1 à 30: ");
				@SuppressWarnings("unused")
				int num4 = input.nextInt();
			for (int m = 1; m <= 1; m++)
				System.out.printf("Informe o 5º número entre 1 à 30: ");
				@SuppressWarnings("unused")
				int num5 = input.nextInt();

			System.out.println();
			System.out.println(simbolo += num1);
			//System.out.println(simbolo*num2);
			//System.out.println(simbolo*num3);
			//System.out.println(simbolo*num4);
			//System.out.println(simbolo*num5);
		}

		input.close();
	}
}


package cursojavadeitel.exercicios_Cap4;

import java.util.Scanner;

public class MaiorNum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;
		int maior = 0;
		int counter = 0;

		System.out.print("Informe um número: ");
		num = input.nextInt();
		maior = num;
		counter++;

		while (counter < 5) {
			System.out.print("Informe um número: ");
			num = input.nextInt();
			if (num > maior) {
				maior = num;
			}
			counter++;
		}

		// Impressão do maior número
		System.out.printf("O MAIOR número digitado foi %d %n", maior);

		input.close();

	}

}


package cursojavadeitel.exercicios_Cap4;

import java.util.Scanner;

public class MaiorNum {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int num;
		int maior = 0;
		int counter = 0;

		System.out.print("Informe um n�mero: ");
		num = input.nextInt();
		maior = num;
		counter++;

		while (counter < 5) {
			System.out.print("Informe um n�mero: ");
			num = input.nextInt();
			if (num > maior) {
				maior = num;
			}
			counter++;
		}

		// Impress�o do maior n�mero
		System.out.printf("O MAIOR n�mero digitado foi %d %n", maior);

		input.close();

	}

}

/**
 * Escreva um aplicativo que leia um inteiro, além de determinar e imprimir se ele é
 * ímpar ou par.
 */

package cursojavadeitel.exercicios_Cap2;

import java.util.Scanner;

public class Exercicio2_25 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1;

		System.out.print("Enter number interger: ");
		number1 = input.nextInt();

		if (number1 % 2 == 0)
			System.out.printf("the number %d is pair%n", number1);
		if (number1 % 2 != 0)
			System.out.printf("the number %d is odd%n", number1);

		input.close();

	}

}

/**
 * Escreva um aplicativo que leia dois inteiros, além de determinar se o primeiro
 * é um múltiplo do segundo e imprimir o resultado.
 */

package cursojavadeitel.exercicios_Cap2;

import java.util.Scanner;

public class Exercicio2_26 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1, number2;

		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		if (number1 % number2 == 0)// divide o number1 por number2 se dar resto 0 ele é multimplo.
			System.out.print("The first integer is composite of the second integer.");
		if (number1 % number2 != 0)// divide o number1 por number2 se dar resto 1 ele não é multimplo.
			System.out.print("The number is not composite.");
		input.close();
	}
}

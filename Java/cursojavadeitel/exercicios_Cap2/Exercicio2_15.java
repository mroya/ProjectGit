/*
 * Escreva um aplicativo que solicite ao usu�rio inserir dois inteiros,
 * obtenha dele esses n�meros e imprima sua soma, produto, diferen�a e
 * quociente(divis�o). Utilize as t�cnicas mostradas na fig 2.7 
 */
package cursojavadeitel.exercicios_Cap2;

import java.util.Scanner;

public class Exercicio2_15 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number1, number2;
		int sum, sub, prod, div;

		System.out.print("Enter first integer: ");
		number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		sum = number1 + number2;
		System.out.printf("A soma dos n�meros %d + %d � ==> %d%n", number1, number2, sum);
		sub = number1 - number2;
		System.out.printf("A diferen�a dos n�meros %d - %d � ==> %d%n", number1, number2, sub);
		prod = number1 * number2;
		System.out.printf("O produto dos n�meros %d * %d � ==> %d%n", number1, number2, prod);
		div = number1 / number2;
		System.out.printf("A divis�o dos n�meros %d / %d � ==> %d%n", number1, number2, div);

		input.close();

	}

}

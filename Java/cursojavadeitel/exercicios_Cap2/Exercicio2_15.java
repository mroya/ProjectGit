/*
 * Escreva um aplicativo que solicite ao usuário inserir dois inteiros,
 * obtenha dele esses números e imprima sua soma, produto, diferença e
 * quociente(divisão). Utilize as técnicas mostradas na fig 2.7 
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
		System.out.printf("A soma dos números %d + %d é ==> %d%n", number1, number2, sum);
		sub = number1 - number2;
		System.out.printf("A diferença dos números %d - %d é ==> %d%n", number1, number2, sub);
		prod = number1 * number2;
		System.out.printf("O produto dos números %d * %d é ==> %d%n", number1, number2, prod);
		div = number1 / number2;
		System.out.printf("A divisão dos números %d / %d é ==> %d%n", number1, number2, div);

		input.close();

	}

}

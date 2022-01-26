/*
 * Escreva um aplicativo que solicite ao usuário inserir dois inteiros
 * obtenha dele esses números e exiba o número maior seguido pelas pa-
 * lavras "is larger". Se os números forem iguais, imprima a mensagem
 * "These numbers are equal". Utilize as técnicas mostradas na Figura 2.15
 */
package cursojavadeitel.exercicios_Cap2;

import java.util.Scanner;

public class exercicio2_16 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number1, number2;
		
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		
		if (number1 > number2)
			System.out.printf("The first number  %d is larger!", number1);
		if (number2 > number1)
			System.out.printf("the second number %d is larger!", number2);
		if (number1 == number2)
			System.out.println("These numbers are equal!");
		
		input.close();

	}

}

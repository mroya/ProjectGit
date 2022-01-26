/**
 * Escreva um aplicativo que insira três inteiros digitados pelo usuário e 
 * exiba a soma, média, produto e os números menores e maiores.Utilize as
 * técnicas mostradas na Fig 2.15.
 */
package cursojavadeitel.exercicios_Cap2;

import java.util.Scanner;

public class Exercicio2_17 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int number1, number2, number3;
		int sum, media, prod;
		int cont = 0;
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		cont += 1;
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		cont += 1;
		System.out.print("Enter third number: ");
		number3 = input.nextInt();
		cont += 1;
		sum = (number1 + number2 + number3);
		System.out.printf("the sum is %d%n", sum);
		media = sum / cont;
		System.out.printf("the average of the numbers informed was %d%n", media);
		prod = (number1 * number2 * number3);
		System.out.printf("the product of the number informed was %d%n", prod);

		if (number1 > number2)
			if (number1 > number3)
				System.out.println("The first number is large!");
		if (number2 > number1)
			if (number2 > number3)
				System.out.println("The second number is large!");
		if (number3 > number1)
			if (number3 > number2)
				System.out.println("the third number is large!");
		input.close();
	}
}

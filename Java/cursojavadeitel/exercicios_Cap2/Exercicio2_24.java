/**
 * Escreva um aplicativo que leia cinco inteiros, além de determinar e 
 * imprimir o maior e o menor inteiro no grupo. Utilize somente as técnicas
 * mostradas neste capítulo 2
 */
package cursojavadeitel.exercicios_Cap2;

import java.util.Scanner;

public class Exercicio2_24 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1, number2, number3, number4, number5;
				
		System.out.print("Enter first integer: ");
		number1 = input.nextInt();
		System.out.print("Enter second integer: ");
		number2 = input.nextInt();
		System.out.print("Enter third integer: ");
		number3 = input.nextInt();
		System.out.print("Enter fourth integer: ");
		number4 = input.nextInt();
		System.out.print("Enter fifth integer: ");
		number5 = input.nextInt();
		
		int maior = number1;
		int menor = number1;
		
		//descobrir o maior número
		if (number2 > maior)
			maior = number2;
		if (number3 > maior)
			maior = number3;
		if (number4 > maior)
			maior = number4;
		if (number5 > maior)
			maior = number5;
		
		//descobrir o menor número
		if (number2 < menor)
			menor = number2;
		if (number3 < menor)
			menor = number3;
		if (number4 < menor)
			menor = number4;
		if (number5 < menor)
			menor = number5;
		System.out.printf("The number %d is large and the number %d is small number.%n", maior, menor);
		
		input.close();
	}
}

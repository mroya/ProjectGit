package cursojavadeitel.exercicios_Cap2;

import java.util.Scanner;

public class Exercicio2_6 {
	// Cálculo de um produto de três inteiros

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		int x, y, z, result;

		System.out.print("Enter first integer: ");
		x = input.nextInt();

		System.out.print("Enter second integer: ");
		y = input.nextInt();

		System.out.printf("Enter third integer: ");
		z = input.nextInt();

		result = (x * y * z);

		System.out.printf("Product is %d", result);
	}

}

package cursojavadeitel.exercicios_Cap6;

import java.util.Scanner;

public class Multiplos {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o 1º número: ");
		int num1 = input.nextInt();
		
		System.out.print("Informe o 2º número: ");
		int num2 = input.nextInt();
		
		System.out.printf("%n%d é múltiplo do %d ? %s", num2, num1, isMultiple(num1, num2));
		input.close();
	}
	// Método isMultiple
	public static boolean isMultiple(int num1, int num2) {
		return num2 % num1 == 0 ? true : false;
	}
}

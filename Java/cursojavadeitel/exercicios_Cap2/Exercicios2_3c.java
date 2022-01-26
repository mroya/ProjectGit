package cursojavadeitel.exercicios_Cap2;

import java.util.Scanner;

public class Exercicios2_3c {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int number1;
		int value;
		
		System.out.print("Digite um valor: ");
		number1 = input.nextInt();
		
		value = number1;
		
		System.out.printf("O valor digitado %d foi atribuido para o value.", value);
	}

}

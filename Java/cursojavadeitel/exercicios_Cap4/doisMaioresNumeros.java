package cursojavadeitel.exercicios_Cap4;

import java.util.Scanner;

public class doisMaioresNumeros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int num;
		int maiorA;
		int maiorB = 0;
		int counter = 0;

		System.out.print("Informe um n�mero: ");
		num = input.nextInt();
		maiorA = num;
		maiorB = maiorA;
		counter++;

		while (counter <= 5) {
			System.out.print("Informe um n�mero: ");
			num = input.nextInt();
			if (num > maiorA) {
				maiorA = num;
			}else if (num > maiorA && num < maiorB)
				maiorB = maiorA;
			counter++;
			
				System.out.print("Informe um n�mero: ");
				num = input.nextInt();
		}
		
		
		
		System.out.printf("O Primeiro maior n�mero � : %d%n", maiorA);
		
		System.out.printf("O Segundo maior n�mero �: %d%n", maiorB);

		input.close();
	}

}

package cursojavadeitel.exercicios_Cap5;

import java.util.Scanner;

public class Ex511_MenorValor {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int num;
		int quant;
		int count = 0;
		int menor=0;
		
		System.out.print("Informe quantos n�meros ser�o lidos: ");
		quant = input.nextInt();
		
		for(count = 1; count <= quant; count++) {
			System.out.printf("Informe o %d� n�mero: ", count);
			num = input.nextInt();
			
			if (count == 1) {
				menor = num;
			} else if (num < menor) {
				menor = num;
			}
		}
		System.out.println("O menor n�mero digitado foi: " + menor);
		
		input.close();
		
	}

}

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
		
		System.out.print("Informe quantos números serão lidos: ");
		quant = input.nextInt();
		
		for(count = 1; count <= quant; count++) {
			System.out.printf("Informe o %dº número: ", count);
			num = input.nextInt();
			
			if (count == 1) {
				menor = num;
			} else if (num < menor) {
				menor = num;
			}
		}
		System.out.println("O menor número digitado foi: " + menor);
		
		input.close();
		
	}

}

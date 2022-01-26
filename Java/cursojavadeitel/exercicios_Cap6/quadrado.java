package cursojavadeitel.exercicios_Cap6;

import java.util.Scanner;

public class quadrado {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o lado do Quadrado: ");
		int lado = input.nextInt();
		input.close();
		
		squareOfAsterisks(lado);
	}	
	
	public static void squareOfAsterisks(int lado) {
		for(int i=0;i<lado;i++) {
			for(int j=0;j<lado;j++)
				System.out.print("*");
			
			System.out.println();
		}
	}

}

package cursojavadeitel.exercicios_Cap6;

import java.util.Scanner;

public class quadrado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o lado do Quadrado: ");
		int lado = input.nextInt();
		System.out.println("Informe o character: ");
		char fill = input.next().charAt(0);
		
		input.close();
		
		squareOfAsterisks(lado, fill);
	}
	
	public static void squareOfAsterisks(int lado, char fill) {
		for(int i=0;i<lado;i++) {
			for(int j=0;j<lado;j++)
				System.out.print(fill);
			
			System.out.println();
		}
	}
}

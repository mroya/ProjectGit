package cursojavadeitel.exercicios_Cap6;

import java.util.Scanner;

public class areaCirculo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double area;
		System.out.print("Informe o raio do c�rculo: ");
		double raio = input.nextDouble();
		area = (Math.PI*(raio*2));
		
		System.out.printf("A �rea do raio � de %.2f" , area);
				
		input.close();

	}

}

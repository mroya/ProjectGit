package cursojavadeitel.exercicios_Cap6;

import java.util.Scanner;

public class areaCirculo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double area;
		System.out.print("Informe o raio do círculo: ");
		double raio = input.nextDouble();
		area = (Math.PI*(raio*2));
		
		System.out.printf("A área do raio é de %.2f" , area);
				
		input.close();

	}

}

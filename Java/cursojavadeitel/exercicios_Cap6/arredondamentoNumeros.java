package cursojavadeitel.exercicios_Cap6;

import java.util.Scanner;

public class arredondamentoNumeros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Arredondamento de N�meros");
		System.out.print("Informe um n�mero: ");
		double num = input.nextDouble();
		
		double x = Math.floor(num + 0.5);
		System.out.println("O n�mero original � "+ num);
		System.out.printf("O resultado com arredondamento �: %.2f%n", x);
		System.out.println();
		
		System.out.println("Arredondamento de casas Decimais");
		
		System.out.println("Arredondamento com 1 casa depois da V�rgula");
		double y = Math.floor(num * 10 + 0.5)/10;
		System.out.println("O resultado � " + y);
		System.out.println();
		
		System.out.println("Arredondamento com 2 casa depois da V�rgula");
		double z = Math.floor(num * 10 + 0.5)/100;
		System.out.println("O resultado � " + z);
		System.out.println();
		
		System.out.println("Arredondamento com 3 casa depois da V�rgula");
		double d = Math.floor(num * 10 + 0.5)/1000;
		System.out.println("O resultado � " + d);
		input.close();

	}

}

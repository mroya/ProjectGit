package cursojavadeitel.exercicios_Cap6;

import java.util.Scanner;

public class arredondamentoNumeros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Arredondamento de Números");
		System.out.print("Informe um número: ");
		double num = input.nextDouble();
		
		double x = Math.floor(num + 0.5);
		System.out.println("O número original é "+ num);
		System.out.printf("O resultado com arredondamento é: %.2f%n", x);
		System.out.println();
		
		System.out.println("Arredondamento de casas Decimais");
		
		System.out.println("Arredondamento com 1 casa depois da Vírgula");
		double y = Math.floor(num * 10 + 0.5)/10;
		System.out.println("O resultado é " + y);
		System.out.println();
		
		System.out.println("Arredondamento com 2 casa depois da Vírgula");
		double z = Math.floor(num * 10 + 0.5)/100;
		System.out.println("O resultado é " + z);
		System.out.println();
		
		System.out.println("Arredondamento com 3 casa depois da Vírgula");
		double d = Math.floor(num * 10 + 0.5)/1000;
		System.out.println("O resultado é " + d);
		input.close();

	}

}

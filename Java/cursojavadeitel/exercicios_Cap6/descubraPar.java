package cursojavadeitel.exercicios_Cap6;

import java.util.Scanner;

public class descubraPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int resp = 0;
		System.out.print("Informe um número: ");
		int num = input.nextInt();
		System.out.println();
		System.out.printf("O número %d é Par? %s %n", num, isEven(num));
		System.out.println();
		System.out.println("Quer continuar?(1 -Sim/2 -Não) ");
		System.out.println();
		resp = input.nextInt();
		while (resp == 1){
			System.out.print("Informe um número: ");
			num = input.nextInt();
			System.out.println();
			System.out.printf("O número %d é Par? %s %n", num, isEven(num));
			System.out.println();
			System.out.println("Quer continuar?(1 -Sim/2 -Não) ");
			System.out.println();
			resp = input.nextInt();
		}
		input.close();
		
		System.out.println("obrigado, volte sempre!");

	}
	
	// MÃ©todo isEven
	public static boolean isEven(int num) {
		return num % 2 == 0 ? true:false;
	}
}

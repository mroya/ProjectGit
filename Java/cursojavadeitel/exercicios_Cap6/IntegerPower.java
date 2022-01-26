package cursojavadeitel.exercicios_Cap6;

import java.util.Scanner;

public class IntegerPower {
	
	//Buscar os valores pelo usuario
	public void buscarBaseExpoente() {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a base: ");
		int base = input.nextInt();
		System.out.print("Informe o expoente: ");
		int expoente = input.nextInt();
		
		// verificando se o expoente não é zero
		while(expoente <= 0) {
			System.out.println("Por favor, informe somente expoente maior que zero!");
			System.out.print("Informe o expoente: ");
			expoente = input.nextInt();
		}//fim while
		
		int result = integerPower(base, expoente);
		System.out.println(result);
		
		input.close();
	} // fim método buscarBaseExpoente
	
	// Método integerPower
	private int integerPower(int base, int expoente) {
		int i = 1;
		int power = 1;
		
		while(i <= expoente) {
			power *= base;
			i++;
		} // fim while
				
		return power;
	} // fim Metodo integerPower
}

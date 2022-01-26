package cursojavadeitel.Cap2;

import java.util.Scanner; // programa utiliza a classe Scanner

public class Addition {

	public static void main(String[] args) {
		
		// Cria um Scanner para obter entrada a partir da janela de comando
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int number1; // primeiro número a somar
		int number2; // segundo número a somar
		int sum; // soma de number1 e number2
		
		System.out.print("Enter first integer: "); // prompt
		number1 = input.nextInt(); // lê primeiro o nº fornecido pelo usuário
		
		System.out.print("Enter second integer: "); //prompt
		number2 = input.nextInt(); // lê o segundo número
		
		sum = number1 + number2;
		System.out.printf("Sum is %d%n", sum); // exibe a soma
	} // fim do método main
} // fim da classe Addition

// Figura 6.3: MaximumFinder.java
// Método maximum declarado pelo programador com três parâmetros double
package cursojavadeitel.Cap6;

import java.util.Scanner;

public class MaximumFinder {

	// obtém três valores de ponto flutuante e localiza o valor máximo
	public static void main(String[] args) {
		// Cria Scanner para entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		// Solicita e insere três valores de ponto flutuante
		System.out.print("Enter three floating-point values separated by spaces: ");
		double number1 = input.nextDouble(); // lê o primeiro double
		double number2 = input.nextDouble(); // lê o segundo double
		double number3 = input.nextDouble(); // lê o terceiro double

		// determina o valor maximum
		double result = maximum(number1, number2, number3);

		// exibe o valor máximo
		System.out.println("Maximum is: " + result);

		input.close();
	}

	// retorna o máximo dos seus três parâmetros de double
	public static double maximum(double x, double y, double z) {
		double maximumValue = x; // supõe que x é o maior valor inicial

		// determina se y é o maior que maximumValue
		if (y > maximumValue)
			maximumValue = y;

		// determina se z é maior que maximumValue
		if (z > maximumValue)
			maximumValue = z;

		return maximumValue;
	}

}

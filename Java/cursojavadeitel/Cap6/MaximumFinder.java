// Figura 6.3: MaximumFinder.java
// M�todo maximum declarado pelo programador com tr�s par�metros double
package cursojavadeitel.Cap6;

import java.util.Scanner;

public class MaximumFinder {

	// obt�m tr�s valores de ponto flutuante e localiza o valor m�ximo
	public static void main(String[] args) {
		// Cria Scanner para entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);

		// Solicita e insere tr�s valores de ponto flutuante
		System.out.print("Enter three floating-point values separated by spaces: ");
		double number1 = input.nextDouble(); // l� o primeiro double
		double number2 = input.nextDouble(); // l� o segundo double
		double number3 = input.nextDouble(); // l� o terceiro double

		// determina o valor maximum
		double result = maximum(number1, number2, number3);

		// exibe o valor m�ximo
		System.out.println("Maximum is: " + result);

		input.close();
	}

	// retorna o m�ximo dos seus tr�s par�metros de double
	public static double maximum(double x, double y, double z) {
		double maximumValue = x; // sup�e que x � o maior valor inicial

		// determina se y � o maior que maximumValue
		if (y > maximumValue)
			maximumValue = y;

		// determina se z � maior que maximumValue
		if (z > maximumValue)
			maximumValue = z;

		return maximumValue;
	}

}

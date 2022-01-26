// Figura 6.6: RandomIntegers.java
// Inteiros aleat�rios deslocados e escalonados
package cursojavadeitel.Cap6;

import java.security.SecureRandom;

public class RandomIntegers {

	public static void main(String[] args) {
		// O objeto randomNumbers proiduzir� n�meros aleat�rios seguros
		SecureRandom randomNumbers = new SecureRandom();

		// Faz o loop 20 vezes
		for (int counter = 1; counter <= 20; counter++) {
			// Seleciona o inteiro aleat�rio entre 1 e 6
			int face = 1 + randomNumbers.nextInt(6);

			System.out.printf("%d  ", face); // exibe o valor gerado

			// Se o contador for divis�vel por 5, inicia uma nova linha de sa�da
			if (counter % 5 == 0)
				System.out.println();
		}

	}

}// fim da classe RandomNumbers

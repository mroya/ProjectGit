// fIGURA 6.7: RollDie.java
// Rola um dado de seis lados 6.000.000 vezes
package cursojavadeitel.Cap6;

import java.security.SecureRandom;

public class RollDie {

	public static void main(String[] args) {
		// o objeto randomNumbers produzir� n�meros aleat�rios seguros
		SecureRandom randomNumbers = new SecureRandom();

		int frequency1 = 0; // contagem de 1s lan�ados
		int frequency2 = 0; // contagem de 2s lan�ados
		int frequency3 = 0; // contagem de 3s lan�ados
		int frequency4 = 0; // contagem de 4s lan�ados
		int frequency5 = 0; // contagem de 5s lan�ados
		int frequency6 = 0; // contagem de 6s lan�ados

		// soma 6.000.000 lan�amentos de um dado
		for (int roll = 1; roll <= 6000000; roll++) {
			int face = 1 + randomNumbers.nextInt(6); // n�mero entre 1 e 6

			// usa o valor 1-6 para as faces a fim de determinar qual contador incrementar
			switch (face) {
			case 1:
				++frequency1; // incrementa o contador de 1s
				break;
			case 2:
				++frequency2; // incrementa o contador de 2s
				break;
			case 3:
				++frequency3; // incrementa o contador de 3s
				break;
			case 4:
				++frequency4; // incrementa o contador de 4s
				break;
			case 5:
				++frequency5; // incrementa o contador de 5s
				break;
			case 6:
				++frequency6; // incrementa o contador de 6s
				break;
			}

		}
		System.out.println("Face \tFrequency"); // cabe�alho de sa�da
		System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n", frequency1, frequency2, frequency3, frequency4,
				frequency5, frequency6);
	}

}// fim da classe RollDie

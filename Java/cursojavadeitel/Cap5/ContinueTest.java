// Figura 5.14: ContinueTest.java
// Instru��o continue que termina uma itera��o de uma instru��o for.
package cursojavadeitel.Cap5;

public class ContinueTest {

	public static void main(String[] args) {
		for (int count = 1; count <= 10; count++) { // faz o loop 10 vezes
			if (count == 5)
				continue; // pula o c�digo restante no corpo do loop se a contagem for 5

			System.out.printf("%d ", count);
		}

		System.out.printf("%nUsed continue to skip printing 5%n");
	}

} // fim da classe ContinueTest

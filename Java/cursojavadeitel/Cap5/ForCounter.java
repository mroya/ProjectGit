// Figura 5.2: ForCounter.java
// Repeti��o controlada por contador com a instru��o de repeti��o for.
package cursojavadeitel.Cap5;

public class ForCounter {

	public static void main(String[] args) {
		// O cabe�alho da instru��o for inclui inicializa��o,
		// condi��o de continua��o do loop e incremento
		for (int i = 2; i <= 20; i += 2)
			System.out.printf("%d  ", i);
		System.out.println();
	}
} // fim da classe ForCounter

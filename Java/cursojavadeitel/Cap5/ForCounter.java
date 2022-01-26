// Figura 5.2: ForCounter.java
// Repetição controlada por contador com a instrução de repetição for.
package cursojavadeitel.Cap5;

public class ForCounter {

	public static void main(String[] args) {
		// O cabeçalho da instrução for inclui inicialização,
		// condição de continuação do loop e incremento
		for (int i = 2; i <= 20; i += 2)
			System.out.printf("%d  ", i);
		System.out.println();
	}
} // fim da classe ForCounter

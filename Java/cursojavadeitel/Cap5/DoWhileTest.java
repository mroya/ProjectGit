// Figura 5.7: DoWhileTest.java
// instru��o de repeti��o do....while.
package cursojavadeitel.Cap5;

public class DoWhileTest {

	public static void main(String[] args) {

		int counter = 1;

		do {
			System.out.printf("%d   ", counter);
			++counter;
		} while (counter <= 10); // fim da instru��o do....while

		System.out.println();
	}
} // fim da classe DoWhileTest

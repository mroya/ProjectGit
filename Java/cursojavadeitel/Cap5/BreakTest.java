// Figura 5.13: BreakTest.java
// a instru��o break sai de uma instru��o for.
package cursojavadeitel.Cap5;

public class BreakTest {

	public static void main(String[] args) {
		int count; // vari�vel de controle tamb�m utilizada depois que loop termina
		
		for (count = 1; count <=10; count++) {  //faz o loop 10 vezes
			if(count == 5)
				break; // termina o loop se a contagem for 5
			System.out.printf("%d ", count);
		}
		System.out.printf("%nBroke out of loop at count = %d%n", count);

	}

} // fim da classe BreakTest

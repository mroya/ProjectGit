// Figura 5.1: WhileCounter

package cursojavadeitel.Cap5;

public class WhileCounter {

	public static void main(String[] args) {
		int counter = 0;// Declara e inicializa a vari�vel de controle
		
		while (++counter <= 10) { // Condi��o de continua��o do loop e vari�vel de controle de incremento
			System.out.printf("%d  ", counter);
		}
		System.out.println();
	}

}

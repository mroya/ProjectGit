// Figura 5.1: WhileCounter

package cursojavadeitel.Cap5;

public class WhileCounter {

	public static void main(String[] args) {
		int counter = 0;// Declara e inicializa a variável de controle
		
		while (++counter <= 10) { // Condição de continuação do loop e variável de controle de incremento
			System.out.printf("%d  ", counter);
		}
		System.out.println();
	}

}

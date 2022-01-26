// Figura 5.27: Shapes.java
// Desenhando uma cascata de formas com base na escolha do usuário.
package cursojavadeitel.Cap5;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Shapes extends JPanel {

	private int choice; // escolha do usuário de qual forma desenhar

	// construtor configura a escolha do usuário
	public Shapes(int userChoice) {
		choice = userChoice;
	}

	// Desenha uma cascata de formas que iniciam do canto superior esquerdo
	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		for (int i = 0; i < 12; i++) {
			// Seleciona a forma com base na escolha do usuário
			switch (choice) {
			case 1: // desenha retângulos
				g.drawRect(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			case 2: // desenha ovais
				g.drawOval(10 + i * 10, 10 + i * 10, 50 + i * 10, 50 + i * 10);
				break;
			case 3: // desenha Círculos
				g.drawOval(200 + i * 5, 10 + i * 5, 20 + i * 5, 30 + i * 5);
				break;
			}
		}
	}
} // fim da classe Shapes

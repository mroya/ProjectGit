// Figura 4.18: DrawPanel.java
// utilizando DrawLine para conctar os cantos de um painel

package cursojavadeitel.Cap4;

import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawPanel extends JPanel {

	// desenha um x a partir dos cantos do painel
	public void paintComponent(Graphics g) {

		// chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);

		int width = getWidth(); // largura total
		int height = getHeight(); // altura total

		int heigth = 0;
		// desenha uma linha a partir do canto superior esquerdo até o inferior direito
		g.drawLine(0, 0, width, heigth);

		// desenha uma linha a partir de canto inferior esquerdo até o superior direito
		g.drawLine(0, height, width, 0);
	}

}

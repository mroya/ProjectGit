// Figura 6.11: DrawSmiley.java
// Desenhando um rosto sorridente com cores e formas preenchidas
package cursojavadeitel.Cap6;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawSmiley  extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		// Desenha o rosto
		g.setColor(Color.YELLOW);
		g.fillOval(10, 10, 200, 200);
		
		// Desenha os Olhos
		g.setColor(Color.BLACK);
		g.fillOval(55, 65, 30, 30);
		g.fillOval(135, 65, 30, 30);
		
		// desenha a boca
		g.fillOval(50, 110, 120, 60);
		
		// "Retoca" a boca para criar um sorriso
		g.setColor(Color.YELLOW);
		g.fillRect(50, 110, 120, 30);
		g.fillOval(50, 120, 120, 40);
	}

} // fim da classe DrawSmiley

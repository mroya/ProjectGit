// Figura 5.28: Shapestest.java
// Obtendo a entrada de usu�rio e criando um JFrame para exibir Shapes.  
package cursojavadeitel.Cap5;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShapesTest {

	public static void main(String[] args) {
		
		// Obt�m a escolha do usu�rio
		String input = JOptionPane.showInputDialog(
				"Enter 1 to draw rectangles\n" + "Enter 2 to draw ovals\n" + "Enter 3 do draw Circulos");
		int choice = Integer.parseInt(input); // converte a entrada em int
		
		// Cria o painel com a entrada do usu�rio
		Shapes panel = new Shapes(choice);
		JFrame application = new JFrame();
		
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		application.add(panel);
		application.setSize(500, 500);
		application.setVisible(true);
	}

} // fim da classe ShapeTest

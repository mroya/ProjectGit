// Figura 4.19: DrawPanelTest.java
// Criando JFrame para exibir um DrawPanel

package cursojavadeitel.Cap4;

import javax.swing.JFrame;

public class DrawPanelTest {

	public static void main(String[] args) {
		// cria um painel que contém nosso desenho
		DrawPanel panel = new DrawPanel();

		// Cria um novo quadro para armazenar o painel
		JFrame application = new JFrame();

		// Configura o frame para ser encerrado quando ele é fechado
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		application.add(panel); // adiciona o painel ao frame
		application.setSize(250, 250); // configura o tamanho do frame
		application.setVisible(true); // torna o frame visivel

	} // fim método main

} // fim da classe DrawPanelTest

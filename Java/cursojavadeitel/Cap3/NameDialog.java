package cursojavadeitel.Cap3;

import javax.swing.JOptionPane;

public class NameDialog {

	public static void main(String[] args) {
		// Pede para o usu�rio inserir seu nome
		String name = JOptionPane.showInputDialog("What is your name?");

		// Cria a mensagem
		String message = String.format("Welcome , %s, to Java Programming!", name);

		// exibe a mensagem para cumprimentar o usu�rio pelo nome
		JOptionPane.showMessageDialog(null, message);

	} // fim do main

} // fim NameDialog

package cursojavadeitel.Cap2;

import javax.swing.JOptionPane;

public class AdditionJavaFX {

	public static void main(String[] args) {
		// Pede para o usuário inserir seu nome
		int sum;
		
		String num1 = JOptionPane.showInputDialog("Enter first integer:");
		int numero1 = Integer.parseInt(num1);
		
		String num2 = JOptionPane.showInputDialog("Enter second integer:");
		int numero2 = Integer.parseInt(num2);	
		
		
		sum = numero1 + numero2; 
		
		// Cria a mensagem
		String message = String.format("Sum is %d%n", sum);
		
		// exibe a mensagem para cumprimentar o usuário pelo nome
		JOptionPane.showMessageDialog(null, message);


	}

}

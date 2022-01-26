package cursojavadeitel.Cap2;

//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Comparison {

	public static void main(String[] args) {

		// cria Scanner para obter entrada
		//@SuppressWarnings("resource")
		//Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		
		String num1 = JOptionPane.showInputDialog("Enter First integer:");
		number1 = Integer.parseInt(num1);
		
		String num2 = JOptionPane.showInputDialog("Enter Second integer:");
		number2 = Integer.parseInt(num2);
		
		//System.out.print("Enter first integer: ");
		//number1 = input.nextInt();

		//System.out.print("Enter second integer: ");
		//number2 = input.nextInt();
		
		String message = null;
						
		if (number1 == number2)
			message = String.format("%d == %d%n", number1, number2);
			//System.out.printf("%d == %d%n", number1, number2);
		if (number1 != number2)
			message = String.format("%d != %d%n", number1, number2);
			//System.out.printf("%d != %d%n", number1, number2);
		if (number1 < number2)
			message = String.format("%d < %d%n", number1, number2);
			//System.out.printf("%d < %d%n", number1, number2);
		if (number1 > number2)
			message = String.format("%d > %d%n", number1, number2);
			//System.out.printf("%d > %d%n", number1, number2);
		if (number1 <= number2)
			message = String.format("%d <= %d%n", number1, number2);
			//System.out.printf("%d <= %d%n", number1, number2);
		if (number1 >= number2)
			message = String.format("%d >= %d%n", number1, number2);
			//System.out.printf("%d >= %d%n", number1, number2);
		
		JOptionPane.showMessageDialog(null, message);
	}
}

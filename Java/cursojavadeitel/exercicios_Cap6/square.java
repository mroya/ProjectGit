package cursojavadeitel.exercicios_Cap6;

import java.util.Scanner;

public class square {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the side of square: ");
		int side = input.nextInt();

		System.out.print("Enter a character: ");
		char fill = input.next().charAt(0);
		input.close();

		squareOf(side, fill);
	}

	public static void squareOf(int side, char fillCharacter) {
		for (int i = 0; i < side; i++) {
			for (int j = 0; j < side; j++)
				System.out.print(fillCharacter);

			System.out.println();
		}
	}

}

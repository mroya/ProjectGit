package cursojavadeitel.exercicios_Cap2;

import java.util.Scanner;

public class Exercicio2_28 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int radius, diameter;
		double circumference, area;

		System.out.print("inform the radius of the circle: ");
		radius = input.nextInt();

		diameter = (2 * radius);
		circumference = (2 * Math.PI * radius);
		area = Math.PI * Math.sqrt(radius);

		System.out.printf("the radius diameter is %d%n", diameter);
		System.out.printf("the size of the circumference is %.2f%n", circumference);
		System.out.printf("the area is the size of %.2f%n", area);

		input.close();
	}
}

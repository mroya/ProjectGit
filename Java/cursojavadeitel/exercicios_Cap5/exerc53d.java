package cursojavadeitel.exercicios_Cap5;

public class exerc53d {

	public static void main(String[] args) {
		int i = 1;

		for (i = 1; i <= 20; i++) {
			System.out.print(i);
			if (i % 5 == 0)
				System.out.println(i);
			else
				System.out.print('\t');
		}
	}
}

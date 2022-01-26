package cursojavadeitel.exercicios_Cap4;

public class formatoTabela {

	public static void main(String[] args) {

		int n1 = 1;
		int n2 = 2;
		int n3 = 3;
		int n4 = 4;
		int n5 = 5;

		int counterA = 0;
		int counterB = 0;
		int counterC = 0;
		int counterD = 0;
		int counterE = 0;

		int counter1 = 1;
		int counter2 = 10;
		int counter3 = 100;
		int counter4 = 1000;

		System.out.printf("%s%7s%8s%9s%n", "N", "10*N", "100*N", "1000*N");
		System.out.println();

		while (counterA < 1) {
			System.out.printf("%d%5s%8s%9s%n", n1 * counter1, n1 * counter2, n1 * counter3, n1 * counter4);
			counterA++;
		}
		while (counterB < 1) {
			System.out.printf("%d%5s%8s%9s%n", n2 * counter1, n2 * counter2, n2 * counter3, n2 * counter4);
			counterB++;
		}
		while (counterC < 1) {
			System.out.printf("%d%5s%8s%9s%n", n3 * counter1, n3 * counter2, n3 * counter3, n3 * counter4);
			counterC++;
		}
		while (counterD < 1) {
			System.out.printf("%d%5s%8s%9s%n", n4 * counter1, n4 * counter2, n4 * counter3, n4 * counter4);
			counterD++;
		}
		while (counterE < 1) {
			System.out.printf("%d%5s%8s%9s%n", n5 * counter1, n5 * counter2, n5 * counter3, n5 * counter4);
			counterE++;
		}

	}

}

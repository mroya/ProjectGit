package cursojavadeitel.exercicios_Cap5;

public class Ex512_Calculo_Impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total = 1;
		for(int i = 1; i <= 15; i +=2) {
			total *= i;
		}
			
		System.out.println("O C�lculo do produto dos n�meros �mpares de 0 at� 15 �: " + total);

	}

}

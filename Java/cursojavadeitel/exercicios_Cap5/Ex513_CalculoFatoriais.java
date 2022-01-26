package cursojavadeitel.exercicios_Cap5;

public class Ex513_CalculoFatoriais {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long fatorial = 1;
		for(int i = 1; i <=20; i++) {
			fatorial *= i;
		}
		System.out.println("O fatorial de 1 até 20 é de " + fatorial);

	}

}

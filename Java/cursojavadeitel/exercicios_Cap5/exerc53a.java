// Exercicio 5.3 a - Some os inteiros entre 1 e 99 utilizando uma instrução for
// Assuma que as variáveis de inteiros sum e count foram declaradas
package cursojavadeitel.exercicios_Cap5;

public class exerc53a {

	public static void main(String[] args) {
		
		int sum = 0;
		int count;
		
		for (count = 1; count <= 99; count += 2)
			sum += count;
		System.out.println(sum);
		
	}

}

// Figura 4.8: ClassAverage.java
// Resolvendo o problema da média da classe usando a repetição controlada por contador.

package cursojavadeitel.Cap4;

import java.util.Scanner;

public class ClassAverage {

	public static void main(String[] args) {
		
		// Cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		// Inicializa as variáveis de instância
		int total = 0; // inicializa a soma das notas inseridas pelo usuário
		int gradeCounter = 1; // inicializa nº da nota a ser inserida em seguida
		
		// Fase de processamento utiliza repetição controlada por contador
		while (gradeCounter <= 10) { // faz o loop 10 vezes
			System.out.print("Enter grade: ");// prompt
			int grade = input.nextInt(); // insere a próxima nota
			total = total + grade; // adiciona grade a total
			gradeCounter = gradeCounter + 1; // incrementa o contador por 1
		}
		
		// fase de término
		int average = total / 10; // divisão de inteiros produz um resultado inteiro
		
		// exibe o total e a média das notas
		System.out.printf("%nTotal of all 10 grades is %d%n", total);
		System.out.printf("Class average is %d%n", average);
		
		input.close();

	}

} // fim da classe ClassAverage

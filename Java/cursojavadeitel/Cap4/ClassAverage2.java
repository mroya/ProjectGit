// Figura 4.10: ClassAverage.java
// Resolvendo o problema da média da classe usando a repetição controlada por sentinela.

package cursojavadeitel.Cap4;

import java.util.Scanner;

public class ClassAverage2 {

	public static void main(String[] args) {
		
		// Cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		// Fase de inicialização das variáveis
		int total = 0; // inicializa a soma das notas
		int gradeCounter = 0; // inicializa o nº de notas inseridas até agora
		
		// Fase de processamento
		// Solicita entrada e lê a nota do usuário
		System.out.print("Enter grade or -1 to quit: ");
		int grade = input.nextInt();
		
		// faz um loop até ler o valor de sentinela inserido pelo usuário
		while (grade != -1) {
			total = total + grade; // adiciona grade a total
			gradeCounter = gradeCounter + 1; // incrementa o counter
			
			// Solicita entrada e lê a próxima nota fornecida pelo usuário
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		}
		
		// fase de término
		// Se o usuário inseriu pelo menos uma nota...
		if (gradeCounter != 0) {
			// usa número com ponto decimal para calcular média das notas
			double average = (double) total / gradeCounter;
			
			// exibe o total e a média (com dois digitos de precisão)
			System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
		}
		else // nenhuma nota foi inserida, assim gera a saída da mensagem apropriada
			System.out.println("No grades where entered");
		
		input.close(); // fim da classe Scanner

	}// fim método main

}  // fim da classe ClassAverage2

// Figura 4.10: ClassAverage.java
// Resolvendo o problema da m�dia da classe usando a repeti��o controlada por sentinela.

package cursojavadeitel.Cap4;

import java.util.Scanner;

public class ClassAverage2 {

	public static void main(String[] args) {
		
		// Cria Scanner para obter entrada a partir da janela de comando
		Scanner input = new Scanner(System.in);
		
		// Fase de inicializa��o das vari�veis
		int total = 0; // inicializa a soma das notas
		int gradeCounter = 0; // inicializa o n� de notas inseridas at� agora
		
		// Fase de processamento
		// Solicita entrada e l� a nota do usu�rio
		System.out.print("Enter grade or -1 to quit: ");
		int grade = input.nextInt();
		
		// faz um loop at� ler o valor de sentinela inserido pelo usu�rio
		while (grade != -1) {
			total = total + grade; // adiciona grade a total
			gradeCounter = gradeCounter + 1; // incrementa o counter
			
			// Solicita entrada e l� a pr�xima nota fornecida pelo usu�rio
			System.out.print("Enter grade or -1 to quit: ");
			grade = input.nextInt();
		}
		
		// fase de t�rmino
		// Se o usu�rio inseriu pelo menos uma nota...
		if (gradeCounter != 0) {
			// usa n�mero com ponto decimal para calcular m�dia das notas
			double average = (double) total / gradeCounter;
			
			// exibe o total e a m�dia (com dois digitos de precis�o)
			System.out.printf("%nTotal of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
		}
		else // nenhuma nota foi inserida, assim gera a sa�da da mensagem apropriada
			System.out.println("No grades where entered");
		
		input.close(); // fim da classe Scanner

	}// fim m�todo main

}  // fim da classe ClassAverage2

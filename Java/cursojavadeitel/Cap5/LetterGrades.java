// Figura 5.9: LetterGrades.java
// A classe LetterGrades utiliza a instru��o switch para contar as letras das notas escolares.
package cursojavadeitel.Cap5;

import java.util.Scanner;

public class LetterGrades {

	public static void main(String[] args) {

		int total = 0; // soma das notas
		int gradeCounter = 0; // n�mero de notas inseridas
		int aCount = 0; // contagem de notas A
		int bCount = 0; // contagem de notas B
		int cCount = 0; // contagem de notas C
		int dCount = 0; // contagem de notas D
		int fCount = 0; // contagem de notas F

		Scanner input = new Scanner(System.in);

		System.out.printf("%s%n%s%n  %s%n  %s%n", "Enter the integer grades in the range 0-100.", "", 
				"Type the end-of-file indicator to terminate input:",
				"On UNIX/Linux/Mac OS X type <ctrl> d then press Enter", "On Windows type <Ctrl> Z then press Enter");

		// Faz loop at� o usu�rio inserir o indicador de fim do arquivo
		while (input.hasNext()) {
			int grade = input.nextInt(); // l� a nota
			total += grade; // adiciona nota a total
			++gradeCounter; // incrementa o n�mero de notas

			// incrementa o contador de letras de nota adequado
			switch (grade / 10) {
			case 9: // a nota estava entre 90
			case 10: // e 100, inclusivo
				++aCount;
				break; // sai do switch
			case 8: // nota estava entre 80 e 89
				++bCount;
				break; // sai do switch
			case 7: // a nota estava entre 70 e 79
				++cCount;
				break; // sai do switch
			case 6: // a nota estava entre 60 e 69
				++dCount;
				break; // sai do switch
			default: // a nota era menor que 60
				++fCount;
				break; // opcional; fecha switch de qualquer maneira
			} // fim do switch
		} // fim do while

		// exibe o relat�rio da nota
		System.out.printf("%nGrade Report:%n");

		// se o usu�rio inseriu pelo menor uma nota ....
		if (gradeCounter != 0) {
			// calcula a m�dia de todas as notas inseridas
			double average = (double) total / gradeCounter;

			// gera a sa�da de resumo de resultados
			System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
			System.out.printf("%n%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n", "Number of students who received each grade:",
					"A: ", aCount, // exibe n�mero de notas A
					"B: ", bCount, // exibe n�mero de notas B
					"C: ", cCount, // exibe n�mero de notas C
					"D: ", dCount, // exibe n�mero de notas D
					"F: ", fCount); // exibe n�mero de notas F
		} // fim do if
		else // nunhuma nota foi inserida, assim gera a sa�da da mensagem apropriada
			System.out.println("No grades were entered");
		input.close();
	} // fim de main
}// finaliza a classe letterGrades

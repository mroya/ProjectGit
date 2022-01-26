package cursojavadeitel.exercicios_Cap4;
import java.util.Scanner;

public class analysis_424 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// inicializando as vari�veis de inst�ncia
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;

		// processa 10 alunos utilizando o loop controlado por contador
		while (studentCounter <= 10) {

			// Solicita ao usu�rio uma entrada e obt�m valor fornecido pelo usu�rio
			System.out.print("Enter result (1 = pass, 2 == fail): ");
			int result = input.nextInt();
			
			// Verificador 1 ou 2
			if (result != 1 && result != 2) {
				System.out.println("N�mero errado, digite novamente!");
			}
			// if ....else est� aninhado na instru��o while
			if (result == 1)
				passes++;
			else
				failures++;
			// incrementa studentCounter at� o loop terminar
			studentCounter++;
		}

		// fase de t�rmino; prepara e exibe os resultados
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

		// Determina se mais de 8 alunos foram aprovados
		if (passes > 8)
			System.out.println("B�nus to instructor");
		else
			System.out.println("Instructor didn't get a Bonus");

		input.close();

	}// fim classe main

}// fim classe Analysis1

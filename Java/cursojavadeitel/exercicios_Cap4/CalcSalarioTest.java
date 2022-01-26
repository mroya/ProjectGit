package cursojavadeitel.exercicios_Cap4;

import java.util.Scanner;

public class CalcSalarioTest {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String pessoaNome = null;
		double pessoaHorasTrab = 0;
		double pessoaSalario = 0;
		double pessoaTotal = 0;
		int controle = 0;

		System.out.print("Informe o nome do Funcionario: ");
		pessoaNome = input.next();
		System.out.print("Informe as Horas Trabalhadas: ");
		pessoaHorasTrab = input.nextDouble();
		System.out.print("Informe o salário do funcionario: ");
		pessoaSalario = input.nextDouble();
		System.out.println();
		
		CalcSalario calc1 = new CalcSalario(pessoaNome, pessoaHorasTrab, pessoaSalario, pessoaTotal);
		// Chamada dos Métodos
		calc1.Receber();
		
		System.out.printf("O Funcionário %s tem a receber R$ %.2f%n", calc1.getNomeFuncionario(), calc1.Receber());
		System.out.println();
		System.out.print("Deseja Continuar? 0 continua e -1 sair ");
		controle = input.nextInt();
		
		while (controle != -1) {
			
			System.out.print("Informe o nome do Funcionario: ");
			pessoaNome = input.next();
			System.out.print("Informe as Horas Trabalhadas: ");
			pessoaHorasTrab = input.nextDouble();
			System.out.print("Informe o salário do funcionario: ");
			pessoaSalario = input.nextDouble();
			System.out.println();
			// Chamada dos Métodos
			calc1.Receber();
						
			System.out.printf("O Funcionário %s tem a receber R$ %.2f%n", calc1.getNomeFuncionario(), calc1.Receber());
			System.out.println();
			System.out.print("Deseja Continuar? 0 continua e -1 sair ");
			controle = input.nextInt();
			
		}
		
		
		input.close();
		System.out.println("Dados informados com sucesso!");
	}

}

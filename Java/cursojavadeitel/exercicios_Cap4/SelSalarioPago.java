package cursojavadeitel.exercicios_Cap4;

import java.util.Scanner;

public class SelSalarioPago {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int opcao;
		double horasTrab = 0;
		double salMes = 0;
		int continuar = 0;
		double bonus = 0.50;
		@SuppressWarnings("unused")
		double salario; 
		double calculo;

		while (continuar != -1) {
			System.out.println("Escolha a op��o para alterar o sal�rio");
			System.out.println("1. Funcion�rio 1");
			System.out.println("2. Funcion�rio 2");
			System.out.println("3. Funcion�rio 3");
			System.out.print("Informe a sua op��o: ");
			opcao = input.nextInt();

			if (opcao == 1) {
				System.out.print("Informe o total de horas trabalhadas: ");
				horasTrab = input.nextDouble();
				System.out.print("Informe o Sal�rio: ");
				salMes = input.nextDouble();
				if (horasTrab > 40) {
					calculo = (salMes * bonus) + salMes;
					salMes = calculo;
				} else
					salario = salMes;
				System.out.println("------------------------------------------");
				System.out.printf("O sal�rio ficou em R$ %.2f reais.%n", salMes);

				System.out.println("Deseja continuar? 0 sim -1 sair");
				continuar = input.nextInt();
			}
			else if(opcao == 2) {
				System.out.print("Informe o total de horas trabalhadas: ");
				horasTrab = input.nextDouble();
				System.out.print("Informe o Sal�rio: ");
				salMes = input.nextDouble();
				if (horasTrab > 40) {
					calculo = (salMes * bonus) + salMes;
					salMes = calculo;
				} else
					salario = salMes;
				System.out.println("------------------------------------------");
				System.out.printf("O sal�rio ficou em R$ %.2f reais.%n", salMes);

				System.out.println("Deseja continuar? 0 sim -1 sair");
				continuar = input.nextInt();
			}
			else if(opcao == 3) {
				System.out.print("Informe o total de horas trabalhadas: ");
				horasTrab = input.nextDouble();
				System.out.print("Informe o Sal�rio: ");
				salMes = input.nextDouble();
				if (horasTrab > 40) {
					calculo = (salMes * bonus) + salMes;
					salMes = calculo;
				} else
					salario = salMes;
				System.out.println("------------------------------------------");
				System.out.printf("O sal�rio ficou em R$ %.2f reais.%n", salMes);

				System.out.println("Deseja continuar? 0 sim -1 sair");
				continuar = input.nextInt();
			}
			else
				if(opcao > 3)
				System.out.println("Funcion�rio n�o encontrado!");
				System.out.println("------------------------------------------");
		}

		input.close();
		System.out.println("Dados alterados com sucesso!!");
	}

}

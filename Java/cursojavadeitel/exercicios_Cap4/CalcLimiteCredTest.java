package cursojavadeitel.exercicios_Cap4;

import java.util.Scanner;

public class CalcLimiteCredTest {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// public CalcLimiteCred(int numConta, int totDebito, int totCredito, int
		// limiteCred, int saldoAtual)
		int pessoaNumConta;
		int pessoaTotDebito;
		int pessoaTotCredito;
		int pessoaLimiteCred;
		int pessoaSaldoAtual = 0;
		double pessoaLimiteCC = 0;
		int pessoaSaldoInicial = 0;

		System.out.println("------------------------------------------------------");
		System.out.println("======================================================");
		System.out.println(":               Informa��es da conta                 :");
		System.out.println("======================================================");
		System.out.println();
		System.out.print("Informe o n� da Conta: ");
		pessoaNumConta = input.nextInt();
		System.out.print("Informe o Saldo inicial da conta: ");
		pessoaSaldoInicial = input.nextInt();
		System.out.print("Qual o total de d�bito: ");
		pessoaTotDebito = input.nextInt();
		System.out.print("Qual o total de cr�dito: ");
		pessoaTotCredito = input.nextInt();
		System.out.print("Informe o Limite de cr�dito: ");
		pessoaLimiteCred = input.nextInt();

		CalcLimiteCred calcCred1 = new CalcLimiteCred(pessoaNumConta, pessoaTotDebito, pessoaTotCredito,
				pessoaLimiteCred, pessoaSaldoAtual, pessoaLimiteCC, pessoaSaldoInicial);

		// Chamando os M�todos
		calcCred1.LimiteCC();
		calcCred1.CalcLimite();
		calcCred1.CalcSaldo();

		// Imprime os valores.
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.println();
		System.out.printf("Saldo atual R$ %.2f reais.%n", calcCred1.getSaldoAtual());
		System.out.printf("Limite C/C R$ %.2f reais.%n", calcCred1.LimiteCC());
		System.out.println();
		System.out.println("------------------------------------------------------");
		System.out.printf("Saldo atual + limite C/C R$ %.2f reais.%n", calcCred1.CalcLimite());
		System.out.println("------------------------------------------------------");
		System.out.println();
		if (calcCred1.getSaldoAtual() > 0)
			System.out.println("Voc� ainda tem limite de compras!");
		else
			System.out.printf("Limite de Cr�dito excedido em R$ %.2f!%n", calcCred1.getSaldoAtual() * -1);

		input.close();
		System.out.println("------------------------------------------------------");
	}

}

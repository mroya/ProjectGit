package cursojavadeitel.exercicios_Cap4;

import java.util.Scanner;

public class CalcComissao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double venda;
		double fixoSemana = 200;
		double tot = 0;
		double comissao = 0.09;

		System.out.print("Informe o valor da venda ou -1 sair: ");
		venda = input.nextDouble();
		if (venda < 0)
			venda = 0;
		tot += venda;

		while (venda > 0) {
			System.out.print("Informe o valor da venda ou -1 sair: ");
			venda = input.nextDouble();
			if (venda < 0)
				venda = 0;
			tot += venda;
		}

		double receber = (tot * comissao) + fixoSemana;

		input.close();

		System.out.printf("O valor para receber é de R$ %.2f ", receber);

	}

}

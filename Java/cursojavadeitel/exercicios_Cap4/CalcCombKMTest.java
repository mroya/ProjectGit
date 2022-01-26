package cursojavadeitel.exercicios_Cap4;

import java.util.Scanner;

public class CalcCombKMTest {

	public static void main(String[] args) {

		// Classe Scanner
		Scanner input = new Scanner(System.in);

		// Inicialização das variáveis
		int controle = 0;
		int kmRodados = 0;
		int litrosComb = 0;
		double media = 0;
		double mediaTot = 0;
		int totKM = 0;
		int totComb = 0;
		
		
		// Fase de processamento
		System.out.println("****    Cálculo média consumo Combustível    ****");

		System.out.print("Informe os Km Rodados: ");
		kmRodados = input.nextInt();
		totKM += kmRodados;
		System.out.print("Informe os litros de Combustivel abastecido: ");
		litrosComb = input.nextInt();
		totComb += litrosComb;
		media = (double) kmRodados / litrosComb;
				

		// exibe o total e a média (com dois digitos de precisão)
		System.out.printf("%nTotal de %d Km Rodados e %d litros abastecidos.%n", kmRodados, litrosComb);
		System.out.printf("Consumo médio foi de %.2f KM/Litros%n", media);
		System.out.println();
		System.out.print("Quer continuar? 0 Continua ou -1 para sair ");
		controle = input.nextInt();
		System.out.println();
		
		// Faz o loop com o sentinela
		while (controle != -1) {

			System.out.print("Informe os Km Rodados: ");
			kmRodados = input.nextInt();
			totKM += kmRodados;
			System.out.print("Informe os litros de Combustivel abastecido: ");
			litrosComb = input.nextInt();
			totComb += litrosComb;
			System.out.println();
			media = (double) kmRodados / litrosComb;
			
			// exibe o total e a média (com dois digitos de precisão)
			System.out.printf("%nTotal de %d Km Rodados e %d litros abastecidos.%n", kmRodados, litrosComb);
			System.out.printf("Consumo médio foi de %.2f KM/Litros%n", media);
			System.out.println();
			System.out.print("Quer continuar? 0 Continua ou -1 para sair ");
			controle = input.nextInt();
		}
		System.out.println();
		System.out.printf("O total de KM Rodados foi %d Km%n", totKM);
		System.out.printf("O consumo total de gasolina foi %d Lts%n", totComb);
		
		mediaTot = (double) totKM / totComb;
		System.out.printf("A média do consumo total é de %.2f Km/Lts%n", mediaTot);
		System.out.println();
		System.out.println("***    Obrigado! Volte Sempre!    ***");

		input.close();

	}

}

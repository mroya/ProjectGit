package cursojavadeitel.exercicios_Cap6;

import java.util.Scanner;

public class taxaEstacionamentoTest {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe o total de Horas: ");
		double totalHoras = input.nextInt();
		
		taxaEstacionamento carro1 = new taxaEstacionamento(totalHoras);
		
		carro1.CalculateCharges(totalHoras);
		
		System.out.printf("O valor a pagar é de R$ %.2f%n", carro1.getVlrPagar());
		
		input.close();
				

	}

}

//Exercício 5.17: Calculando vendas
package cursojavadeitel.exercicios_Cap5;

import java.util.Scanner;

public class CalculandoVendas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int qt1 = 0;
		int qt2 = 0;
		int qt3 = 0;
		int qt4 = 0;
		int qt5 = 0;
		double total1 = 0;
		double total2 = 0;
		double total3 = 0;
		double total4 = 0;
		double total5 = 0;
		int continuar = 1;
		while (continuar == 1) {

			System.out.println("***** LISTA DE PRODUTOS *****");
			System.out.println("1. Lápis......R$ 2.98");
			System.out.println("2. Caneta.....R$ 4.50");
			System.out.println("3. Lapiseira..R$ 9.98");
			System.out.println("4. Compasso...R$ 4.49");
			System.out.println("5. Caderno....R$ 6.87");
			System.out.println("--------------------------------");
			System.out.print("Escolha o item para compra: ");
			int item = input.nextInt();
			switch (item) {
			case 1:
				System.out.println("Item: 1. Lápis - Preço R$ 2.98");
				System.out.print("Informe a quantidade: ");
				qt1 = input.nextInt();
				total1 = qt1 * 2.98;
				System.out.println("Item adicionado ao carrinho!");
				System.out.println("");
				System.out.println("Deseja continuar a comprar? 1 -sim 2-não ");
				continuar = input.nextInt();
				break;
			case 2:
				System.out.println("Item: 2. Caneta - Preço R$ 4.50");
				System.out.print("Informe a quantidade: ");
				qt2 = input.nextInt();
				total2 = qt2 * 4.50;
				System.out.println("Item adicionado ao carrinho!");
				System.out.println("");
				System.out.println("Deseja continuar a comprar? 1 -sim 2-não ");
				continuar = input.nextInt();
				break;
			case 3:
				System.out.println("Item: 3. Lapiseira - Preço R$ 9.98");
				System.out.print("Informe a quantidade: ");
				qt3 = input.nextInt();
				total3 = qt3 * 9.98;
				System.out.println("Item adicionado ao carrinho!");
				System.out.println("");
				System.out.println("Deseja continuar a comprar? 1 -sim 2-não ");
				continuar = input.nextInt();
				break;
			case 4:
				System.out.println("Item: 4. Compasso - Preço R$ 4.49");
				System.out.print("Informe a quantidade: ");
				qt4 = input.nextInt();
				total4 = qt4 * 4.49;
				System.out.println("Item adicionado ao carrinho!");
				System.out.println("");
				System.out.println("Deseja continuar a comprar? 1 -sim 2-não ");
				continuar = input.nextInt();
				break;
			case 5:
				System.out.println("Item: 5. Caderno - Preço R$ 6.87");
				System.out.print("Informe a quantidade: ");
				qt5 = input.nextInt();
				total5 = qt5 * 6.87;
				System.out.println("Item adicionado ao carrinho!");
				System.out.println("");
				System.out.println("Deseja continuar a comprar? 1 -sim 2-não ");
				continuar = input.nextInt();
				break;
			}
		}
		System.out.println();
		System.out.println("Descrição dos Itens:");
		System.out.println();
		System.out.printf("Item 1: Lápis.... qt %dun - Total %.2f%n", qt1, total1);
		System.out.printf("Item 2: Caneta....qt %dun - Total %.2f%n", qt2, total2);
		System.out.printf("Item 3: Lapiseira.qt %dun - Total %.2f%n", qt3, total3);
		System.out.printf("Item 4: Compasso..qt %dun - Total %.2f%n", qt4, total4);
		System.out.printf("Item 5: Caderno...qt %dun - Total %.2f%n", qt5, total5);
		System.out.println("--------------------------------------------------");
		double tgeral = total1+total2+total3+total4+total5; 
		System.out.printf("Total à pagar: R$ %.2f%n", tgeral);
		input.close();
		System.out.println("");
		System.out.println("Obrigado, Volte sempre!!!");
	}

}

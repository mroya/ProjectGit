package cursojavadeitel.exercicios_Cap4;

import java.util.Scanner;

public class comissaoSal {

	public static void main(String[] args) {
				
		// initializing base variables
		Scanner input = new Scanner(System.in);
		
		double commission = 0.09;
		double total = 0.0;
		double baseSalary = 200;
		
		// prompting user for first value or sentinel
		System.out.println("Please enter value of first item sold or -1 to quit");
		double sales = input.nextDouble();
		
		// adding value of sold items to running total
		while(sales > 0){
			total += sales;
			System.out.println("Please enter value of next item sold or -1 to quit");
			sales = input.nextDouble();
		}
			
		// calculating commission for salesperson
		double commissionSalary = total * commission;
		double earnings = baseSalary + commissionSalary;
		
		// displaying earnings of salesperson
		System.out.printf("Total earnings from week: %.2f", earnings);
				
		input.close();

	}

}

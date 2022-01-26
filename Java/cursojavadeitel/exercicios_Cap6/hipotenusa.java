package cursojavadeitel.exercicios_Cap6;

import java.util.Scanner;

public class hipotenusa {
	// instanciação das variáveis
	int catetoA;
	int catetoB;
	
	// Contrutor Cálculo Hipotenusa
	public void hipotenusaCalc() {
		Scanner input = new Scanner(System.in);
		System.out.println("*****    CÁLCULO DA HIPOTENUSA     *****");
		System.out.print("Informe o Cateto A: ");
		catetoA = input.nextInt(); 
		System.out.print("Informe o Cateto B: ");
		catetoB = input.nextInt();
		
		double hipotenusa = Math.hypot(catetoA, catetoB);
		
		System.out.printf("A hipotenusa é %.2f%n", hipotenusa);
		input.close();
	}
	
	// Métodos Get e Set
	public int getCatetoA() {
		return catetoA;
	}

	public void setCatetoA(int catetoA) {
		this.catetoA = catetoA;
	}

	public int getCatetoB() {
		return catetoB;
	}

	public void setCatetoB(int catetoB) {
		this.catetoB = catetoB;
	}
	
}

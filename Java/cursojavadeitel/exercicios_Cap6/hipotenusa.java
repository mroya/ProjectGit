package cursojavadeitel.exercicios_Cap6;

import java.util.Scanner;

public class hipotenusa {
	// instancia��o das vari�veis
	int catetoA;
	int catetoB;
	
	// Contrutor C�lculo Hipotenusa
	public void hipotenusaCalc() {
		Scanner input = new Scanner(System.in);
		System.out.println("*****    C�LCULO DA HIPOTENUSA     *****");
		System.out.print("Informe o Cateto A: ");
		catetoA = input.nextInt(); 
		System.out.print("Informe o Cateto B: ");
		catetoB = input.nextInt();
		
		double hipotenusa = Math.hypot(catetoA, catetoB);
		
		System.out.printf("A hipotenusa � %.2f%n", hipotenusa);
		input.close();
	}
	
	// M�todos Get e Set
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

//Figura 4.15: Increment.java
//Operadores de pr�-incremento e de p�s-incremento
package cursojavadeitel.Cap4;

public class Increment {

	public static void main(String[] args) {
		// demonstra o operador de p�s-incremento
		int c = 5;
		
		System.out.println("-------------------------------------------------");
		System.out.println("                  INICIAL C = 5                  ");
		System.out.println("-------------------------------------------------");
		System.out.println();
		System.out.printf("C antes do pos-INCREMENTO: %d%n", c); // imprime 5
		System.out.printf("C++ p�s-INCREMENTO: %d%n", c++);//imprime 5
		System.out.printf("C depois do p�s-INCREMENTO: %d%n", c); // imprime 6
		System.out.println("-------------------------------------------------");
		System.out.println();
		System.out.printf("C antes do pr�-INCREMENTO: %d%n", c); // imprime 6
		System.out.printf("++C pr�-INCREMENTO: %d%n", ++c);//imprime 7
		System.out.printf("C depois do pr�-INCREMENTO: %d%n", c); // imprime 7
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		System.out.printf("C antes do POS-DECREMENTO: %d%n", c); // imprime 7
		System.out.printf("C-- POS-DECREMENTO: %d%n", c--);//imprime 7
		System.out.printf("C depois do POS-DECREMENTO: %d%n", c); // imprime 6
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		System.out.printf("C antes do pr�-DECREMENTO: %d%n", c); // imprime 6
		System.out.printf("--C pr�-DECREMENTO: %d%n", --c);//imprime 5
		System.out.printf("C depois do pr�-DECREMENTO: %d%n", c); // imprime 5
		System.out.println();
		System.out.println("-------------------------------------------------");

	}
}
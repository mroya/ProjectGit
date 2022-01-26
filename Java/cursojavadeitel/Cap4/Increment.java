//Figura 4.15: Increment.java
//Operadores de pré-incremento e de pós-incremento
package cursojavadeitel.Cap4;

public class Increment {

	public static void main(String[] args) {
		// demonstra o operador de pós-incremento
		int c = 5;
		
		System.out.println("-------------------------------------------------");
		System.out.println("                  INICIAL C = 5                  ");
		System.out.println("-------------------------------------------------");
		System.out.println();
		System.out.printf("C antes do pos-INCREMENTO: %d%n", c); // imprime 5
		System.out.printf("C++ pós-INCREMENTO: %d%n", c++);//imprime 5
		System.out.printf("C depois do pós-INCREMENTO: %d%n", c); // imprime 6
		System.out.println("-------------------------------------------------");
		System.out.println();
		System.out.printf("C antes do pré-INCREMENTO: %d%n", c); // imprime 6
		System.out.printf("++C pré-INCREMENTO: %d%n", ++c);//imprime 7
		System.out.printf("C depois do pré-INCREMENTO: %d%n", c); // imprime 7
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		System.out.printf("C antes do POS-DECREMENTO: %d%n", c); // imprime 7
		System.out.printf("C-- POS-DECREMENTO: %d%n", c--);//imprime 7
		System.out.printf("C depois do POS-DECREMENTO: %d%n", c); // imprime 6
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();
		System.out.printf("C antes do pré-DECREMENTO: %d%n", c); // imprime 6
		System.out.printf("--C pré-DECREMENTO: %d%n", --c);//imprime 5
		System.out.printf("C depois do pré-DECREMENTO: %d%n", c); // imprime 5
		System.out.println();
		System.out.println("-------------------------------------------------");

	}
}
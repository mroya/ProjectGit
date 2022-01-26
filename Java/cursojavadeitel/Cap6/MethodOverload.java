//Figura 6.10: MethodOverload.java
// Declarações de métodos sobrecarregados
package cursojavadeitel.Cap6;

public class MethodOverload {

	// teste de métodos square sobrecarregados
	public static void main(String[] args) {
		System.out.printf("Square of integer 7 is %d%n", square(7));
		System.out.printf("Square od double 7.5 is %.2f%n", square(7.5));

	}
	
	// Método square com argumento de int
	public static int square(int intValue) {
		System.out.printf("%nCalled square with int argument: %d%n", intValue);
		return intValue * intValue;
	}
	
	// Método square com argumento double
	public static double square(double doubleValue) {
		System.out.printf("%nCalled square with double argument: %.2f%n", doubleValue);
		return doubleValue * doubleValue;
	}

} // fim da classe MethodOverload

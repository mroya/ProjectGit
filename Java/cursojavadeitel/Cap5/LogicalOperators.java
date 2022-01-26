// Figura 5.19: LogicalOperators.java
// Operadores lógicos
package cursojavadeitel.Cap5;

public class LogicalOperators {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Cria a tabela-verdade para o operador && (E condicional)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Conditional AND (&&)", "false && false",
				(false && false), "false && true", (false && true), "true && false", (true && false), "true && true",
				(true && true));

		// Cria a tabela-verdade para o operador || (ou Condicional)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Conditional OR (||)", "false || false",
				(false || false), "false || true", (false || true), "true || false", (true || false), "true || true",
				(true || true));

		// Cria a tabela-verdade para o operador & (E lógico Booleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Boolean logical AND (&)", "false & false",
				(false & false), "false & true", (false & true), "true & false", (false & true), "true & true",
				(false & true));

		// Cria a tabela-verdade para o operador | (OU inclusivo lógico booleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Boolean logical inclusive OR(|)", "false | false",
				(false | false), "false | true", (false | true), "true | false", (true | false), "true | true",
				(true | true));

		// Cria a tabela-verdade para o operador ^ (OU exclusivo lógico boleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Boolean logical exclusive OR (^)", "false ^ false",
				(false ^ false), "false ^ true", (false ^ true), "true ^ false", (true ^ false), "true ^ true",
				(true ^ true));

		// Cria a tabela-verdade para o operador ! (negação lógica)
		System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)", "!false", (!false), "!true", (!true));
	}

}// fim da classe LogicalOperators

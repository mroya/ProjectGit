// Figura 5.19: LogicalOperators.java
// Operadores l�gicos
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

		// Cria a tabela-verdade para o operador & (E l�gico Booleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Boolean logical AND (&)", "false & false",
				(false & false), "false & true", (false & true), "true & false", (false & true), "true & true",
				(false & true));

		// Cria a tabela-verdade para o operador | (OU inclusivo l�gico booleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Boolean logical inclusive OR(|)", "false | false",
				(false | false), "false | true", (false | true), "true | false", (true | false), "true | true",
				(true | true));

		// Cria a tabela-verdade para o operador ^ (OU exclusivo l�gico boleano)
		System.out.printf("%s%n%s: %b%n%s: %b%n%s: %b%n%s: %b%n%n", "Boolean logical exclusive OR (^)", "false ^ false",
				(false ^ false), "false ^ true", (false ^ true), "true ^ false", (true ^ false), "true ^ true",
				(true ^ true));

		// Cria a tabela-verdade para o operador ! (nega��o l�gica)
		System.out.printf("%s%n%s: %b%n%s: %b%n", "Logical NOT (!)", "!false", (!false), "!true", (!true));
	}

}// fim da classe LogicalOperators

// Figura 3.8: Account.java
// Classe Account que contém uma variável de instância balance do tipo
// double e um contrutor e método deposit que executa a validação;

package cursojavadeitel.Cap3;

public class Account {

	// variável de instância
	private String name;
	private double balance;

	// Contrutor de Account que recebe dois parâmetros
	public Account(String name, double balance) {
		this.name = name; // Atribui name à variável de intância name

		// Valida que o balance é maior que 0.0; se não for,
		// a variável de instância balance mantém seu valor inicial padrão 0.0
		if (balance > 0.0) // se o saldo for válido
			this.balance = balance; // o atribui à variável de instância balance
	}

	// Método que deposita (adiciona) apenas uma quantia válida no saldo
	public void deposit(double depositAmount) {

		if (depositAmount > 0.0) // se depositAmount for válido
			balance += depositAmount; // o adiciona ao saldo
	}
	
	// Método que debita do Account
	public void debit(double saque) {
		
		if(balance - saque > 0.0) // se o saldo for válido
			balance = balance - saque; // retira do saldo
	}
	
	//Método display account
	public void displayAccount() {
		System.out.printf("%s balance: $%.2f %n", getName(), getBalance());
    }
	
	// Método retorna o saldo da conta
	public double getBalance() {
		return balance;
	}

	// Método para definir o nome no objeto
	public void setName(String name) {
		this.name = name;
	}

	// Método para recuperar o nome do objeto
	public String getName() {
		return name;
	} // fim método getName
} // fim da classe Account

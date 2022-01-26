// Figura 3.8: Account.java
// Classe Account que cont�m uma vari�vel de inst�ncia balance do tipo
// double e um contrutor e m�todo deposit que executa a valida��o;

package cursojavadeitel.Cap3;

public class Account {

	// vari�vel de inst�ncia
	private String name;
	private double balance;

	// Contrutor de Account que recebe dois par�metros
	public Account(String name, double balance) {
		this.name = name; // Atribui name � vari�vel de int�ncia name

		// Valida que o balance � maior que 0.0; se n�o for,
		// a vari�vel de inst�ncia balance mant�m seu valor inicial padr�o 0.0
		if (balance > 0.0) // se o saldo for v�lido
			this.balance = balance; // o atribui � vari�vel de inst�ncia balance
	}

	// M�todo que deposita (adiciona) apenas uma quantia v�lida no saldo
	public void deposit(double depositAmount) {

		if (depositAmount > 0.0) // se depositAmount for v�lido
			balance += depositAmount; // o adiciona ao saldo
	}
	
	// M�todo que debita do Account
	public void debit(double saque) {
		
		if(balance - saque > 0.0) // se o saldo for v�lido
			balance = balance - saque; // retira do saldo
	}
	
	//M�todo display account
	public void displayAccount() {
		System.out.printf("%s balance: $%.2f %n", getName(), getBalance());
    }
	
	// M�todo retorna o saldo da conta
	public double getBalance() {
		return balance;
	}

	// M�todo para definir o nome no objeto
	public void setName(String name) {
		this.name = name;
	}

	// M�todo para recuperar o nome do objeto
	public String getName() {
		return name;
	} // fim m�todo getName
} // fim da classe Account

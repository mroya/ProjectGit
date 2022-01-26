// Figura 5.11: AutoPolicy.java
// Classe que representa uma apólice de seguro de automóvel.
package cursojavadeitel.Cap5;

public class AutoPolicy {

	// Variáveis de Instância
	private int accountNumber; // número da conta da apólice
	private String makeAndModel; // carro ao qual a apólice é aplicada
	private String state; // abreviatura do estado com duas letras

	// Construtor Padrão
	public AutoPolicy(int accountNumber, String makeAndModel, String state) {
		this.accountNumber = accountNumber;
		this.makeAndModel = makeAndModel;
		this.state = state;
	}

	// define o accountNumber
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	// retorna o accountNumber
	public int getAccoutNumber() {
		return accountNumber;
	}

	// configura o makeAndModel
	public void setMakeAndModel(String makeAndModel) {
		this.makeAndModel = makeAndModel;
	}

	// retorna o makeAndModel
	public String getMakeAndModel() {
		return makeAndModel;
	}

	// define o estado
	public void setState(String state) {
		this.state = state;
	}

	// retorna o estado
	public String getState() {
		return state;
	}

	// Método predicado é retornado se o estado tem seguros "sem culpa"
	public boolean isNoFaultState() {
		boolean noFaultState;
		// determina se o estado tem seguros de automóvel "sem culpa"
		switch (getState()) { // obtem a abreviatura do estado do objeto AutoPolicy
		case "MA":
		case "NJ":
		case "NY":
		case "PA":
			noFaultState = true;
			break;
		default:
			noFaultState = false;
			break;
		}
		return noFaultState;
	}

} // fim da classe AutoPolicy

package cursojavadeitel.exercicios_Cap4;

public class CalcLimiteCred {

	// Instânciação das variáveis
	private int numConta;
	private int totDebito;
	private int totCredito;
	private double limiteCred;
	private double saldoAtual;
	private double limiteCC = 0;
	private int saldoInicial = 0;

	// Construtor padrão
	public CalcLimiteCred(int numConta, int totDebito, int totCredito, double limiteCred, double saldoAtual,
			double limiteCC, int saldoInicial) {
		this.numConta = numConta;
		this.totDebito = totDebito;
		this.totCredito = totCredito;
		this.limiteCred = limiteCred;
		this.saldoAtual = saldoAtual;
		this.limiteCC = limiteCC;
		this.saldoInicial = saldoInicial;
	}

	// Método Set
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public void setTotDebito(int totDebito) {
		this.totDebito = totDebito;
	}

	public void setTotCredito(int totCredito) {
		this.totCredito = totCredito;
	}

	public void setLimiteCredito(double limiteCred) {
		this.limiteCred = limiteCred;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public void setLimiteCC(double limiteCC) {
		this.limiteCC = limiteCC;
	}

	public void setSaldoInicial(int saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	// Método Get
	public int getNumConta() {
		return this.numConta;
	}

	public int getTotDebito() {
		return this.totDebito;
	}

	public int getTotCredito() {
		return this.totCredito;
	}

	public double getLimiteCred() {
		return this.limiteCred;
	}

	public double getSaldoAtual() {
		return this.saldoAtual;
	}

	public double getLimiteCC() {
		return this.limiteCC;
	}

	public int getSaldoInicial() {
		return this.saldoInicial;
	}

	// Método Calculo Saldo
	public double CalcSaldo() {
		saldoAtual = (double) (saldoInicial - totDebito) + totCredito;
		return saldoAtual;
	}

	// Método Calculo Limite Crédito restante
	public double CalcLimite() {
		limiteCred = (double)getLimiteCC() + getSaldoAtual();
		return limiteCred;
	}

	// Método dados Limite
	public double LimiteCC() {
		limiteCC = getLimiteCred();
		return limiteCC;
	}

} // Fim classe CalcLimiteCred

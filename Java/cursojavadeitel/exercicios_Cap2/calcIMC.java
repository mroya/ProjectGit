package cursojavadeitel.exercicios_Cap2;

public class calcIMC {

	// Vari�veis de Inst�ncia
	private String nome;
	private String sobrenome;
	int anoNasc;
	int anoAtual;
	double peso;
	double altura;

	int idadeAtual;
	double imc;
	String tabelaIMC;

	// Contrutor Padr�o
	public calcIMC(String nome, String sobrenome, int anoNasc, int anoAtual, double peso, double altura) {

		this.nome = nome;
		this.sobrenome = sobrenome;
		this.anoNasc = anoNasc;
		this.anoAtual = anoAtual;
		this.peso = peso;
		this.altura = altura;

	}

	// M�todos Set
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setIdadeAtual(int idadeAtual) {
		this.idadeAtual = idadeAtual;
	}

	public void setIMC(double imc) {
		this.imc = imc;
	}

	public void setTabelaIMC(String tabelaIMC) {
		this.tabelaIMC = tabelaIMC;
	}

	// M�todo Get
	public String getNome() {
		return this.nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public int getAnoNasc() {
		return this.anoNasc;
	}

	public int getAnoAtual() {
		return this.anoAtual;
	}

	public double getPeso() {
		return this.peso;
	}

	public double getAltura() {
		return this.altura;
	}

	public int getIdadeAtual() {
		return this.idadeAtual;
	}

	public double getIMC() {
		return this.imc;
	}

	public String getTabelaIMC() {
		return this.tabelaIMC;
	}

	// M�todo C�lculo Idade
	public int CalcIdade() {
		this.idadeAtual = this.anoNasc - this.anoAtual;
		return idadeAtual;
	}

	// M�todo C�lculo IMC
	public double CalcIMC() {
		this.imc = this.peso / (Math.pow(altura, 2));
		return imc;
	}
	
	// M�todo que imprime a tabela IMC
	public String letterTab() {
		String letterTab = "";
		if (getIMC() < 18.5)
			letterTab = "Paciente Abaixo do Peso!";
		else if (getIMC() >= 18.5 && getIMC() <= 24.9)
			letterTab = "Paciente com Peso Normal!";
		else if (getIMC() >= 25 && getIMC() <= 29.9)
			letterTab = "Paciente Acima do Peso!";
		else {
			letterTab = "Cuidado! Paciente Obeso!";
		}
		return letterTab;
	}
}// Fim Classe calcIMC

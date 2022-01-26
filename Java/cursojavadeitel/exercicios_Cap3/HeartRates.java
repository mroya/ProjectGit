package cursojavadeitel.exercicios_Cap3;

public class HeartRates {

	// Variáveis de Instância
	private String nome;
	private String sobrenome;
	private int anoNasc;
	private int mesNasc;
	private int diaNasc;
	private int anoAtual;
	
	private int idade;
	private int fcm;
	private double fca1, fca2;

	// Contrutor
	public HeartRates(String nome, String sobrenome, int anoNasc, int mesNasc, int diaNasc, int anoAtual) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.anoNasc = anoNasc;
		this.mesNasc = mesNasc;
		this.diaNasc = diaNasc;
		this.anoAtual = anoAtual;
	}

	// Método Set
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public void setMesNasc(int mesNasc) {
		this.mesNasc = mesNasc;
	}

	public void setDiaNasc(int diaNasc) {
		this.diaNasc = diaNasc;
	}
	
	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}
	
	public void setFca1(double fca1 ) {
		this.fca1 = fca1;
	}
	
	public void setFca2(double fca2 ) {
		this.fca2 = fca2;
	}

	// Método Get
	public String getNome() {
		return this.nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public int getAnoNasc() {
		return this.anoNasc;
	}

	public int getMesNasc() {
		return this.mesNasc;
	}

	public int getDiaNasc() {
		return this.diaNasc;
	}
	
	public int getAnoAtual() {
		return this.anoAtual;
	}
	
	public double getFca1() {
		return this.fca1;
	}
	
	public double getFca2() {
		return this.fca2;
	}

	// Método calcular idade em anos
	public int CalculaIdade() {
		
		this.idade = this.anoAtual - this.anoNasc;
		
		return idade;
	}

	// Método para Calcular Frequência Cardíaca Máxima
	public int HeartRatesMax() {
		
		this.fcm = 220 - idade;
		return fcm;
	}
	
	// Método para calcular Frequência Cardíaca Alvo
	public void HeartRatesFCA() {
		
		this.fca1 = this.fcm * 0.50;
		this.fca2 = this.fcm * 0.85;
	}
	
}

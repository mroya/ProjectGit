package cursojavadeitel.exercicios_Cap3;

public class HealthProfile {

	// Variáveis de Instância
	private String nome;
	private String sobrenome;
	private String sexo;
	private int mesNasc;
	private int diaNasc;
	private int anoNasc;
	private int anoAtual;
	private double altura;
	private double peso;

	private int idade;
	private int fcm;
	private double fca1;
	private double fca2;
	private double imc;

	// Construtor Padrão
	public HealthProfile(String nome, String sobrenome, String sexo, int mesNasc, int diaNasc, int anoNasc, int anoAtual,
			double altura, double peso) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.sexo = sexo;
		this.mesNasc = mesNasc;
		this.diaNasc = diaNasc;
		this.anoNasc = anoNasc;
		this.anoAtual = anoAtual;
		this.altura = altura;
		this.peso = peso;
	}

	// Métodos Set
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public void setMesNasc(int mesNasc) {
		this.mesNasc = mesNasc;
	}

	public void setDiaNasc(int diaNasc) {
		this.diaNasc = diaNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}

	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void setFCA1(double fca1) {
		this.fca1 = fca1;
	}
	
	public void setFCA2(double fca2) {
		this.fca2 = fca2;
	}

	// Método Get
	public String getNome() {
		return this.nome;
	}

	public String getSobrenome() {
		return this.sobrenome;
	}

	public String getSexo() {
		return this.sexo;
	}

	public int getMesNasc() {
		return this.mesNasc;
	}

	public int getDiaNasc() {
		return this.diaNasc;
	}

	public int getAnoNasc() {
		return this.anoNasc;
	}

	public int getAnoAtual() {
		return this.anoAtual;
	}

	public double getAltura() {
		return this.altura;
	}

	public double getPeso() {
		return this.peso;
	}
	
	public double getFCA1() {
		return this.fca1;
	}
	
	public double getFCA2() {
		return this.fca2;
	}

	// Método Cálculo idade
	public int calculoIdade() {
		this.idade = this.anoAtual - this.anoNasc;
		return idade;
	}

	// Método Cálculo Frequência Cardíaca máxima FCM
	public double calculoFCM() {
		this.fcm = 220 - idade;
		return fcm;
	}

	// Método Cálculo Frequência Cardíaca Alvo FCA
	public void calculoFCA() {
		this.fca1 = this.fcm * 0.50;
		this.fca2 = this.fcm * 0.85;
	}

	// Método Cálculo IMC
	public double calculoIMC() {
		this.imc = this.peso / (Math.pow(this.altura, 2));
		if (this.imc < 18.5)
			System.out.println("O paciente está ABAIXO DO PESO!");
		if (this.imc <= 18.5 && imc < 25)
			System.out.println("O paciente está com PESO IDEAL!");
		if (this.imc <= 25 && imc < 30)
			System.out.println("O paciente está com SOBREPESO!");
		if (this.imc <= 30 && imc < 40)
			System.out.println("O paciente está com status de OBESIDADE!");
		if (this.imc >= 40)
			System.out.println("O paciente está com status de OBESIDADE MÓRBIDA, Cuidado!!");
		return imc;
	}
		
}

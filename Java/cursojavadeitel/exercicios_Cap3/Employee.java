package cursojavadeitel.exercicios_Cap3;

public class Employee {
	
	//Declara��o das vari�veis
	String nome, sobrenome;
	double salarioMes;
	
	// Contrutor padr�o
	public Employee(String nome, String sobrenome, double salarioMes) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMes = salarioMes;
	}
	
	//M�todos Get
	public String getNome() {
		return this.nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public double getSalarioMes() {
		return this.salarioMes;
	}
	
	//M�todos Set
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setSalarioMes(double salarioMes) {
		this.salarioMes = salarioMes;
	}
	
	// M�todo calcular valor sal�rio anual
	public double salarioAnual() {
		return salarioMes * 12;
	}
	
	// M�todo aumento 10%
	public double aumento10() {
		return salarioMes = (salarioMes * 0.10)+salarioMes;
	}
	

} // fim classe Employee

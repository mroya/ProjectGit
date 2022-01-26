package cursojavadeitel.exercicios_Cap3;

public class Employee {
	
	//Declaração das variáveis
	String nome, sobrenome;
	double salarioMes;
	
	// Contrutor padrão
	public Employee(String nome, String sobrenome, double salarioMes) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.salarioMes = salarioMes;
	}
	
	//Métodos Get
	public String getNome() {
		return this.nome;
	}
	
	public String getSobrenome() {
		return this.sobrenome;
	}
	
	public double getSalarioMes() {
		return this.salarioMes;
	}
	
	//Métodos Set
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setSalarioMes(double salarioMes) {
		this.salarioMes = salarioMes;
	}
	
	// Método calcular valor salário anual
	public double salarioAnual() {
		return salarioMes * 12;
	}
	
	// Método aumento 10%
	public double aumento10() {
		return salarioMes = (salarioMes * 0.10)+salarioMes;
	}
	

} // fim classe Employee

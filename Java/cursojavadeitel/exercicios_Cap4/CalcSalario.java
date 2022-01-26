package cursojavadeitel.exercicios_Cap4;

public class CalcSalario {
	
	//Variáveis de Instância
	private String nomeFuncionario;
	private double horasTrab;
	private double salario;
	private double bonus = 0.50;
	private double total;
	
	//Construtor Padrão
	public CalcSalario(String nomeFuncionario, double horasTrab, double salario, double total) {
		this.nomeFuncionario = nomeFuncionario;
		this.horasTrab = horasTrab;
		this.salario = salario;
		this.total = total;
	}
	
	// Método Set
	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}
	public void setHorasTrab(double horasTrab) {
		this.horasTrab = horasTrab;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	
	// Método Get
	public String getNomeFuncionario(){
		return this.nomeFuncionario;
	}
	public double getHorasTrab() {
		return this.horasTrab;
	}
	public double getSalario() {
		return this.salario;
	}
	public double getTotal() {
		return this.total;
	}
	
	// Método exibe dados
	public void imprimir() {
		System.out.println();
	}
	
	// Método calculo salario
	public double Receber() {
		if (horasTrab > 40)
			total = (salario * bonus) + salario;
		else
			total = salario;
		return total;
	}

}

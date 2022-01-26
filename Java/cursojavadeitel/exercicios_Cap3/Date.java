package cursojavadeitel.exercicios_Cap3;

public class Date {

	// Variaveis de Instância
	int mes, dia, ano;

	// Contrutor padrão
	public Date(int mes, int dia, int ano) {
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	// Método Get
	public int getMes() {
		return this.mes;
	}

	public int getDia() {
		return this.dia;
	}

	public int getAno() {
		return this.ano;
	}

	// Método Set

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	// Método displayDate
	public void displayDate() {
		System.out.printf("%d / %d / %d%n", getMes(), getDia(), getAno());
	}

}

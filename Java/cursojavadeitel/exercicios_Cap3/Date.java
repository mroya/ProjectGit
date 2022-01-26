package cursojavadeitel.exercicios_Cap3;

public class Date {

	// Variaveis de Inst�ncia
	int mes, dia, ano;

	// Contrutor padr�o
	public Date(int mes, int dia, int ano) {
		this.mes = mes;
		this.dia = dia;
		this.ano = ano;
	}

	// M�todo Get
	public int getMes() {
		return this.mes;
	}

	public int getDia() {
		return this.dia;
	}

	public int getAno() {
		return this.ano;
	}

	// M�todo Set

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	// M�todo displayDate
	public void displayDate() {
		System.out.printf("%d / %d / %d%n", getMes(), getDia(), getAno());
	}

}

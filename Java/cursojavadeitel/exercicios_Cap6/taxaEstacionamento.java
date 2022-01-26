package cursojavadeitel.exercicios_Cap6;

public class taxaEstacionamento {

	// Variáveis de instância
	private static double horaAdicional = 0.5;
	private static double horaNormal = 2.00;
	private static double diaria = 10.00;
	private double totalHoras;
	private static double vlrPagar;

	// Sobrecarga Construtor
	public taxaEstacionamento(double totalHoras) {
		this.totalHoras = totalHoras;
	}

	// Construtor padrão
	public taxaEstacionamento(double horaAdicional, double horaNormal, double diaria, double vlrPagar) {

		taxaEstacionamento.horaAdicional = horaAdicional;
		taxaEstacionamento.horaNormal = horaNormal;
		taxaEstacionamento.diaria = diaria;
		taxaEstacionamento.vlrPagar = vlrPagar;
	}

	// Método Set
	public void setHoraAdicional(double horaAdicional) {
		taxaEstacionamento.horaAdicional = horaAdicional;
	}

	public void setHoraNormal(double horaNormal) {
		taxaEstacionamento.horaNormal = horaNormal;
	}

	public void setDiaria(double diaria) {
		taxaEstacionamento.diaria = diaria;
	}

	public void setTotalHoras(double totalHoras) {
		this.totalHoras = totalHoras;
	}

	public void setValorPagar(double vlrPagar) {
		taxaEstacionamento.vlrPagar = vlrPagar;
	}

	// Método Get
	public double getHoraAdicional() {
		return taxaEstacionamento.horaAdicional;
	}

	public double getHoraNormal() {
		return taxaEstacionamento.horaNormal;
	}

	public double getDiaria() {
		return taxaEstacionamento.diaria;
	}

	public double getTotalHoras() {
		return this.totalHoras;
	}

	public double getVlrPagar() {
		return taxaEstacionamento.vlrPagar;
	}

	// Método CalculateCharges
	public static void CalculateCharges(double totalHoras) {

		if (totalHoras <= 3) {
			vlrPagar = horaNormal;
		} else if (totalHoras > 3 & totalHoras <= 23) {
			vlrPagar = ((totalHoras - 3) * horaAdicional) + horaNormal;
		} else {
			vlrPagar = diaria;
		}

	}

}

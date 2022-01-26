package cursojavadeitel.exercicios_Cap3;

public class DateTest {

	public static void main(String[] args) {

		// Inicializando os dados
		Date data = new Date(07, 27, 2021);

		data.displayDate();
		
		data.setDia(27);
		data.setMes(07);
		data.setAno(2021);
		
		data.displayDate();
	}// fim método main

}// fim classe DateTest


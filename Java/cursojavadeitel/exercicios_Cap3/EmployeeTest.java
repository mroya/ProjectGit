package cursojavadeitel.exercicios_Cap3;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee1 = new Employee("M�rcio", "Roya", 6000.00);

		System.out.printf("Nome %s %s Sal�rio M�s %.2f\n", employee1.getNome(), employee1.getSobrenome(),
				employee1.getSalarioMes());
		System.out.printf("Seu sal�rio anual � de R$%.2f\n", employee1.salarioAnual());
		System.out.printf("Voc� teve um aumento de sal�rio ficando %.2f", employee1.aumento10());
		
	}// fim m�todo main

}// fim classe EmployeeTest

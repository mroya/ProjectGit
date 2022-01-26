package cursojavadeitel.exercicios_Cap3;

public class EmployeeTest {

	public static void main(String[] args) {

		Employee employee1 = new Employee("Márcio", "Roya", 6000.00);

		System.out.printf("Nome %s %s Salário Mês %.2f\n", employee1.getNome(), employee1.getSobrenome(),
				employee1.getSalarioMes());
		System.out.printf("Seu salário anual é de R$%.2f\n", employee1.salarioAnual());
		System.out.printf("Você teve um aumento de salário ficando %.2f", employee1.aumento10());
		
	}// fim método main

}// fim classe EmployeeTest

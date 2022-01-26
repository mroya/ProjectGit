// Figura 4.4: Student.Java
// Classe Student que armazena o nome e a média de um aluno
package cursojavadeitel.Cap4;

public class Student {
	
	// Variáveis de Instância
	private String name;
	private double average;
	
	// Construtor inicializa variáveis de Instância
	public Student(String name, double average) {
		
		this.name = name;
		
		// valida que a média é > 0.0 e <= 100.0; caso contrário,
		// armazena o valor padrão da média da variável de instância (0.0)
		if (average > 0.0)
			if (average <= 100.00)
				this.average = average; // atribui à variável de instância
	}
	
	// Método Set - define o nome de Student 
	public void setName(String name) {
		this.name = name;
	}
	
	// Método Get - recupera o nome de Student
	public String getName() {
		return name;
	}
	
	// Método Set - define a média de Student
	public void setAverage(double studentAverage, double average) {
		// Valida que a média é > 0.0 e <= 100.0; caso contrário,
		// armazena o valor atual da média da variável de instância.
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average; // atribui à variável de instância
	}
	
	// Método Get - recupera a média de student
	public double getAverage() {
		return average;
	}
	
	// Método Get - determina e retorna a letra da nota de Student
	public String getLetterGrade() {
		String letterGrade = ""; // inicializando como uma String vazia
		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80.0)
			letterGrade = "B";
		else if (average >= 70.0)
			letterGrade = "C";
		else if (average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";
		
		return letterGrade;
	}
} // Finaliza a classe Student 

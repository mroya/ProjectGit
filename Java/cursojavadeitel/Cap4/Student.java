// Figura 4.4: Student.Java
// Classe Student que armazena o nome e a m�dia de um aluno
package cursojavadeitel.Cap4;

public class Student {
	
	// Vari�veis de Inst�ncia
	private String name;
	private double average;
	
	// Construtor inicializa vari�veis de Inst�ncia
	public Student(String name, double average) {
		
		this.name = name;
		
		// valida que a m�dia � > 0.0 e <= 100.0; caso contr�rio,
		// armazena o valor padr�o da m�dia da vari�vel de inst�ncia (0.0)
		if (average > 0.0)
			if (average <= 100.00)
				this.average = average; // atribui � vari�vel de inst�ncia
	}
	
	// M�todo Set - define o nome de Student 
	public void setName(String name) {
		this.name = name;
	}
	
	// M�todo Get - recupera o nome de Student
	public String getName() {
		return name;
	}
	
	// M�todo Set - define a m�dia de Student
	public void setAverage(double studentAverage, double average) {
		// Valida que a m�dia � > 0.0 e <= 100.0; caso contr�rio,
		// armazena o valor atual da m�dia da vari�vel de inst�ncia.
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average; // atribui � vari�vel de inst�ncia
	}
	
	// M�todo Get - recupera a m�dia de student
	public double getAverage() {
		return average;
	}
	
	// M�todo Get - determina e retorna a letra da nota de Student
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

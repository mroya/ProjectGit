package cursojavadeitel.exercicios_Cap4;

public class CalcCombKM {
	
	// Variáveis de Instância
	private String Nome;
	private int litros;
	private int kmRodados;
	
	
	@SuppressWarnings("unused")
	private int media;
		
	// Construtor padrão
	public CalcCombKM(String nome, int litros, int kmRodados) {
		this.Nome = nome;
		this.litros = litros;
		this.kmRodados = kmRodados;		
	}
	
	// Métodos Get
	public String getNome() {
		return this.Nome;
	}
	
	public int getLitros() {
		return this.litros;
	}
	
	public int getkmRodados() {
		return this.kmRodados;
	}
	
	public int getMedia() {
		return this.media;
	}
	
	// Métodos Set
	public void setNome(String nome) {
		this.Nome = nome;
	}
	
	public void setLitros(int litros) {
		this.litros = litros;
	}
	
	public void setKmRodados(int kmRodados) {
		this.kmRodados = kmRodados;
	}
	
	//Métodos calcular média
	public int CalcCombs() {
		media = kmRodados / litros;
		return media;
	}
	
	// Método questionário consumo
	public void pergunta(int kmRodados, int litros) {
		System.out.printf("%nTotal de %d Km Rodados e %d litros abastecidos.%n", kmRodados, litros);
		System.out.printf("Consumo médio foi de %.2f KM/Litros%n", media);
		System.out.println();
		
	}

}

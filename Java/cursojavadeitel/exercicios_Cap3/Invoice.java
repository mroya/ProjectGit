package cursojavadeitel.exercicios_Cap3;

public class Invoice {

	String item, descricao;
	int quantidade;
	double preco, total;

	// Contrutor
	public Invoice(String item, String descricao, int quantidade, double preco) {
		this.item = item;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}

	// Método SET
	public void setNumero(String item) {
		this.item = item;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	// Método GET
	public String getItem() {
		return this.item;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public int getQuantidade() {
		return this.quantidade;
	}

	public double getPreco() {
		return this.preco;
	}

	public double getInvoiceAmount() {
		return quantidade * preco;
	}

}

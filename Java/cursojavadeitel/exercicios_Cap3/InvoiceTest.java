package cursojavadeitel.exercicios_Cap3;

public class InvoiceTest {

	public static void main(String[] args) {

		Invoice invoice1 = new Invoice("1", "Mouse USB", 10, 19.90);

		System.out.printf("Item %s - %s \nQuantidade: %d \nPreço: %.2f \nTotal a pagar: %.2f",
				invoice1.getItem(), invoice1.getDescricao(), invoice1.getQuantidade(), invoice1.getPreco(),
				invoice1.getInvoiceAmount());

	}

}

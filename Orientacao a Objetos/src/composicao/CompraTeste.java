package composicao;

public class CompraTeste {
	public static void main(String[] args) {
		Compra c1 = new Compra();
		c1.cliente = "João Pedro";
		c1.addItem("Caneta", 20, 7.45);
		c1.addItem("Borracha", 12, 3.89);
		c1.addItem("Caderno", 3, 18.79);
		
		System.out.println("Quantos itens diferentes tem no carrinho? " + c1.itens.size());
		System.out.println("O valor total da compra foi: " + c1.getValorCompra());
	}
}
package desafios.composicao;

public class ClienteTeste {
	public static void main(String[] args) {
		Cliente cliente = new Cliente("Maria Júlia Moraes");
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 9.67, 100);
		compra1.adicionarItem(new Produto("Notebook", 1897.88), 2);
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 998.90), 1);
		
		cliente.adicionarCompra(compra1);
		cliente.adicionarCompra(compra2);
		
		System.out.println("A cliente " + cliente.nome + " comprou um total de R$" + cliente.obterValorTotal());
		
	}
}
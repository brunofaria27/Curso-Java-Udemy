package teste.umparamuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umparamuitos.Pedido;
import modelo.umparamuitos.itemPedido;

public class NovoPedido {
	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		
		Produto produto = new Produto("Geladeira", 2789.99);
		Pedido pedido = new Pedido();
		itemPedido item = new itemPedido(pedido, produto, 10);
		
		dao.abrirT()
			.incluir(produto)
			.incluir(pedido)
			.incluir(item)
			.fecharT()
			.fechar();
	}
}

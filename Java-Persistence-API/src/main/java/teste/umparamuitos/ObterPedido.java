package teste.umparamuitos;

import infra.DAO;
import modelo.umparamuitos.Pedido;
import modelo.umparamuitos.itemPedido;

public class ObterPedido {
	public static void main(String[] args) {
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		
		Pedido pedido = dao.obterPorID(1L);
		
		for(itemPedido item: pedido.getItens()) {
			System.out.println("Quantidade de itens: " + item.getQuantidade());
			System.out.println("Nome do produto: " + item.getProduto().getNome());
		}
		
		dao.fechar();
		
	}
}

package desafios.composicao;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	final String nome;
	final List<Compra> compras = new ArrayList<>();	// Relação de cliente com compra
	
	Cliente(String nome) {
		this.nome = nome;
	}
	
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compraAtual: compras) {
			total += compraAtual.obterValorTotal();
		}
		
		return total;
	}
	
}
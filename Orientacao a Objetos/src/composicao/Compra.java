package composicao;

import java.util.ArrayList;

public class Compra {
	String cliente;
	ArrayList<Item> itens = new ArrayList<>();
	
	void addItem(Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	void addItem(String nome, int quantidade, double preco) {
		this.addItem(new Item(nome, quantidade, preco));
	}
	
	double getValorCompra() {
		double total = 0;
		
		for(Item item: itens) {
				total += item.quantidade * item.preco;
		}
		
		return total;
	}
}

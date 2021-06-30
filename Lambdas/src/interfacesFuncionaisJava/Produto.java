package interfacesFuncionaisJava;

public class Produto {
	public final String nome;
	public final double preco;
	public final double desconto;
	
	public Produto(String nome, double preco, double desconto) {
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precoDesconto = preco * (1 - desconto);
		return "Produto: " + nome + " tem preço de R$" + precoDesconto;
	}
}

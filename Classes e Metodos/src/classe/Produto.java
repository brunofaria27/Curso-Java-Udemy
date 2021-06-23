package classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;	// ENTRE 0 e 1
	
	// Metódos
	Produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	Produto() {
		
	}
	
	// Pode ter nomes igual com parametros diferentes
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - (desconto + descontoDoGerente));
	}
	
}
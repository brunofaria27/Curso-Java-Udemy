package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto celular = new Produto("Celular", 2500.99);	// New, chamada para o construtor
		//celular.nome = "Celular";
		//celular.preco = 2500.99;
		//celular.desconto = 0.25;
		
		var notebook = new Produto();	// Var irá fazer um inferencia, com isso também sera do tipo Produto
		notebook.nome = "Notebook";
		notebook.preco = 5600.99;
		Produto.desconto = 0.36;	// Muda desconto de todos os produtos
		
		System.out.println(notebook.nome + " " + notebook.precoComDesconto());
		System.out.println(celular.nome + " " + celular.precoComDesconto());	// Sem parenteses celular.nome -> Atributo
		
		double precoFinal1 = celular.precoComDesconto();	
		double precoFinal2 = notebook.precoComDesconto(0.1);	// Com parenteses -> Método
		double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;
		
		System.out.printf("Média dos produtos: R$%.2f", mediaCarrinho);
		
	}	// END MAIN
}	// END PUBLIC CLASS
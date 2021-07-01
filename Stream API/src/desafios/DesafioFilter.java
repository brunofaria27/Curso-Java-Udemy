package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
	public static void main(String[] args) {
		 /*
		 * MOSTRAR QUAIS PRODUTOS DA LOJA SÃO CAROS
		 */
		
		ProdutoFilter p1 = new ProdutoFilter("Notebook", 1200.00);
		ProdutoFilter p2 = new ProdutoFilter("Celular", 699.99);
		ProdutoFilter p3 = new ProdutoFilter("Alexa", 249.99);
		ProdutoFilter p4 = new ProdutoFilter("Computador", 6999.99);
		ProdutoFilter p5 = new ProdutoFilter("Video Game", 4999.99);
		ProdutoFilter p6 = new ProdutoFilter("Livro 1944", 50.00);
		
		List<ProdutoFilter> produtosLoja = Arrays.asList(p1, p2, p3, p4, p5, p6);
		Predicate<ProdutoFilter> caro = produto -> produto.preco >= 2500;
		Function<ProdutoFilter, String> mostrarCaro =
				produto -> "O produto " + produto.nome + " é caro e vale: R$" + produto.preco;
				
		produtosLoja.stream()
			.filter(caro)
			.map(mostrarCaro)
			.forEach(System.out::println);
		
	}
}
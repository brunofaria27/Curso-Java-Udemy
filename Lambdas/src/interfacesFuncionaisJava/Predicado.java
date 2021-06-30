package interfacesFuncionaisJava;

import java.util.function.Predicate;

public class Predicado {
	public static void main(String[] args) {
		/*
		Predicate<Produto> isCaro  = 
				prod -> prod.preco >= 750;	// Se o prodPreco for maior que 750 vai ser true = caro
		*/
		Predicate<Produto> isCaro  = 
				prod -> (prod.preco * (1 - prod.desconto)) >= 750;	// Se o preco do prod com desconto for maior que 750
																	// retorna true falando que o produto é caro
							
		Produto produto = new Produto("Notebook", 3899.99, 0.15);
		System.out.println(isCaro.test(produto));
	}
}

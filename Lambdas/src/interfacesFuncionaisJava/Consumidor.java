package interfacesFuncionaisJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	public static void main(String[] args) {
		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);
		Produto p1 = new Produto("Celular", 699.00, 0);
		imprimirNome.accept(p1);
		
		Produto p2 = new Produto("Televisão", 1500.99, 0.8);
		Produto p3 = new Produto("Alexa", 249.99, 0.1);
		Produto p4 = new Produto("Computador", 6700.99, 0.09);
		Produto p5 = new Produto("Video Game", 5000.99, 0.02);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5); 
		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}
}

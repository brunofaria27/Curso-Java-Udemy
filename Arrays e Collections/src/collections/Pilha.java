package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Príncipe");
		livros.push("Ronaldinho e seus amigos");	// Retorna um erro caso a pilha esteja cheia
		livros.push("O Hobbit");
		
		System.out.println(livros.peek());	// Principio exatamente o mesmo da fila
											// Porem retorna o ultimo a entrar
											// Pilha o ultimo a entrar e o primeiro a sair
		
		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		System.out.println(livros.poll());		// 	Retorna null
		// System.out.println(livros.pop());	// Retorna um erro
		// System.out.println(livros.remove());	// Retorna um erro
		
		// livros.size();
		// livros.clear();
		// livros.contains();
		// livros.isEmpty();
		
	}
}
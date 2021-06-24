package collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		Queue<String> fila = new LinkedList<>();	// LinkedList -> é uma lista (aceita todos metodos de fila)
		
		fila.add("Ana");	// Caso a fila esteja cheio o .add irá mostrar um erro
		fila.offer("Bia");	// Filas com restrição de tamanho, nao pode adicionar enquanto outro n for tirado da fila
							// Retorna falso se n conseguir adicionar
		fila.add("Carlos");
		fila.offer("Daniel");	
		fila.add("Rafaela");	
		fila.offer("Gui");
		
		System.out.println(fila.peek());	// Le o elemento mais não remove
		System.out.println(fila.peek());	// retorna nulo quando a lista esta vazia
		System.out.println(fila.element());	// mostrar um erro quando a lista esta vazia
		System.out.println(fila.element());
		
		// fila.size();			-> Tamanho da fila
		// fila.clear();		-> Limpar a fila
		// fila.isEmpty();		-> Saber se a fila esta ou não vazia
		// fila.contains(...);	-> Saber se determinado elemento esta na fila
		
		System.out.println(fila.poll());	// Retorna o primeiro elemento da fila ja removendo
		System.out.println(fila.poll());	// primeiro elemento da fila sempre sera atualizado
		System.out.println(fila.poll());	// Retorna falso caso esteja vazia
		System.out.println(fila.remove());	// Retorna um erro caso esteja vazia
		
	}
}
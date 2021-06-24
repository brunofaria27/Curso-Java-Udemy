package collections;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	public static void main(String[] args) {
//		Set<String> listaAprovados = new HashSet<String>();	// Agora a lista será do tipo string
//		Set<String> listaAprovados = new HashSet<>();		// OBRIGATORIAMENTE	-> ANOTAÇÃO GENERICS <>
		SortedSet<String> listaAprovados = new TreeSet<String>();	// TreeSet -> Ordem de secção
																	// SortedSet -> tem algum criterio de ordenacao
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato : listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();	// Dentro das collections nao aceitam tipos primitivos
		nums.add(1);
		nums.add(5);
		nums.add(7);
		nums.add(6);
		
		for(Integer numeros : nums) {
			System.out.println(numeros);
		}
		
	}
}

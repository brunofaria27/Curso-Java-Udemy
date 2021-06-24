package collections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntosBaguncados {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);	// double -> Double
		conjunto.add(true);	// boolean -> Boolean
		conjunto.add("Teste");	// String
		conjunto.add(1);	// int -> Integer
		conjunto.add('x');	// char -> Char
		
		System.out.println("Tamanho do conjunto: " + conjunto.size());
		
		conjunto.add("Teste");	// String
		System.out.println("Tamanho do conjunto: " + conjunto.size());	// Continua com 5 
																		// na aceita repetir
		
		System.out.println(conjunto.remove("teste"));
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		System.out.println("Tamanho do conjunto: " + conjunto.size());
		
		System.out.println(conjunto.contains('x'));	// Olhar se contem no conjunto
		System.out.println(conjunto.contains("Teste"));	
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums);	// Uniao entre 2 conjuntos
		conjunto.retainAll(nums);	// Intersecção entre 2 conjuntos, somente o que tem nos 2 sera mantido
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
	}
}

package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {
	public static void main(String[] args) {
		Map<Integer, String> usuarios = new HashMap<>();	
		//	 KEY      VALUE
		
		usuarios.put(1, "Bruno Faria");	// .put serve para adicionar, como substitue quando existe
		usuarios.put(2, "Gustavo Faria");
		usuarios.put(2, "Bernardo Faria");
		
		System.out.println("Tamanho: " + usuarios.size());
		System.out.println("Está vazio: " + usuarios.isEmpty());
		
		System.out.println("-----------------");
		
		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());
		
		System.out.println("-----------------");
		
		System.out.println(usuarios.containsKey(2));
		System.out.println(usuarios.containsValue("Bruno Faria"));
		
		System.out.println("-----------------");

		System.out.println(usuarios.get(1));
		System.out.println(usuarios.get(2));
		
		System.out.println("-----------------");
		
		for(int chave: usuarios.keySet()) {
			System.out.println(chave);
		}
		
		System.out.println("-----------------");
		
		for(String valor: usuarios.values()) {
			System.out.println(valor);
		}
		
		System.out.println("-----------------");
		
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			System.out.print(registro.getKey() + " ==> ");
			System.out.println(registro.getValue());
		}

	}
}
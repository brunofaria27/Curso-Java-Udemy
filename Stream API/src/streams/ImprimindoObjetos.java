package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Lu", "Gui", "Bia", "Ana");
		// USANDO FOR NORMAL
		System.out.println("\nUsando FOR NORMAL...");
		for(int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		// USANDO FOREACH
		System.out.println("\nUsando FOREACH...");
		for(String nomes: aprovados) {
			System.out.println(nomes);
		}
		
		// USANDO ITERATOR
		System.out.println("\nUsando Iterator...");
		Iterator<String> it = aprovados.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());	// Pega a string que ainda tem
		}	// it.hasnext -> SE TIVER PROXIMO ENTRA NO WHILE
		
		// USANDO STREAM
		// Na stream de objetos a interação ocorre de forma interna
		System.out.println("\nUsando Stream...");
		Stream<String> st = aprovados.stream();
		st.forEach(System.out::println);	
		
	}
}

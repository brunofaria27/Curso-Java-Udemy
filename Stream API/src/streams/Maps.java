package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Maps {
	public static void main(String[] args) {
		Consumer<String> print = System.out::print;
		List<String> marcas = Arrays.asList("BMW ", "Ford ", "Honda ");
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);
		
//		UnaryOperator<String> maiuscula = n -> n.toUpperCase();
//		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
//		UnaryOperator<String> grito = n -> n + "!!! ";
		
		Utilitarios.maiuscula
			.andThen(Utilitarios.primeiraLetra)
			.andThen(Utilitarios.grito)
			.apply("BMW");
		
		System.out.println("\n\\n Usando composição...");
		marcas.stream()
			.map(Utilitarios.maiuscula)
			.map(Utilitarios.primeiraLetra)
			.map(Utilitarios.grito)
			.forEach(print);
	
	
	}
}

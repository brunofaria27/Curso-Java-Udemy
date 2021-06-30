package interfacesFuncionaisJava;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class Fornecedor {
	public static void main(String[] args) {
		Supplier<List<String>> umLista =
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui"); // Como nao recebo parametro de entrada, deve ter os ()
		System.out.println(umLista.get());
		
		Supplier<Object> umLista2 =
				() -> Arrays.asList("Ana", "Bia", "Lia", "Gui"); // Tipo generico -> Object
		System.out.println(umLista2.get());
	}
}

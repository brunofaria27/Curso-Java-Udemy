package desafios;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 2, 3, 4, 5, 6, 7 ,8 ,9);
		
		UnaryOperator<String> inverter = 
				s -> new StringBuilder(s).reverse().toString();
		
		Function<String, Integer> binarioParaInt = 
				s -> Integer.parseInt(s, 2);	// O numero dois fala que estou passando uma string binaria
												// Para virar decimal Binary -> Integer
				
		num.stream()
			.map(Integer::toBinaryString)
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println);
		
	}
}

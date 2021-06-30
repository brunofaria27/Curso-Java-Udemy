package interfacesFuncionaisJava;

import java.util.function.UnaryOperator;

public class OperadorUnario {
	public static void main(String[] args) {
		UnaryOperator<Integer> maisDois =
				n -> n + 2;
		UnaryOperator<Integer> vezesDois =
				n -> n * 2;
		UnaryOperator<Integer> aoQuadrado =
				n -> n * n;
				
		int resultado1 = maisDois
				.andThen(vezesDois)
				.andThen(aoQuadrado)
				.apply(0);
		System.out.println(resultado1);
		// Execute maisDois, depois vezesDois, depois aoQuadrado
		
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);
		System.out.println(resultado2);
		// Antes de fazer o aoQuadrado, faça o vezesDois, antes de fazer vezesDois faça o maisDois
		
	}
}

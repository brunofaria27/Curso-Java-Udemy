package lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	public static void main(String[] args) {
		// int -> Double = Não funciona 
		// double -> Double = Funciona
		
		BinaryOperator<Double> calc = (x, y) -> x + y;
		System.out.println("Soma = " + calc.apply(2.0, 3.0));
		
		calc = (x, y) -> x * y;
		System.out.println("Multiplicação = " + calc.apply(3.0, 3.0));

		BinaryOperator<Integer> calc2 = (x, y) -> x + y;
		System.out.println("Soma = " + calc2.apply(2, 3));
		
		calc2 = (x, y) -> x * y;
		System.out.println("Multiplicação = " + calc2.apply(3, 3));
	}
}

// DOCUMENTACAO JAVA.UTIL.FUNCTION
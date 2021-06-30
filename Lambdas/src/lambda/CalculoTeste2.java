package lambda;

public class CalculoTeste2 {
	public static void main(String[] args) {
		Calculo calc = (x, y) -> {
			return x + y;
		};
		System.out.println(calc.executar(2, 3));
		
		calc = (x, y) -> x* y;	// Java entende que é uma unica sentença que será retornada
								// e não terá um conjunto de condigos na funcao lambda
								// se nao for colocado o par de chaves retorno ja e visto para o java
		System.out.println(calc.executar(2, 3));
	
	}
}

package interfacesFuncionaisJava;

import java.util.function.Predicate;

public class PredicadoComposicao {
	public static void main(String[] args) {
		Predicate<Integer> isPar = 
				num -> num % 2 == 0;
		Predicate<Integer> isTresDigitos = 
				num -> num >= 100 && num <= 999;
				
		System.out.println(isPar.and(isTresDigitos).negate().test(122));
		// Embora o resultado seja true -> é par e tem 3 digitos, eu utilizer negate()
		// ou seja, o resultado será o contrário do que seria
		System.out.println(isPar.or(isTresDigitos).test(123));
		// Saber se tem 3 digitos OU e par -> se uma for verdadeira = true 
 	}
}
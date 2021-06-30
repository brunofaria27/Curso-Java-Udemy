package lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	public static void main(String[] args) {
		List<String> aprovados = Arrays.asList("Bruno", "Bia", "Gui", "Lia");
		
		System.out.println("Forma tradicional: ");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #01: ");
		aprovados.forEach((nome) -> System.out.println(nome + "!!!"));
		// Traducindo codigo acima: receber cada elemento da lista, e para cada elemento
		// execute essa lambda (funcao)
		
		System.out.println("\nMethod Reference #01: ");
		aprovados.forEach(System.out::println);	// Passando uma referencia para essa function
												// navegando por cada nome e passando ele como parametro para 
												// o println -> como se fosse o endereço de momoria passado
		// Em outras palavras -> para cada aprovado da lista chame o println, ou seja imprime na saida do sistema
		
		System.out.println("\nLambda #02: ");
		aprovados.forEach((nome) -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #02: ");
		aprovados.forEach(Foreach::meuImprimir);
		// Passar cada um dos elementos como parametro para a function meuImprimir, imprimindo com a frase desejada
				
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! meu nome é " + nome);
	}
	
}

package desafios;

public class DesafiosLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V or F)
		// Trabalho na quinta (V or F)
		
		// Se os 2 forem V -> Comprar 1 TV 50 polegadas
		// Se os 1 forem V -> Comprar 1 TV 32 polegadas
		
		// Se comprar a TV de 50 ou a de 32 irão tomar sorvete no shopping juntos 
		
		boolean trabalho1 = true;
		boolean trabalho2 = true;
		
		boolean comprouTV50 = trabalho1 && trabalho2;
		System.out.println("Comprou TV 50: " + comprouTV50);
		
		boolean comprouTV32 = trabalho1 ^ trabalho2;
		System.out.println("Comprou TV 32: " + comprouTV32);
		
		boolean comprouSorvete = trabalho1 || trabalho2;
		System.out.println("Comprou Sorvete: " + comprouSorvete);
		System.out.println("Mais saudável? " + !comprouSorvete); // Operador Unário
	}
}
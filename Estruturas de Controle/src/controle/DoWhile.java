package controle;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		
		do {
			System.out.println("Voc� precisa falar " 
		+ "as palavras m�gicas...");
			System.out.print("Quer sair? ");
			valor = entrada.nextLine();
		} while(!valor.equalsIgnoreCase("por favor"));
 		
		System.out.println("Obrigado...");
		entrada.close();
	}	// END MAIN
}	// END PUBLIC CLASS
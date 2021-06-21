package programas;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("dia!");
		
		System.out.println("Bom (Mesma Linha)"); // S� cria a nova linha ap�s a exec do c�digo
		System.out.println("dia (Pula Linha)");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1 , 2, 3, 4, 5, 6);
		System.out.printf("Sal�rio: %.1f\n", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome  = entrada.nextLine();
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome  = entrada.nextLine();
		System.out.print("Digite a sua idade: ");
		int idade  = entrada.nextInt();
		System.out.println("\nNome: " + nome + " " + sobrenome);
		System.out.println("Idade: " + idade);
		entrada.close();	// Fechar a entrada ap�s usar para economizar mem�ria da m�quina
	}
}
package programas;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print("dia!");
		
		System.out.println("Bom (Mesma Linha)"); // Só cria a nova linha após a exec do código
		System.out.println("dia (Pula Linha)");
		
		System.out.printf("Megasena: %d %d %d %d %d %d\n", 1 , 2, 3, 4, 5, 6);
		System.out.printf("Salário: %.1f\n", 1234.5678);
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome  = entrada.nextLine();
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome  = entrada.nextLine();
		System.out.print("Digite a sua idade: ");
		int idade  = entrada.nextInt();
		System.out.println("\nNome: " + nome + " " + sobrenome);
		System.out.println("Idade: " + idade);
		entrada.close();	// Fechar a entrada após usar para economizar memória da máquina
	}
}
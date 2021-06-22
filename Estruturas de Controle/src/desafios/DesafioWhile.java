package desafios;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int quantidadeNotas = 0;
		double nota = 0;
		double total = 0;
		
		System.out.println("ENTRADA DAS NOTAS (Digite -1 para sair): ");
		while(nota != -1) {
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				quantidadeNotas++;
			} else if (nota != -1){
				System.out.println("Nota inválida...");
			}
		}
		
		// Calcular média
		double media = total / quantidadeNotas;
		System.out.println("Média = " + media);
	
		entrada.close();
	}	// END MAIN
}	// END PUBLIC CLASS
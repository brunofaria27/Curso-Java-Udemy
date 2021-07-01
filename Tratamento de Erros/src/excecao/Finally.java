package excecao;

import java.util.Scanner;

public class Finally {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		try {
			System.out.println(7 / entrada.nextInt());	// SE CASO ACONTECA ALGGUM PROBLEMA
		} catch (Exception e) {	
			System.out.println(e.getMessage());			// VAI CAIR NO CATCH
		} finally {
			System.out.println("Finalmente #01...");	// MAS AINDA ASSIM VAI CHAMAR O FINALLY
														// SEMPRE SERA CHAMADO, FORÇAR QUE ALGO SEJA EXECUTADO 
														// INDEPENDENTE DO ERRO (Chamado em todas as situaçoes)
		}
		
		try {
			System.out.println(7 / entrada.nextInt());	
		} finally {
			System.out.println("Finalmente #02...");	
			entrada.close();						
		}
		
		System.out.println("Fim");
		
	}
}
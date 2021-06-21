package programas;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); // Equals irá comparar os conteúdos
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite algo: ");
		String s2 = entrada.nextLine();	// next() tira espaços em branco -> nextLine() não tira espaços em branco
		System.out.println("2" == s2.trim()); // trim() retira os espaços em branco
		System.out.println("2".equals(s2.trim()));	// Para comparar strigs é melhor utilizar equals é não ==
		entrada.close();
	}
}
package programas;

import java.util.Scanner;

public class TipoStringEquals {
	public static void main(String[] args) {
		System.out.println("2" == "2");
		
		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s)); // Equals ir� comparar os conte�dos
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Digite algo: ");
		String s2 = entrada.nextLine();	// next() tira espa�os em branco -> nextLine() n�o tira espa�os em branco
		System.out.println("2" == s2.trim()); // trim() retira os espa�os em branco
		System.out.println("2".equals(s2.trim()));	// Para comparar strigs � melhor utilizar equals � n�o ==
		entrada.close();
	}
}
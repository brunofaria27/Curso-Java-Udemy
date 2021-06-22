package controle;

import java.util.Scanner;

public class SwitchComBreak {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String conceito = "";
		
		System.out.print("Informe a nota do estudante: ");
		int nota = entrada.nextInt();
		
		switch (nota) {
		case 10: 
			conceito = "A";
			break;
		case 9: case 8: case 7:
			conceito = "B";
			break;
		case 6: case 5: case 4:
			conceito = "C";
			break;
		case 3: 
			conceito = "D";
			break;
		case 2: 
			conceito = "E";
			break;
		case 1: 
			conceito = "F";
			break;
			default:
				conceito = "não encontrado!";
//			break;  -> OPCIONAL PORQUE JÁ VAI SAIR DO CÓDIGO
		}
		
		System.out.println("Conceito é " + conceito);
		entrada.close();
		
	}	// END MAIN
}	// END PUBLIC CLASS
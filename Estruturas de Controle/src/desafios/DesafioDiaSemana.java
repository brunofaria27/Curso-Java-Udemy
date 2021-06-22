package desafios;

import java.util.Scanner;

public class DesafioDiaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o nome do dia da semana: ");
		String dia = entrada.next(); // Next -> pega uma palavra - nextLine -> multiplas
		
		if(dia.equalsIgnoreCase("domingo")) { // "domingo".equalsIgnoreCase(dia)
			System.out.println(1);
		} else if(dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if(dia.equalsIgnoreCase("terça") || dia.equalsIgnoreCase("terca")) {
			System.out.println(3);
		} else if(dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if(dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if(dia.equalsIgnoreCase("sexta")) { // "domingo".equals(dia.toLowerCase())
			System.out.println(6);
		} else if(dia.equalsIgnoreCase("sábado") || dia.equalsIgnoreCase("sabado")) {
			System.out.println(7);
		} else {
			System.out.println("Dia inválido.");
		}
 		
		entrada.close();
	}	// END MAIN	
}	// END PUBLIC CLASS
package exercicios;

import java.util.Scanner;

public class Exercicio8 {
	/* 8. Criar um programa que receba uma palavra e imprime no console letra por letra. */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a palavra: ");
		String palavra = scanner.nextLine();

		char letras[] = palavra.toCharArray();	// Levar a palavra scaneada para um array de char

		for(int i = 0; i < letras.length; i++) {	// Fazer enquanto i for menor que o tamanho do array letras
			System.out.println(letras[i]);	// Imprimir letra por letra que estava armazenada
		}

		scanner.close();
		
	}	// END MAIN
}	// END PUBLIC CLASS
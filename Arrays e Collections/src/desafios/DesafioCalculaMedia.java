package desafios;

import java.util.Scanner;

public class DesafioCalculaMedia {
	public static void main(String[] args) {
		Scanner notas = new Scanner(System.in);
		
		int qntNotas = 0;
		System.out.println("Quantas notas deseja inserir? ");
		qntNotas = notas.nextInt();
		
		double armazenaNotas[] = new double[qntNotas];
		for(int i = 0; i < armazenaNotas.length; i++) {
			System.out.printf("Digite a nota do aluno %d: ", i + 1);
			armazenaNotas[i] = notas.nextDouble();
		}
		
		double total = 0;
		for(double nota : armazenaNotas) {
			total += nota;
		}
		
		System.out.println("A média das notas é: " + total / armazenaNotas.length);
		notas.close();
	}
}
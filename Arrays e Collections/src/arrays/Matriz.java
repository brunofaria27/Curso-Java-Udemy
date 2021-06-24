package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int qtdeAlunos = 0;
		System.out.print("Quantos alunos deseja inserir: ");
		qtdeAlunos = entrada.nextInt();
		
		int qtdeNotas = 0;
		System.out.print("Quantas notas por aluno: ");
		qtdeNotas = entrada.nextInt();
		
		double notasDaTurma[][] = new double[qtdeAlunos][qtdeNotas];
		
		double total = 0;
		for(int a = 0; a < notasDaTurma.length; a++) {	// I representa aluno
			for(int n = 0; n < notasDaTurma[a].length; n++) {	// J percorre as notas
				System.out.printf("Informe a nota %d do aluno %d: ", n + 1 , a + 1);
				notasDaTurma[a][n] = entrada.nextDouble();
				total += notasDaTurma[a][n];
			}
		}
		
		double media = total / (qtdeAlunos * qtdeNotas);
		System.out.println("Média da turma é: " + media);
		
		for(double notasDoAluno[] : notasDaTurma) {
			System.out.println(Arrays.toString(notasDoAluno));
		}
		
		entrada.close();
	}
}
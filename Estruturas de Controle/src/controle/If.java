package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = entrada.nextDouble();
		
		while(media > 10 || media < 0) {
			System.out.print("\nInforme a média, novamente: ");
			media = entrada.nextDouble();
		}
		
		if(media <= 10 && media >= 7.0) {
			System.out.println("Parabéns, você foi: ");
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		
		entrada.close();
	}
}

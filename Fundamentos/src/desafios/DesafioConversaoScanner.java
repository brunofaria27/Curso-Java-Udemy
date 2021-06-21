package desafios;

import java.util.Scanner;

public class DesafioConversaoScanner {
	public static void main(String[] args) {
		Scanner salarios = new Scanner(System.in);
		
		System.out.print("Informe o primeiro sal�rio: ");
		String valor1 = salarios.next().replace(",", ".");	// Se tiver alguma v�rgula o replace ir� substituir por ponto
		
		System.out.print("Informe o segundo sal�rio: ");
		String valor2 = salarios.next().replace(",", ".");	// Se tiver alguma v�rgula o replace ir� substituir por ponto
		
		System.out.print("Informe o terceiro sal�rio: ");
		String valor3 = salarios.next().replace(",", ".");	// Se tiver alguma v�rgula o replace ir� substituir por ponto
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A m�dia dos sal�rios �: " + media);
		
		salarios.close();
	}
}

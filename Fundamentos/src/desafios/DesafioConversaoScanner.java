package desafios;

import java.util.Scanner;

public class DesafioConversaoScanner {
	public static void main(String[] args) {
		Scanner salarios = new Scanner(System.in);
		
		System.out.print("Informe o primeiro salário: ");
		String valor1 = salarios.next().replace(",", ".");	// Se tiver alguma vírgula o replace irá substituir por ponto
		
		System.out.print("Informe o segundo salário: ");
		String valor2 = salarios.next().replace(",", ".");	// Se tiver alguma vírgula o replace irá substituir por ponto
		
		System.out.print("Informe o terceiro salário: ");
		String valor3 = salarios.next().replace(",", ".");	// Se tiver alguma vírgula o replace irá substituir por ponto
		
		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);
		
		double media = (salario1 + salario2 + salario3) / 3;
		System.out.println("A média dos salários é: " + media);
		
		salarios.close();
	}
}

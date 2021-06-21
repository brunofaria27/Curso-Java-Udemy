package desafios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner numeros  = new Scanner(System.in); 
		
		System.out.print("Insira o primeiro número: ");
		double num1 = numeros.nextDouble();
		
		System.out.print("Insira o segundo número: ");
		double num2 = numeros.nextDouble();
		
		System.out.print("Informe o operador: ");
		String op = numeros.next();
		
		// Lógica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", 
				num1, op, num2, resultado);
		numeros.close();
	}
}

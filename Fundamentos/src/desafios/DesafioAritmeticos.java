package desafios;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		double parte1 = ((1-5)*(2-7))/2;
		double resulP1 = Math.pow(parte1, 2);
		
		double parte2 = 6*(3+2);
		double resulP2 = (Math.pow(parte2, 2))/(3*2);
		
		double parte3 = resulP2 - resulP1;
		double resulP3 = Math.pow(parte3, 3);
		
		double resultado = resulP3/(Math.pow(10, 3)); 
		
		System.out.println("O resultado da equação é: " + resultado);
	}
}
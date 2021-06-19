package programas;

public class AreaCircunferencia {
	public static void main(String[] args) {
		/* Declaração de váriaveis do programa */
		int raio = 3; 							// Caso queira valor real -> double raio = 3.4;
		final double PI = 3.14159; 				// final -> o valor da váriavel não vai mudar
		double areaResultado = 0; 				// Inicializando a váriavel
		
		areaResultado = PI * raio * raio;
		System.out.println("Área = " + areaResultado);	// Concatenação do texto com o resultado
		
		raio = 10;								// Mudar o valor da váriavel
		areaResultado = PI * raio * raio;
		System.out.println("Área = " + areaResultado);	// Concatenação do texto com o resultado
	}
}

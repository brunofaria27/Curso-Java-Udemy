package programas;

public class AreaCircunferencia {
	public static void main(String[] args) {
		/* Declara��o de v�riaveis do programa */
		int raio = 3; 							// Caso queira valor real -> double raio = 3.4;
		final double PI = 3.14159; 				// final -> o valor da v�riavel n�o vai mudar
		double areaResultado = 0; 				// Inicializando a v�riavel
		
		areaResultado = PI * raio * raio;
		System.out.println("�rea = " + areaResultado);	// Concatena��o do texto com o resultado
		
		raio = 10;								// Mudar o valor da v�riavel
		areaResultado = PI * raio * raio;
		System.out.println("�rea = " + areaResultado);	// Concatena��o do texto com o resultado
	}
}

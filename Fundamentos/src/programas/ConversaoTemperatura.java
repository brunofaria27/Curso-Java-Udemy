package programas;

public class ConversaoTemperatura {
	public static void main(String[] args) {
		/* Declaração das váriaveis */
		double fahrenheit = 86;
		double celsius;
		/* Constantes */
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		/* End Constantes */
		/* End Declaração das váriaveis */
		
		// Fórmula -> (F - 32) x 5 / 9 = C
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Valor em celsius = " + celsius);
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Valor em celsius = " + celsius);
	}
}

package programas;

public class ConversaoTemperatura {
	public static void main(String[] args) {
		/* Declara��o das v�riaveis */
		double fahrenheit = 86;
		double celsius;
		/* Constantes */
		final int AJUSTE = 32;
		final double FATOR = 5.0/9.0;
		/* End Constantes */
		/* End Declara��o das v�riaveis */
		
		// F�rmula -> (F - 32) x 5 / 9 = C
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Valor em celsius = " + celsius);
		
		fahrenheit = 150;
		celsius = (fahrenheit - AJUSTE) * FATOR;
		System.out.println("Valor em celsius = " + celsius);
	}
}

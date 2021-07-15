package brunorfaria.app.calculo;

import brunorfaria.app.Calculadora;
import brunorfaria.app.calculo.interno.OperacoesAritmeticas;
import brunorfaria.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {
	private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();
	
	public double soma(double... nums) {
		Logger.info("Somando...");
		return opAritmeticas.soma(nums);
	}
	
}

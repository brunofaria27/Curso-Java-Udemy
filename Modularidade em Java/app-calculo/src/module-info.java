import brunorfaria.app.Calculadora;
import brunorfaria.app.calculo.CalculadoraImpl;

module app.calculo {
	exports brunorfaria.app.calculo;
	requires transitive app.logging; // Transitive -> aquilo que recebi de outro modolo ficara dispo
									 // nivel para o outro modulo-cliente
	
	exports brunorfaria.app.calculo.interno
		to app.financeiro; // exports para mais de um modulo basta colocar uma virgula
	
	requires app.api;
	provides Calculadora with CalculadoraImpl;
}
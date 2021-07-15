import brunorfaria.app.Calculadora;

module app.financeiro {
	requires java.base;
	// requires app.calculo;
	requires app.api;
	uses Calculadora;
}
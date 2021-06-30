package lambda;

public class CalculoTeste {
	public static void main(String[] args) {
		Calculo soma = new Soma();
		Calculo multiplicacao = new Multiplicar();
		System.out.println(soma.executar(2, 3));
		System.out.println(multiplicacao.executar(2, 3));
		
		Calculo calculo = new Soma();
		System.out.println(calculo.executar(4, 4));
		calculo = new Multiplicar();
		System.out.println(calculo.executar(4, 4));
	}
}

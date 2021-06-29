package desafios.heranca;

public class Ferrari extends Carro {
	
	Ferrari() {
		this(315);
		// super(315);
	}
	
	Ferrari(int velocidadeMax) {
		super(velocidadeMax);
		delta = 15;
	}
	
	/*
	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
	*/
	
}
package desafios.interfaces;

public class Ferrari extends Carro implements Esportivo, Luxo {
	
	private boolean ligarTurbo =  false;
	private boolean ligarAr = false;
	
	Ferrari() {
		this(315);
		// super(315);
	}
	
	Ferrari(int velocidadeMax) {
		super(velocidadeMax);
		setDelta(15);
	}
	
	// Metodos da interface Esportivo
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	// End metodos da interface Esportivo
	
	// Metodos da interface Luxo
	@Override
	public void ligarAr() {
		ligarAr = true;
	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}
	// End metodos da interface Luxo
	
	@Override
	public int getDelta() {
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 25;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
	
	/*
	@Override
	void acelerar() {
		velocidadeAtual += 15;
	}
	*/
	
}

// Implements faz com que a classe herde de uma interface os metodos, fazendo ele ter que implementar esses metodos
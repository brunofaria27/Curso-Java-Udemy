package desafios.interfaces;

public class Carro {
	final int VELOCIDADE_MAX;
	int velocidadeAtual;
	private int delta = 5;
	
	Carro(int velocidadeMax) {
		VELOCIDADE_MAX = velocidadeMax;
	}
	
	void acelerar() {
		if(velocidadeAtual + getDelta() > VELOCIDADE_MAX) {
			velocidadeAtual = VELOCIDADE_MAX;
		} else {
			velocidadeAtual += getDelta();						
		}
	}
	
	void frear() {
		if(velocidadeAtual >= 5) {
			velocidadeAtual -= 5;
		} else {
			velocidadeAtual = 0;
		}
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidadeAtual + "Km/h";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
	
	
	
}
package desafios.heranca;

public class Carro {
	final int VELOCIDADE_MAX;
	int velocidadeAtual;
	int delta = 5;
	
	Carro(int velocidadeMax) {
		VELOCIDADE_MAX = velocidadeMax;
	}
	
	void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAX) {
			velocidadeAtual = VELOCIDADE_MAX;
		} else {
			velocidadeAtual += delta;						
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
	
}
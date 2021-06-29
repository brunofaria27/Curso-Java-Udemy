package composicao;

public class Carro {
	final Motor motor;
	
	Carro() {
		this.motor = new Motor(this);	// Carro tem motor e motor tem o carro agora
	}									// relacao bidirecional
	
	void acelerar() {
		if(motor.fatorInjecao > 2.6) {
			motor.fatorInjecao += 0.4;		
		}
	}
	
	void frear() {
		if(motor.fatorInjecao > 0.5) {
			motor.fatorInjecao -= 0.4;			
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
	
}
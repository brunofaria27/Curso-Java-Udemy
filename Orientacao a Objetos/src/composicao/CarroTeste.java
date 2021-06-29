package composicao;

public class CarroTeste {
	public static void main(String[] args) {
		Carro c1 = new Carro();
		System.out.println("Carro 1 está ligado? " + c1.estaLigado());
		c1.ligar();
		System.out.println("Carro 1 está ligado? " + c1.estaLigado());
		System.out.println("Quantidade de giros do motor: " + c1.motor.giros() + " rpm");
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		System.out.println("Quantidade de giros do motor: " + c1.motor.giros() + " rpm");
		c1.frear();
		c1.frear();
		c1.frear();
		c1.frear();
		// Faltou encapsulamento !!!
		// c1.motor.fatorInjecao = -30;
		System.out.println("Quantidade de giros do motor: " + c1.motor.giros() + " rpm");
	}
}

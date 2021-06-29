package desafios.interfaces;

public class CarroTeste {
	public static void main(String[] args) {
		System.out.println("Civic");
		Carro c1 = new Civic();
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.acelerar();
		System.out.println(c1);
		c1.frear();
		System.out.println(c1);
		
		System.out.println("Ferrari");
		Ferrari c2 = new Ferrari(400);	// tenho que colocar ferrari, pois apenas a ferrari recebe a interface Esportivo
		// Carro c2 = new Ferrari(400); -> não teria acesso a ligar e desligar turbo
		
		c2.ligarTurbo();
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.desligarTurbo();
		c2.acelerar();
		System.out.println(c2);
		
	}
}
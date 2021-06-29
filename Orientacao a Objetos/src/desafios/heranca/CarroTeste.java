package desafios.heranca;

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
		Carro c2 = new Ferrari(400);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		c2.acelerar();
		System.out.println(c2);
		
	}
}
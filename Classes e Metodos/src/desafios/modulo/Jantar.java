package desafios.modulo;

public class Jantar {
	public static void main(String[] args) {
		Comida c1 = new Comida("Arroz", 0.18);
		Comida c2 = new Comida("Feijão", 0.3);
		Pessoa p = new Pessoa("Bruno", 99.8);
		
		System.out.println(p.apresentar());
		p.comer(c1);
		
		System.out.println(p.apresentar());
		p.comer(c2);
		
		System.out.println(p.apresentar());
		
	}
}
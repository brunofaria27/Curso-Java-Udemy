package abstrato;

public class TesteAbstrato {
	public static void main(String[] args) {
		Animal a = new Cachorro();
		System.out.println(a.mover());
		
		Mamifero m = new Cachorro();
		System.out.println(m.mamar());
		System.out.println(a.respirar());
		System.out.println(m.respirar());
	
	}
}

// ANIMAL (ABSTRATA) -> MAMIFERO (ABSTRATA) -> CACHORRO (SO PODE INSTANCIAR ESSE)
// RESPIRAR			 -> MAMAR				-> IMPLEMENTA
// MOVER N IMPLEMENT ->	MAMAR N IMPLEMENT	-> OS METODOS
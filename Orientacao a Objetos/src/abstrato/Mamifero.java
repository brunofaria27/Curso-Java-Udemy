package abstrato;

public abstract class Mamifero extends Animal {

	public abstract String mamar();
	
	@Override
	public final String mover() {	// final n pode ser reescrito nas classes abaixo (cachorro)
		return "Saindo do lugar";
	}
}

//CLASSE ABSTRATA = PODE OU NÃO ESTAR INACABADA
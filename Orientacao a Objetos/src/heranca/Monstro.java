package heranca;

public class Monstro extends Jogador {
	
	Monstro() {
		super(0, 0);
	}
	
	Monstro(int x, int y) {
		super(x, y);
	}
	
	boolean atacar(Jogador oponente) {
		boolean ataque1 = super.atacar(oponente);
		
		return ataque1;
	}
}
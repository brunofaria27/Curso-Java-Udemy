package heranca;

public class Jogo {
	public static void main(String[] args) {
		Monstro j1 = new Monstro();	// Pode construir igual o heroi tambem
		j1.x = 10;
		j1.y = 10;
		
		Heroi j2 = new Heroi(10, 11);
		// j2.x = 10;
		// j2.y = 11;
		
		System.out.println("Vida jogador 1 = " + j1.vida);
		System.out.println("Vida jogador 2 = " + j2.vida);
		
		j1.atacar(j2);	// jogador 1 atacou o jogador 2
		
		System.out.println("Vida jogador 1 = " + j1.vida);
		System.out.println("Vida jogador 2 = " + j2.vida);
		
		j2.atacar(j1);
		
		System.out.println("Vida jogador 1 = " + j1.vida);
		System.out.println("Vida jogador 2 = " + j2.vida);
		
	}
}
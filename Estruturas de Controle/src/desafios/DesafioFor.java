package desafios;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		for (int i = 0; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// Vers�o do desafio
		// N�o pode usar valor n�merico para controlar o la�o
		System.out.println("VERS�O DESAFIO");
		
		for(String v ="#"; !v.equals("######"); v+= "#") {
			System.out.println(v);
		}
		
	}	// END MAIN
}	// END PUBLIC CLASS
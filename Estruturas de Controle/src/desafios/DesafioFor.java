package desafios;

public class DesafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		for (int i = 0; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// Versão do desafio
		// Não pode usar valor númerico para controlar o laço
		System.out.println("VERSÃO DESAFIO");
		
		for(String v ="#"; !v.equals("######"); v+= "#") {
			System.out.println(v);
		}
		
	}	// END MAIN
}	// END PUBLIC CLASS
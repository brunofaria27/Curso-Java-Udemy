package controle;

public class Break2 {
	public static void main(String[] args) {
		// BREAK ROTULADO
		externo: for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				if (i == 1) {
					break externo;
				}
				
				System.out.printf("[%d, %d] ", i, j);
			}
			System.out.println(); // Pular linha quando mudar de linha
		}
		
		System.out.println("Fim...");
		
	}	// END MAIN
}	// END PUBLIC CLASS
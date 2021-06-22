package controle;

public class ContinueRotulado {
	public static void main(String[] args) {
		// CONTINUE ROTULADO
				externo: for(int i = 0; i < 3; i++) {
					for(int j = 0; j < 3; j++) {
						if (i == 1) {
							continue externo;
						}
						
						System.out.printf("[%d, %d] ", i, j);
					}
					System.out.println(); // Pular linha quando mudar de linha
				}
				
				System.out.println("Fim...");
				
	}	// END MAIN
}	// END PUBLIC CLASS
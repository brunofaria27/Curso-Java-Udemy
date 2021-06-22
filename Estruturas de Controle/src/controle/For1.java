package controle;

public class For1 {
	public static void main(String[] args) {
		int i = 0;
		for(i = 0; i < 10; i++) {
			System.out.printf("Bom dia %d\n", i + 1);
		}
		
		// NÃO FAZ SENTIDO
		int x = 2;
		for(; x < 10;) {
			System.out.println("x = " + x);
			x++;
		}
		
		// LAÇO INFINITO
//		for(;;) {
//			System.out.println("FIM!");
//		}
		
		
	}	// END MAIN
}	// END PUBLIC CLASS
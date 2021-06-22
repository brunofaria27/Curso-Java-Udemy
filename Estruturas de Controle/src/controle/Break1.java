package controle;

public class Break1 {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			
			if(i == 5) {
				break;	// Interrompe a execução do laço, saindo do laço
			}
			
			System.out.println(i);
		}
		
		System.out.println("FIM!");
		
	}	// END MAIN	
}	// END PUBLIC CLASS
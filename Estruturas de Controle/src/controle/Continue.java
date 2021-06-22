package controle;

public class Continue {
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 1) {
				continue;	// Interromepe a execução da parte em que caiu no continue, porem o laço continua até o final
			}
			
			System.out.println(i);
		}
		
		for(int i = 0; i < 10; i++) {
			if(i == 5) {
				continue;	// Interromepe a execução da parte em que caiu no continue, porem o laço continua até o final
			}
			
			System.out.println(i);
		}
		
	}	// END MAIN	
}	// END PUBLIC CLASS
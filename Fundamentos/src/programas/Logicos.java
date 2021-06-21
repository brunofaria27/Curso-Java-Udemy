package programas;

public class Logicos {
	public static void main(String[] args) {
		boolean condicao1 = true;
		boolean condicao2 = 3 > 7;
		
		System.out.println(condicao1 && condicao2);	// E
		System.out.println(condicao1 || condicao2);	// OU
		System.out.println(condicao1 ^ condicao2);	// OU EXCLUSIVO
		System.out.println(!condicao1);	// NEGA플O
		System.out.println(!condicao2);	// NEGA플O
		
		// TABELA VERDADE E (AND)
		System.out.println("\nTABELA VERDADE 'E':");
		System.out.println(true && true);
		System.out.println(true && false);
		
		// TABELA VERDADE OU (OR)
		System.out.println("\nTABELA VERDADE 'OU':");
		System.out.println(false || true);
		System.out.println(false || false);
		
		// TABELA VERDADE OU EXCLUSIVO (XOR)
		System.out.println("\nTABELA VERDADE 'OU EXCLUSIVO':");
		System.out.println(true ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ true);
		System.out.println(false ^ false);
		
		// TABELA VERDADE NEGA플O (NOT)
		System.out.println("\nTABELA VERDADE 'NEGA플O':");
		System.out.println(!true);
		System.out.println(!false);
	}
}

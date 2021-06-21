package programas;

public class Unarios {
	public static void main(String[] args) {
		int a  = 1;
		int b = 2;
		
		/* PÓS FIXADA */
		a++; // a = a + 1
		a--; // a = a - 1
		
		/* PRÉ FIXADA */
		++b; // b = b + 1
		--b; // b = b - 1
		
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("\nMini Desafio...");
		System.out.println(++a == b--); // Incrementa o A e compara, depois decrementa o B -> ORDEM: ++A -> == -> B--
		System.out.println(a == b);
		System.out.println(a);
		System.out.println(b);
	}
}

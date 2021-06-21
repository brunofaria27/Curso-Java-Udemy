package programas;

public class Atribuicao {
	public static void main(String[] args) {
		int a  = 3;
		int b = a;
		int c = a + b;
		
		c = c + b; // c += b
		c = c - a; // c -= a
		c *= b; // c = c * b
		c /= a; // c = c / a
		c++; // c = c + 1
		c--; // c = c - 1
		System.out.println(c);
		c %= 2; // c = c % 2 -> 0 (PAR) ou 1 (ÍMPAR)
		System.out.println(c);
	}
}

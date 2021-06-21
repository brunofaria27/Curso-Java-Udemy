package programas;

public class Relacionais {
	public static void main(String[] args) {
		int a = 97;
		int b = 'a';
		System.out.println(a == b); // Por causa da tabela Unicode
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		System.out.println(30 != 7);
		
		System.out.println("\nEXEMPLO TEM DESCONTO:");
		double nota = 7.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		System.out.println("Tem desconto? " + temDesconto);
	}
}

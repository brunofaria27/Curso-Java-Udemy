package programas;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		/* CONVERSÃO IMPLICITA - VOCÊ NÃO PERDE INFORMAÇÃO */
		double a = 1;	// Conversão implicita -> número 1 cabe dentro do double
		System.out.println(a);
		
		/* CONVERSÃO EXPLICITA - VOCÊ PODE PERDER INFORMAÇÃO */
		float b = (float)1.12345;	// Conversão explicita (CAST) -> dizendo para o Java que você pode converter 1.0 para float
		System.out.println(b);
		
		int c = 4;
		byte d = (byte)c;	// MÉTODO CAST
		System.out.println(d);
		
		double e  = 1.99999;
		int f = (int) e;	// MÉTODO CAST -> Irá pegar só a parte inteira
		System.out.println(f);
	}
}

package programas;

public class ConversaoTipoPrimitivoNumerico {
	public static void main(String[] args) {
		/* CONVERS�O IMPLICITA - VOC� N�O PERDE INFORMA��O */
		double a = 1;	// Convers�o implicita -> n�mero 1 cabe dentro do double
		System.out.println(a);
		
		/* CONVERS�O EXPLICITA - VOC� PODE PERDER INFORMA��O */
		float b = (float)1.12345;	// Convers�o explicita (CAST) -> dizendo para o Java que voc� pode converter 1.0 para float
		System.out.println(b);
		
		int c = 4;
		byte d = (byte)c;	// M�TODO CAST
		System.out.println(d);
		
		double e  = 1.99999;
		int f = (int) e;	// M�TODO CAST -> Ir� pegar s� a parte inteira
		System.out.println(f);
	}
}

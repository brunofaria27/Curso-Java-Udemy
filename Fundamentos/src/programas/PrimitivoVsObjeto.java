package programas;

public class PrimitivoVsObjeto {
	public static void main(String[] args) {
		String s = "Texto";
		s.toUpperCase();

		// Wrappers s�o a vers�o objetos do tipos primitivos
		int a  = 123;
		System.out.println(a);
		// a. -> ERRADO N�O � OBJETO
	}
}

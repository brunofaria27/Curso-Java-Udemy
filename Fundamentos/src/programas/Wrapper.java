package programas;

public class Wrapper {
	public static void main(String[] args) {
		// Byte
		Byte b = 100; // -> byte
		Short s = 1000;	// -> short
		Integer i = 10000; // -> integer
		Long l = 100000L; // Para converter para tipo primitivo, tirar letra maiuscula do inicio -> long
		
		Integer h = Integer.parseInt("10000"); // Passar string para tipo int
		System.out.println(h * 3);
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f  = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
	
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; // char
		System.out.println(c + "...");
	}
}

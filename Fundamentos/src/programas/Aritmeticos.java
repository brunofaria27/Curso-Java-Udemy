package programas;

public class Aritmeticos {
	public static void main(String[] args) {
		System.out.println(2 + 3);
		
		System.out.println("\nX e Y:");
		var x = 34.56;
		double y = 2.2;
		System.out.println(x + y);
		System.out.println(x - y);
		System.out.println(x * y);
		System.out.println(x / y);
		
		System.out.println("\nA e B:");
		int a = 8;
		int b = 3;
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a / (double)b);
		System.out.println(a / (float)b);
		
		System.out.println("\nM�dulo:");
		System.out.println(8 % 3);
		System.out.println(a % b);
		
		System.out.println("\nOpera��es mais complexas:");
		System.out.println(x + y - a * b);
	}
}

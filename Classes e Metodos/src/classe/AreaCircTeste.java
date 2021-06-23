package classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a1 = new AreaCirc(10);
		// AreaCirc a2 = new AreaCirc(5); -> Pode fazer como na linha 11
		
		//AreaCirc.PI = 3.1415;	// Acessar pi à partir da classe, se n for constante
		
		System.out.println(a1.area());
		System.out.println(AreaCirc.area(5));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
	}
}
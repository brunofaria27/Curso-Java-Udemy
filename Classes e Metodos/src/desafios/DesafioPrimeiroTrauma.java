package desafios;

public class DesafioPrimeiroTrauma {
	
	int a = 3;	// Não pode mexer aqui
	static int b = 4;
	
	public static void main(String[] args) {
		DesafioPrimeiroTrauma p = new DesafioPrimeiroTrauma();	// Criacao de instancia
		System.out.println(p.a);
		
		System.out.println(b);	// Algo static pode acessar algo static
		
	}
}
package equals;

// import java.util.Date;

public class Equals {
	public static void main(String[] args) {
		
		EqualsUsuario u1 = new EqualsUsuario();
		u1.nome = "Gustavo Faria";
		u1.email = "gustavo10faria@gmail.com";
		
		EqualsUsuario u2 = new EqualsUsuario();
		u2.nome = "Gustavo Faria";
		u2.email = "gustavo10faria@gmail.com";
		
		System.out.println(u1 == u2);	// False -> procura na memoria, mas estao
										// objetos distintos na memoria
		System.out.println(u1.equals(u2));	// mesma coisa do ==
		System.out.println(u2.equals(u1));
		
		// System.out.println(u2.equals(new Date()));
	}
}
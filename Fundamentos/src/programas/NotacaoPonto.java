package programas;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		/* Ao colocar o . na frente da variavel, aparece um monte de funcionalidades */
		s = s.replace("X", "Senhora"); // Substituir conte�do
		s = s.toUpperCase(); // Converter toda string para letra maiuscula
		s = s.concat("!!!"); // Concatenar na v�riavel s
		
		System.out.println(s);
		System.out.println("Bruno".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");	// Coloca espa�o antes do enter quando tem mais de um metodo por organiza��o
		System.out.println(y);
		
		// Tipos primitivos m�o tem o operador ponto "." -> para acessar os m�todos
		int a = 3;
		// a. -> N�O EXISTE
		System.out.println(a);
	}
}

package programas;

public class NotacaoPonto {
	public static void main(String[] args) {
		String s = "Bom dia X";
		/* Ao colocar o . na frente da variavel, aparece um monte de funcionalidades */
		s = s.replace("X", "Senhora"); // Substituir conteúdo
		s = s.toUpperCase(); // Converter toda string para letra maiuscula
		s = s.concat("!!!"); // Concatenar na váriavel s
		
		System.out.println(s);
		System.out.println("Bruno".toUpperCase());
		
		String y = "Bom dia X"
				.replace("X", "Gui")
				.toUpperCase()
				.concat("!!!");	// Coloca espaço antes do enter quando tem mais de um metodo por organização
		System.out.println(y);
		
		// Tipos primitivos mão tem o operador ponto "." -> para acessar os métodos
		int a = 3;
		// a. -> NÃO EXISTE
		System.out.println(a);
	}
}

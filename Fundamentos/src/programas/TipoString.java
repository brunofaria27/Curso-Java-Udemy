package programas;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(0)); // Qual é o chat na posição 0 (charAt)
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.toUpperCase().endsWith("TARDE"));
		System.out.println(s.length());
		System.out.println(s.toLowerCase().equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("boa tarde")); // Desconsidera letras maiusulas e minusculas
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.99;
		
		System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario);
		
		System.out.printf("\nO senhor %s %s tem %d e ganha R$%.2f.", nome, sobrenome, idade, salario);
		
		String maisUmaFrase = "\n\nNome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " + idade + "\nSalário: " + salario;
		System.out.println(maisUmaFrase);
		
		String frase = String.format("\nO senhor %s %s tem %d e ganha R$%.2f.\n", nome, sobrenome, idade, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualquer".contains("qual"));
		System.out.println("Frase qualquer".indexOf("qual"));
		System.out.println("Frase qualquer".substring(6));
		System.out.println("Frase qualquer".substring(6, 10)); // 6 - 7 - 8 - 9
	}
}

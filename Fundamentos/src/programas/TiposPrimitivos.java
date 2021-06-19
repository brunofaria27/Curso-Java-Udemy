package programas;

public class TiposPrimitivos {
	public static void main(String[] args) {
		/* JAVA AVALIA O TIPO N�O O VALOR */
		// Informa��es do funcion�rio
		
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 232;
		int id = 56789;
		long pontosAcumulados = 3_234_845_213L; // Letra L -> falo que o n�mero � um literal do tipo LONG
		
		// Tipos n�mericos reais
		float salario = 11_445.44F; // Letra F -> falo que o n�mero � um literal do tipo FLOAT
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // Pode-se colocar true 
		
		// Tipo caractere
		char status = 'A'; // Ativo -> tipo caractere s� aceita uma letra 
		
		/* UTILIZANDO AS VARIAVEIS */
		// Calcular dias de empresa do funcionario
		System.out.println(anosDeEmpresa * 365);
		// Calcular n�mero de viajens do funcionario
		System.out.println(numeroDeVoos / 2);
		// Calcular pontos por real do funcion�rio
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " ganha -> " + salario);
		System.out.println("F�rias? " + estaDeFerias);
		System.out.println("Status: " + status);
	}
}

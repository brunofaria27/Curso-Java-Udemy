package programas;

public class Ternario {
	public static void main(String[] args) {
		double media = 7.6;
		String resultadoParcial = media >= 5.0 ? "em recupera��o" : "reprovado";
		String resultadoFinal = media >= 7.0 ? "aprovado" : resultadoParcial;
		
		System.out.println("O aluno est� " + resultadoFinal);
	}
}

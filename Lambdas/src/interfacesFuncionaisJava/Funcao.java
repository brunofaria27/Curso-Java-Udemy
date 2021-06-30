package interfacesFuncionaisJava;

import java.util.function.Function;

public class Funcao {
	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? "Par" : "Impar";
				
		System.out.println(parOuImpar.apply(32));
		System.out.println(parOuImpar.apply(33));
		
		Function<String, String> oResultadoE = 
				valor -> "O resultado é " + valor;
				
		Function<String, String> empolgado = 
				valor -> valor + "!!!";
				
		String resultadoFinal = parOuImpar
				.andThen(oResultadoE)
				.andThen(empolgado)
				.apply(32);
		// Chamar a funcao parOuImpar depois ira chamar tambem a funcao oResultadoE
		System.out.println(resultadoFinal);
	}
}

// COMPOSIÇÃO DE FUNCÕES ENCADEAMENTO DE FUNÇÕES NO EXEMPLO ACIMA -> Saida de umtem que ser entrada de outro
// NUMERO(PAR OU IMPAR) -> VALOR(O RESULTADO E) = VALOR DE NUMERO + VALOR(O RESULTADO E) -> 
// VALOR(EMPOLGADO) = VALOR DE NUMERO + VALOR(O RESULTADO E) + EMPOLGADO -> RESULTADO FINAL 

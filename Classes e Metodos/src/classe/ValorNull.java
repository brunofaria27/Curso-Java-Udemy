package classe;

import desafios.Data;

public class ValorNull {
	public static void main(String[] args) {
		String s1 = "";
		System.out.println(s1.concat("!!!"));
		
		Data d1 = Math.random() > 0.5 ? new Data() : null;
		if(d1 != null) {
			d1.mes = 3;		
			System.out.println(d1.obterDataFormatada());
		}
		
		String s2 = Math.random() > 0.5 ? "Opa" : null;;
		if(s2 != null) {
			System.out.println(s2.concat("..."));
		}
		
		// Se você acha que uma determinada variavel pode não apontar para um
		// determinado objeto valido, ou seja pode ser null, vc tem que ter cuidado
		// para nao acessar os atributos nem os metodos desse objeto, senao voce tera
		// um erro (nullpointerexception) de runtime
	}
}

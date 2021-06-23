package desafios;

public class DataTeste {
	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.ano = 2021;
		
		var d2 = new Data(20, 11, 2014);
		
		System.out.println("Nascimento do Bruno: " + d1.obterDataFormatada());
		System.out.println("Nascimento do Bernardo: " + d2.obterDataFormatada());
		
		System.out.println("--------------------"); // Separar console
		
		// Ou utilize mais complexo
		d1.imprimirDataFormatada(); // -> Funciona apenas em terminal
		d2.imprimirDataFormatada(); // -> Funciona apenas em terminal
		
	}	// END MAIN
}	// END PUBLIC CLASS
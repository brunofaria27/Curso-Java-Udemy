package controle;

public class SwitchSemBreak {
	public static void main(String[] args) {
		String faixa = "preta";
		
		switch(faixa.toLowerCase()) {
		case "preta":
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heian Godan");
		case "verde":
			System.out.println("Sei o Heian Sandan");
		case "laranja":
			System.out.println("Sei o Heian Nidan");
		case "vermelha":
			System.out.println("Sei o Heian Yodan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei nada...");
		}
		
		System.out.println("Obrigado por utilizar o programa...");
		
	}	// END MAIN
}	// END PUBLIC CLASS
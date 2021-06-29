package emcapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pedro", 30);
		// p1.idade = 10;	// alterar o valor da variavel
		p1.setIdade(45);
			
		System.out.println(p1);	// ler o valor da variavel
	}
}

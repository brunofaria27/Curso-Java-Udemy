package emcapsulamento;

public class Pessoa {
	private String nome;
	private int idade;
	
	public Pessoa(String nome, int idade) {
		setNome(nome);
		setIdade(idade);
	}
	
	// Eclipse -> Source -> Generate Setters and Getters
	public String getNome() {
		return nome;
	}
	
	// Eclipse -> Source -> Generate Setters and Getters
	public void setNome(String nome) {
		this.nome = nome;
	}

	/* ---------------------------------------------------------------------------------------------*/
	
	// Getter
	public int getIdade() {
		return idade;
	}
	
	// Setter
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);	// Passar idade negativa, considero a idade positiva
		if(novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}
	
	@Override
	public String toString() {
		return "Olá, meu nome é " + getNome() + " e tenho " + getIdade() + " anos.";
	}
}
package desafios.modulo;

public class Pessoa {
	String nome;
	double peso;
	
	Pessoa(String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;	// Engordar a pessoa
		}
	}
	
	String apresentar() {
		return "Ol� meu nome � " + nome + " e tenho " + peso + " Kgs.";
	}
	
}
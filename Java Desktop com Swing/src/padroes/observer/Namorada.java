package padroes.observer;

public class Namorada implements ChegadaAniversarianteObservador {
	public void chegou(EventoChegadaAniversariante evento) {
		System.out.println("\nAvisar os convidados...");
		System.out.println("Apagar as luzes...");
		System.out.println("Esperar um pouco...");
		System.out.println("SURPRESA...");
	}
	
}
package br.com.brunorfaria.cm;

import br.com.brunorfaria.cm.modelo.Tabuleiro;
import br.com.brunorfaria.cm.visao.TabuleiroConsole;

public class Aplicacao {
	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
		new TabuleiroConsole(tabuleiro);
	}
}

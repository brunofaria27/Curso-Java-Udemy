package campominadointerface.br.com.brunorfaria.cm.visao;

import java.awt.GridLayout;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

import campominadointerface.br.com.brunorfaria.cm.modelo.Tabuleiro;

@SuppressWarnings("serial")
public class PainelTabuleiro extends JPanel {	// JPanel, agrupador de componentes
	public PainelTabuleiro(Tabuleiro tabuleiro) {
		setLayout(new GridLayout(tabuleiro.getLinhas(), tabuleiro.getColunas()));
		
		tabuleiro.paraCadaCampo(c -> add(new BotaoCampo(c)));
		tabuleiro.registrarObservador(e -> {
			
			SwingUtilities.invokeLater( () -> {	// Atualizar a interface ineteira, depois mostrar aimagem, pois invokeLater
				if(e.isGanhou()) {
					JOptionPane.showMessageDialog(this, "Ganhou, parab�ns pela vit�ria!");
				} else {
					JOptionPane.showMessageDialog(this, "Perdeu, tente novamente, voc� ir� conseguir!");
				}
				
				tabuleiro.reiniciar();
				
			});
			
		});
	}
}

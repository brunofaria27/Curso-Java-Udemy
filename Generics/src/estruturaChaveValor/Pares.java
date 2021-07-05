package estruturaChaveValor;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<K extends Number, V> {
	private final Set<Par<K, V>> itens = new LinkedHashSet<>();	// Linked Ordem de inserção

	public void adicionar(K chave, V valor) {
		if(chave == null) return; // Sair do metódo
 		Par<K, V> novoPar = new Par<K, V>(chave, valor);
 		
 		if(itens.contains(novoPar)) {
 			itens.remove(novoPar);
 		}
 		
 		itens.add(novoPar);
		
//		if(chave != null) {
//			itens.add(new Par<K, V>(chave, valor));			
//		}
 		
	}
	
	public V getValor(K chave) {
		Optional<Par<K, V>>parOpcional =  itens.stream()
					.filter(par -> chave.equals(par.getChave()))
					.findFirst();
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
	}

}

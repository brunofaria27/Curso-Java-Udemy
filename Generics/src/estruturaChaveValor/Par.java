package estruturaChaveValor;

import java.util.Objects;

public class Par<K, V> {
	public K chave;
	public V valor;
	
	public Par() {
		
	}
	
	public Par(K chave, V valor) {
		this.chave = chave;
		this.valor = valor;
	}

	public K getChave() {
		return chave;
	}
	
	public void setChave(K chave) {
		this.chave = chave;
	}
	
	public V getValor() {
		return valor;
	}
	
	public void setValor(V valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(chave);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par other = (Par) obj;
		return Objects.equals(chave, other.chave);
	}
	
}
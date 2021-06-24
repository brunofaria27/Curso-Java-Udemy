package collections;

import java.util.Objects;

public class ListaUsuario {
	String nome;
	
	/* CONSTRUTOR */
	ListaUsuario(String nome) {
		this.nome = nome;
	}
	
	/* METODO TO STRING*/
	public String toString() {
		return "Meu nome é " + this.nome + ".";
	}	// No momento que eu tentear imprimir um elemento do tipo Listausuario, esse objeto
		// sera impresso, seguindo a String que foi retornada a partir do toString

	/* HASHCODE AND EQUALS DO ECLIPSE */
	@Override
	public int hashCode() {
		return Objects.hash(nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaUsuario other = (ListaUsuario) obj;
		return Objects.equals(nome, other.nome);
	}
	
}
package equals;

public class EqualsUsuario {
	String nome;
	String email;
	
	public boolean equals(Object objeto) {
		if(objeto instanceof EqualsUsuario) {
			EqualsUsuario outro = (EqualsUsuario) objeto;
			
			boolean nomeIgual = outro.nome.equals(this.nome);
			boolean emailIgual = outro.email.equals(this.email);
			
			return nomeIgual && emailIgual;
		} else {
			return false;
		}
	}
	
	public int hashCode() {
		return 0;
	}
	
}
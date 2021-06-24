package collections;

import java.util.HashSet;

public class Hash {
	public static void main(String[] args) {
		HashSet<ListaUsuario> usuario = new HashSet<>();
		
		usuario.add(new ListaUsuario("Pedro"));
		usuario.add(new ListaUsuario("Ana"));
		usuario.add(new ListaUsuario("Guilherme"));
		
		boolean resultado = usuario.contains(new ListaUsuario("Guilherme"));
		System.out.println(resultado);	// Se o hashcode estiver comentado n ira funcionar
		
	}
}
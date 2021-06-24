package collections;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		ArrayList<ListaUsuario> lista = new ArrayList<>();
		
		ListaUsuario u1 = new ListaUsuario("Ana");
		lista.add(u1);
		lista.add(new ListaUsuario("Bruno Faria"));
		lista.add(new ListaUsuario("Beatriz"));
		lista.add(new ListaUsuario("Luana"));
		lista.add(new ListaUsuario("Daniela"));
		
		System.out.println(lista.get(3));	// acessar pelo indice
		
		System.out.println("Removido >>>> " + lista.remove(1));
		System.out.println(lista.remove(new ListaUsuario("Daniela")));
		
		System.out.println("Contém? " + lista.contains(new ListaUsuario("Bruno Faria")));	// Saber se tem
		
		for(ListaUsuario u : lista) {
			System.out.println(u.nome);
		}
		
		for(ListaUsuario u : lista) {
			System.out.println(u);
		}
	
	}
}
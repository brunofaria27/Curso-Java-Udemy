package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario3 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Java-Persistence-API");
		EntityManager em = emf.createEntityManager();
		
		// Como preciso alterar, preciso de uma transação
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 3L);
		em.detach(usuario); // Colocar usuario em um estado não gerenciado, ou seja precisamos gerenciar
							// o que ira ocorrer com ele
		
		usuario.setNome("Gustavo Rodrigues Faria");
		usuario.setEmail("gustavo.faria@lanche.com.br");
		
		em.merge(usuario);	// Merge coloca em um estaod gerenciado fazendo as mudanças necessarias
		em.getTransaction().commit();
		
		System.out.println("Usuario " + usuario.getId() + " alterado com sucesso.");
		
		em.close();
		emf.close();
	}
}

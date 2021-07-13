package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Java-Persistence-API");
		EntityManager em = emf.createEntityManager();
		
		// Como preciso alterar, preciso de uma transação
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 6L);
		usuario.setNome("Karina Rodrigues Cipriano");
		
		em.merge(usuario);
		em.getTransaction().commit();
		
		System.out.println("Usuario " + usuario.getId() + " alterado com sucesso.");
		
		em.close();
		emf.close();
	}
}

package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Java-Persistence-API");
		EntityManager em = emf.createEntityManager();
		
		String jpql = "SELECT u FROM Usuario u";	// Ler dados da classe Usuario = banco de dados
		TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
		query.setMaxResults(5);	// Selecionando quantas consultas no max quero ter
		
		// PODERIA RESOLVER EM UMA LINHA
		// List<Usuario> usuarios = em.createQuery("SELECT u FROM Usuario u", Usuario.class)
		//							.setMaxResults(5)
		//							.getResultList();
		
		List<Usuario> usuarios = query.getResultList();
		
		for(Usuario usuario: usuarios) {
			System.out.println("ID: " + usuario.getId()
								+ "\nEMAIL: " + usuario.getEmail()
								+ "\nNOME: " + usuario.getNome());
			System.out.print("\n");
		}
		
		em.close();
		emf.close();
		
	}
}

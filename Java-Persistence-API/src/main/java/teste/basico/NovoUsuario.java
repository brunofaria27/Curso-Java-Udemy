package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class NovoUsuario {
	public static void main(String[] args) {
		// Entity Manager -> Faz a interação com o Banco de Dados
		
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Java-Persistence-API");
		EntityManager em = emf.createEntityManager();
		
		Usuario novoUsuario = new Usuario("Karina Rodrigues",  "karina.bugu@lanche.com.br");
		
		em.getTransaction().begin();
		em.persist(novoUsuario);
		em.getTransaction().commit();
		
		System.out.println("O ID gerado foi: " + novoUsuario.getId());
		
		em.close();
		emf.close();
		
	}
}

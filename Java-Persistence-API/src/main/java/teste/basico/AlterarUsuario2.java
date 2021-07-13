package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("Java-Persistence-API");
		EntityManager em = emf.createEntityManager();
		
		// Como preciso alterar, preciso de uma transação
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 2L);
		usuario.setNome("Bernardo Rodrigues Faria");
		
		// em.merge(usuario); -> Qualquer mudança que você faça no contexto transaction essa mudança
		// será sincronizada com o Banco de Dados, mesmo sem chamar o metódo merge
		em.getTransaction().commit();
		
		System.out.println("Usuario " + usuario.getId() + " alterado com sucesso.");
		
		em.close();
		emf.close();
	}
}

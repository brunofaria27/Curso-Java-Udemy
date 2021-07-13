package teste.umparaum;

import infra.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class NovoClienteAssento2 {
	public static void main(String[] args) {
		Assento assento = new Assento("4D");
		Cliente cliente = new Cliente("Ronaldinho", assento);
		
		DAO<Cliente> dao = new DAO<>(Cliente.class);
		dao.incluirAtomico(cliente);
		dao.fechar();
	}
}

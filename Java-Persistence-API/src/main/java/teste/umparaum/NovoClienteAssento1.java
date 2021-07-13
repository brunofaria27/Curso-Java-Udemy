package teste.umparaum;

import infra.DAO;
import modelo.umparaum.Assento;
import modelo.umparaum.Cliente;

public class NovoClienteAssento1 {
	public static void main(String[] args) {
		Assento assento = new Assento("66A");
		Cliente cliente = new Cliente("Bernardo", assento);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirT()
			.incluir(assento)
			.incluir(cliente)
			.fecharT()
			.fechar();
	}
}

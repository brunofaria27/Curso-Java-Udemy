package jdbc;

public class DAOTeste {
	public static void main(String[] args) {
		DAO dao = new DAO();
//		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
//		dao.incluir(sql, "João da Silva");
//		dao.incluir(sql, "Ana Júlia");
//		dao.incluir(sql, "Abud Sadek");
//		dao.incluir(sql, "Djalma Pereira");
		
		String sql = "INSERT INTO pessoas (nome, codigo) VALUES (?, ?)";
		dao.incluir(sql, "Bernardo Rodrigues Faria", 4);
		dao.incluir(sql, "Gustavo Rodrigues Faria", 5);
		
		dao.close();
	}
}

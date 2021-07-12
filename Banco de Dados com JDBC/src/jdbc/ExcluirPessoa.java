package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o código: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		int contador = stmt.executeUpdate();
		if(contador > 0) { // Se for maior do que 0, houve alguma alteração no BD
			System.out.println("Pessoa excluida do Banco de Dados com sucesso.");
		} else {
			System.out.println("Nenhuma pessoa foi excluida do Banco de Dados.");
		}
		System.out.println("Quantidade de pessoas excluídas = " + contador);
		
		conexao.close();
		entrada.close();
	}
}

package teste.consulta;

import java.util.List;

import infra.DAO;
import modelo.muitosparamuitos.Ator;
import modelo.muitosparamuitos.Filme;

public class ObterFilmes {
	public static void main(String[] args) {
		DAO<Filme> dao = new DAO<>(Filme.class);
		List<Filme> filmes = dao.consultar("obterfilmesComNotaMaiorQue", "nota", 8.5); // passando o nome do parametro e o valor do mesmo
	
		for(Filme filme: filmes) {
			System.out.println(filme.getNome() + " ==> " + filme.getNota());
			for(Ator ator: filme.getAtores()) {
				System.out.println(ator.getNome());
			}
		}
	
	}
}

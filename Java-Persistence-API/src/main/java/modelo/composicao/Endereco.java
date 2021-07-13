package modelo.composicao;

import javax.persistence.Embeddable;
import javax.persistence.Table;

// Pegar dados que estao dentro do EMBEDDABLE (Classe) e esses dados, podem ser compartilhados entre varias tabelas
// não necessariamente a partir de um relacionamento, mas a partir de colunas comuns que voce tera em mais de uma tabela
@Embeddable // Utilizado para colocar dentro da tabela dos que voce quiser
@Table(name = "enderecos")
public class Endereco {
	private String logradouro;
	private String complemento;

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

}

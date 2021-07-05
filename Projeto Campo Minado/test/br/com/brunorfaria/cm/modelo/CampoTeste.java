package br.com.brunorfaria.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.brunorfaria.cm.excecao.ExplosaoException;

public class CampoTeste {
	private Campo campo;
	
	@BeforeEach			//	-> Para cada metodo chamara essa função
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}
	
	@Test
	void testeVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo (3, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);	// Se o resultado for true, deu certo 
	}
	
	@Test
	void testeVizinhoDistancia1Direita() {
		Campo vizinho = new Campo (3, 4);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);	// Se o resultado for true, deu certo 
	}
	
	@Test
	void testeVizinhoDistancia1Emcima() {
		Campo vizinho = new Campo (2, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);	// Se o resultado for true, deu certo 
	}
	
	@Test
	void testeVizinhoDistancia1Embaixo() {
		Campo vizinho = new Campo (4, 3);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);	// Se o resultado for true, deu certo 
	}
	
	@Test
	void testeVizinhoDistancia2() {
		Campo vizinho = new Campo (2, 2);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertTrue(resultado);	// Se o resultado for true, deu certo 
	}
	
	@Test
	void testeNaoVizinhoDistancia() {
		Campo vizinho = new Campo (1, 1);
		boolean resultado = campo.adicionarVizinho(vizinho);
		assertFalse(resultado);	// Se o resultado for false, deu certo 
	}
	
	@Test
	void testeValorPadraoAtributoMarcado() {
		assertFalse(campo.isMarcado());
	}

	@Test
	void testeAlternarMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}
	
	@Test
	void testeAlternarMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}
	
	@Test
	void testAbrirNaoMinadoNaoMarcado() {
		assertTrue(campo.abrir());
	}

	@Test
	void testAbrirNaoMinadoMarcado() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testAbrirMinadoMarcado() {
		campo.alternarMarcacao();
		campo.minar();
		assertFalse(campo.abrir());
	}
	
	@Test
	void testAbrirMinadoNaoMarcado() {
		campo.minar();
		assertThrows(ExplosaoException.class, () -> {
			campo.abrir();
		});
	}
	
	@Test
	void testAbrirComVizinhos1() {
		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isAberto());
	}
	
	@Test
	void testAbrirComVizinhos2() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 2);
		campo12.minar();
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);
		
		campo.adicionarVizinho(campo22);
		campo.abrir();
		
		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
	
}

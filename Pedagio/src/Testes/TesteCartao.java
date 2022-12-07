package Testes;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.jupiter.api.Test;

import Modelos.Cartao;

class TesteCartao {

	@Test
	public void testeRealizarCobrança() {
		Cartao cartao = new Cartao(12345, new Date(), 123);
		
		assertTrue("Deve retornar que a cobrança foi feita", cartao.realizarCobranca(25.50));
	}

}

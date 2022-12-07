package Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import Modelos.SmartCard;

class TestSmartCard {
	@Test
	void testSaldoAoCarregarCartao() {
		SmartCard cartao = new SmartCard(123);
		cartao.carregarCartao(50.0);
		
		assertEquals("Saldo deve ser igual ao colocado", cartao.getSaldo(), 50.0, 0);
	}
	
	@Test
	void testSaldoAoDebitarCartao() {
		SmartCard cartao = new SmartCard(123);
		cartao.carregarCartao(50.0);
		cartao.debitar(19.50);
		
		assertEquals("Saldo deve ser igual ao restante", cartao.getSaldo(), 30.50, 0);
	}
	
	@Test
	void testDebitoComSucesso() {
		SmartCard cartao = new SmartCard(123);
		cartao.carregarCartao(50.0);
		
		assertTrue("Debito deve ser feito", cartao.debitar(20.25));
	}
	
	@Test
	void testDebitoComFalha() {
		SmartCard cartao = new SmartCard(123);
		cartao.carregarCartao(50.0);
		
		assertFalse("Debito deve ser feito", cartao.debitar(70.25));
	}
}

package Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.api.Test;

import Modelos.Recibo;

class TesteRecibo {

	@Test
	public void testGetValor() {
		Recibo recibo = new Recibo(22.50, "HGT-4780");
		assertEquals("Valor do recibo deve ser o mesmo dele criado", recibo.getValor(), 22.50, 0);
	}
	
	@Test
	public void testGetPlaca() {
		Recibo recibo = new Recibo(22.50, "HGT-4780");
		assertEquals("Placa do recibo deve ser o mesmo dela criada", recibo.getPlaca(), "HGT-4780");
	}
	
	@Test
	public void testGetDataNotNull() {
		Recibo recibo = new Recibo(22.50, "HGT-4780");
		assertNotNull("Data nao pode ser nula", recibo.getData());
	}

}

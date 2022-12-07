package Testes;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

import Modelos.Cancela;

public class TesteCancela {

	@Test
	public void testAbrirCancela() {
		Cancela cancela = new Cancela();
		
		assertTrue("Cancela deve estar aberta", cancela.abrirCancela());
	}
	
	@Test 
	public void testFecharCancela() {
		Cancela cancela = new Cancela();
		
		assertFalse("Cancela deve estar fechada", cancela.fecharCancela());
	}
	
	@Test
	public void testGetLedVerdeTrue() {
		Cancela cancela = new Cancela();
		cancela.abrirCancela();
		
		assertTrue("Led verde deve estar aceso", cancela.getLedVerde());
	}
	
	@Test
	public void testGetLedVerdeFalse() {
		Cancela cancela = new Cancela();
		cancela.abrirCancela();
		cancela.fecharCancela();
		
		assertFalse("Led verde deve estar aceso", cancela.getLedVerde());
	}
	
	@Test
	public void testGetLedVermelhoFalse() {
		Cancela cancela = new Cancela();
		cancela.abrirCancela();
		
		assertTrue("Led verde deve estar aceso", cancela.getLedVermelho());
	}
	
	@Test
	public void testGetLedVermelhoTrue() {
		Cancela cancela = new Cancela();
		cancela.abrirCancela();
		cancela.fecharCancela();
		
		assertFalse("Led verde deve estar aceso", cancela.getLedVermelho());
	}

}

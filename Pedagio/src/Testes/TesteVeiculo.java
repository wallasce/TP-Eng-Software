package Testes;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Modelos.Veiculo;

class TesteVeiculo {
	@Test
	void testGetModelo() {
		int modelo = 2;
		Veiculo veiculo = new Veiculo(modelo, "HDE-1234");
		assertEquals("Modelo deve ser o mesmo inserido", modelo, veiculo.getModelo());
	}
	
	@Test
	void testGetPlaca() {
		String placa = "HDE-1234";
		Veiculo veiculo = new Veiculo(2, placa);
		assertEquals("Modelo deve ser o mesmo inserido", placa, veiculo.getPlaca());
	}
}

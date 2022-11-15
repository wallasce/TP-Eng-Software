package Modelos;

import java.util.Date;
import java.util.Random;

public class Cartao {
	protected int numeroCartao;
	protected Date validade;
	protected int cvv;
	
	public Cartao(int numeroCartao, Date validade, int cvv) {
		this.numeroCartao = numeroCartao;
		this.validade = validade;
		this.cvv = cvv;
	}
	
	/**
	 * Função que simula a cobrança no cartão.
	 * @param valor, valor a ser cobrado.
	 * @return true se a cobrança for feita com sucesso.
	 */
	public boolean realizarCobranca(double valor) {
		Random random = new Random();
		int numeroSorteado = random.nextInt(100);
		
		if (numeroSorteado < 97) {
			return true;			
		}else {
			return false;
		}
	}
}

package Modelos;

public class SmartCard {
	protected int numeroCartao;
	protected double saldo;
	
	public SmartCard(int numeroCartao) {
		this.numeroCartao = numeroCartao;
		this.saldo = 0;
	}
	
	public void carregarCartao(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Debita valor do saldo do Smart Card.
	 * @param valor
	 * @return true se foi possível debitar.
	 */
	public boolean debitar(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
}

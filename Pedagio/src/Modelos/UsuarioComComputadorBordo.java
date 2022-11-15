package Modelos;

public class UsuarioComComputadorBordo extends Usuario {
	protected Cartao cartao;

	public UsuarioComComputadorBordo(Veiculo veiculo, String cpf, String cnh, Cartao cartao) {
		super(veiculo, cpf, cnh);
		this.cartao = cartao;
	}
	
	public void setCartao(Cartao cartao) {
		this.cartao = cartao;
	}
	
	public boolean cobrar(double valor) {
		return this.cartao.realizarCobranca(valor);
	}

}

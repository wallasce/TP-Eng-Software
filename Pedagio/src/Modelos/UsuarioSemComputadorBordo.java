package Modelos;

public class UsuarioSemComputadorBordo extends Usuario {
	protected SmartCard cartao;

	public UsuarioSemComputadorBordo(Veiculo veiculo, String cpf, String cnh, SmartCard cartao) {
		super(veiculo, cpf, cnh);
		
		this.cartao = cartao;
	}
	
	public void setSmartCard(SmartCard cartao) {
		this.cartao = cartao;
	}
	
	public boolean cobrar(double valor) {
		return this.cartao.debitar(valor);
	}

}

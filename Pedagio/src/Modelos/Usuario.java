package Modelos;

public abstract class Usuario {
	protected Veiculo veiculo;
	protected String cpf;
	protected String cnh;
	
	public Usuario(Veiculo veiculo, String cpf, String cnh) {
		this.veiculo = veiculo;
		this.cpf = cpf;
		this.cnh = cnh;
	}
	
	public String ConsultarPlaca() {
		return this.veiculo.getPlaca();
	}
	
	public int ConsultarTipoVeiculo() {
		return this.veiculo.getModelo();
	}
}

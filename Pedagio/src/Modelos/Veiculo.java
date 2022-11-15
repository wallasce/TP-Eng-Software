package Modelos;

public class Veiculo {
	private String modelo;
	private String placa;
	
	public Veiculo(String modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public String getPlaca() {
		return this.placa;
	}
}

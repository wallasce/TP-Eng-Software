package Modelos;

public class Veiculo {
	private int modelo;
	private String placa;
	
	public Veiculo(int modelo, String placa) {
		this.modelo = modelo;
		this.placa = placa;
	}
	
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
	public int getModelo() {
		return this.modelo;
	}
	
	public String getPlaca() {
		return this.placa;
	}
}

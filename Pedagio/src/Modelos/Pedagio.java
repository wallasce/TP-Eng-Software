package Modelos;

import java.util.ArrayList;

public class Pedagio {
	protected ArrayList<Recibo> recibos;
	protected ArrayList<Usuario> usuarios;
	protected double valorAcumlado; 
	protected Cancela cancela;
	
	public Pedagio() {
		this.recibos = new ArrayList<Recibo>();
		this.usuarios = new ArrayList<Usuario>();
		this.valorAcumlado = 0;
		
		// Talvez Carregar um JSON?
	}
	
	private Boolean consultarPRF(String placa) {
		// Fazer algum codigo de simulacao de consulta a PRF
		return false;
	}
	
	private void notificarPRF(String causa, String placa) {
		// Fazer algum codigo de simulacao de envio a PRF
	}
	
	private int buscarTipoVeiculo(String Placa) {
		for (int i = 0; i < this.usuarios.size(); i++ ) {
			if (Placa == this.usuarios.get(i).veiculo.getPlaca()) {
				return this.usuarios.get(i).veiculo.getModelo();
			}
		}
		return 0;
	}
	
	private double calculaTarifa(int modeloVeiculo) {
		switch (modeloVeiculo) {
			case 1: return 5.20;
			case 2: return 10.40;
			case 3: return 7.80;
			case 4: return 15.60;
			case 5: return 10.40;
			case 6: return 20.80;
			case 7: return 26.00;
			case 8: return 31.20;
			case 9: return 2.60;
			case 10: return 0;
			default: return -1;
		}
	}
	
	public void executar() {
		while(true) {
			//dormir ate receber uma placa?
			String placa = "XXX-XXXX";
			
			double valorCobrar = this.calculaTarifa(this.buscarTipoVeiculo(placa)); 
		}
	}
}

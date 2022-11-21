package Modelos;

import java.util.ArrayList;

public class Pedagio {
	protected ArrayList<Recibo> recibos;
	protected ArrayList<Usuario> usuarios;
	protected float valorAcumlado; 
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
	
	private String buscarTipoVeiculo(String Placa) {
		for (int i = 0; i < this.usuarios.size(); i++ ) {
			if (Placa == this.usuarios.get(i).veiculo.getPlaca()) {
				return this.usuarios.get(i).veiculo.getModelo();
			}
		}
		return "ERRO";
	}
	
	public void executar() {
		while(true) {
			//dormir ate receber uma placa?
			String placa = "XXX-XXXX";
			
			String tipoVeiculo = this.buscarTipoVeiculo(placa);
		}
	}
}

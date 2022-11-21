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
	
	private String getTipoVeiculo(String Placa) {
		for (int i = 0; i < this.usuarios.size(); i++ ) {
			String placaCorrente = this.usuarios.get(i).veiculo.getPlaca();
			if (Placa == placaCorrente) {
				return placaCorrente;
			}
		}
		return "ERRO";
	}
	
	
	
}

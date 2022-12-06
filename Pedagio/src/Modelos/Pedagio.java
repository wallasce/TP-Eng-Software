package Modelos;

import java.util.ArrayList;

public class Pedagio {
	protected ArrayList<Recibo> recibos;
	protected ArrayList<Usuario> usuarios;
	protected boolean alerta;
	protected double valorAcumlado; 
	protected Cancela cancela;
	
	public Pedagio() {
		this.cancela = new Cancela();
		this.recibos = new ArrayList<Recibo>();
		this.usuarios = new ArrayList<Usuario>();
		this.valorAcumlado = 0;
	}
	
	private Boolean consultarPRF(String placa) {
		// Simularia uma consulta a API da PRF
		return false;
	}
	
	private void notificarPRF(String causa, String placa) {
		// Simula o envio de uma notificação a PRF
	}
	
	private Usuario buscarUsuario(String Placa) {
		for (int i = 0; i < this.usuarios.size(); i++ ) {
			if (Placa == this.usuarios.get(i).veiculo.getPlaca()) {
				return this.usuarios.get(i);
			}
		}
		return null;
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
			this.alerta = false;
			
			// Linha abaixo receberia uma placa.
			String placa = "XXX-XXXX";
			
			if (this.consultarPRF(placa)) {
				this.notificarPRF("Documento Atrasado.", placa);
			}
			
			Usuario usuario = this.buscarUsuario(placa);
			double valorCobrar = this.calculaTarifa(usuario.veiculo.getModelo()); 
			
			if (usuario.cobrar(valorCobrar)) {
				this.valorAcumlado += valorCobrar;
				this.cancela.abrirCancela();
				// Confirmacao que carro passou
				this.cancela.fecharCancela();
				recibos.add(new Recibo(valorCobrar, placa));
			} else {
				this.alerta = true;
				//Ação manual necessaria
			}
		}
	}
}

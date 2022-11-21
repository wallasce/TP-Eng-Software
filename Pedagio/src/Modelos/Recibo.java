package Modelos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Recibo {
	private float valor;
	private String data;
	private String placa;
	
	Recibo(float valor, String placa) {
		this.valor = valor;
		this.placa = placa;
		
		DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		this.data = formatoData.format(new Date());
	}
	
	public float getValor() {
		return this.valor;
	}
	
	public String getData() {
		return this.data;
	}
	
	public String getPlaca() {
		return this.placa;
	}
}

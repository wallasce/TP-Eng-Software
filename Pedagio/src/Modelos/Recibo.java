package Modelos;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Recibo {
	private double valor;
	private String data;
	private String placa;
	
	public Recibo(double valor, String placa) {
		this.valor = valor;
		this.placa = placa;
		
		DateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		this.data = formatoData.format(new Date());
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public String getData() {
		return this.data;
	}
	
	public String getPlaca() {
		return this.placa;
	}
}

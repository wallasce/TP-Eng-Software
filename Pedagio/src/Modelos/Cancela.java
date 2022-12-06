package Modelos;

public class Cancela {
	private Boolean aberta;
	private Boolean ledVerde;
	private Boolean ledVermelho;
	
	public Cancela() {
		this.aberta = false;
		this.ledVerde = false;
		this.ledVermelho = true;
	}
	
	public boolean abrirCancela() {
		this.aberta = true;
		this.ledVerde = true;
		this.ledVermelho = false;
		
		return this.aberta;
	}
	
	public boolean fecharCancela() {
		this.aberta = false;
		this.ledVerde = false;
		this.ledVermelho = true;
		
		return this.aberta;
	}
	
	public boolean getLedVerde() {
		return this.ledVerde;
	}
	
	public boolean getLedVermelho() {
		return this.ledVermelho;
	}
}

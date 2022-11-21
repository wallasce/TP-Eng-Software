package Modelos;

public class Cancela {
	private Boolean aberta;
	
	public Cancela() {
		this.aberta = false;
	}
	
	public boolean abrirCancela() {
		this.aberta = true;
		
		return this.aberta;
	}
	
	public boolean fecharCancela() {
		this.aberta = false;
		
		return this.aberta;
	}
}

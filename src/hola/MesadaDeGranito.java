package hola;


public class MesadaDeGranito {
	
	private int grosor, ancho, largo;
	private static int numeroMesas;
	
	public MesadaDeGranito(int grosor, int ancho, int largo) {
		this.setGrosor(grosor);
		this.setAncho(ancho);
		this.setLargo(largo);
	}
	
	public MesadaDeGranito() {
		this.setGrosor(0);
		this.setAncho(0);
		this.setLargo(0);
	}
	
	public int getGrosor() {
		return this.grosor;
	}
	
	public int getAncho() {
		return this.ancho;
	}
	
	public int getLargo() {
		return this.largo;
	}
	
	public void setGrosor(int nuevoGrosor) {
		this.grosor = nuevoGrosor;
	}
	
	public void setAncho(int nuevoAncho) {
		this.ancho = nuevoAncho;
	}
	
	public void setLargo(int nuevoLargo) {
		this.largo = nuevoLargo;
	}
	
	public String toString() {
		return "Grosor: " +this.getGrosor()+ " Ancho: " +this.getAncho()+ 
				" Largo: " +this.getLargo()+ ".\n";
	}
	
	public void rotar90Grados(){
		int ancho = this.getAncho();
		this.setAncho(this.getLargo());
		this.setLargo(ancho);
	}
	
	public static int getNumeroMesas() {
		return numeroMesas;
	}

	public static void setNumeroMesas(int numeroMesas) {
		MesadaDeGranito.numeroMesas = numeroMesas;
	}
}


package hola;

import java.io.FileNotFoundException;
import java.util.Stack;

public class Deposito {
	
	private int contadorMinimo;
	private static int contadorPila = 0;
	private Stack<MesadaDeGranito> pila;
	
	public Deposito() throws FileNotFoundException {
		this.setContadorMinimo(0);
		this.setPila(new Archivo().leerArchivo());
	}
	
	public Stack<MesadaDeGranito> apilarMesadas(Stack<MesadaDeGranito> pila) {

		Stack<MesadaDeGranito> pilaDeMesadas = new Stack<MesadaDeGranito>();
	
		try {

		 pilaDeMesadas.add(pila.get(0));
		 pila.remove(0);
	
		 for(int i = 0; i <  MesadaDeGranito.getNumeroMesas()-1; i++) {	
			if(pila.get(i).getLargo() <= pilaDeMesadas.get(contadorPila).getLargo() 
				&& pila.get(i).getAncho() <= pilaDeMesadas.get(contadorPila).getAncho()) {
				pilaDeMesadas.push(pila.get(i));
				contadorPila++;

				} else {
					pila.get(i).rotar90Grados();
					
					if(pila.get(i).getLargo() <= pilaDeMesadas.get(contadorPila).getLargo() 
							&& pila.get(i).getAncho() <= pilaDeMesadas.get(contadorPila).getAncho()) {
							pilaDeMesadas.push(pila.get(i));
							contadorPila++;
						}
				}			
			} 
	      } catch(ArrayIndexOutOfBoundsException ex) {
	           System.out.println(ex.getMessage() + " hay un elemento fuera de rango o el archivo esta vacio"); 
	           System.exit(contadorPila);
	    }
		  return pilaDeMesadas; 
	 }
	
	public int getDevolverCantidadDeMesadasApiladas(Stack<MesadaDeGranito> otraPila) {
		this.setContadorMinimo(otraPila.size());
		return this.getContadorMinimo();
	}
	
	
	public int getContadorMinimo() {
		return this.contadorMinimo;
	}
	
	public Stack<MesadaDeGranito> getPila(){
		return this.pila;
	}
	
	public void setContadorMinimo(int contador) {
		this.contadorMinimo = contador;
	}
	
	public void setPila(Stack<MesadaDeGranito> otraPila) {
		this.pila = otraPila;
	}
	
	public String toString() {
		return "Mesadas de Granito: " +this.getPila();
	}

}
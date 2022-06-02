package hola;

import java.io.FileNotFoundException;
import java.util.Stack;

public class TestMesadasDeGranito {

	public static void main(String[] args) throws FileNotFoundException {
		
		Archivo a1 = new Archivo();
		Deposito dep = new Deposito();

		System.out.println(dep);
		
		Stack<MesadaDeGranito> pilaMesadasApiladas = dep.apilarMesadas(dep.getPila());
		System.out.println(pilaMesadasApiladas);
		
		dep.getDevolverCantidadDeMesadasApiladas(pilaMesadasApiladas);
		System.out.println(dep.getDevolverCantidadDeMesadasApiladas(pilaMesadasApiladas));
		
		a1.escribirArchivo(dep.getDevolverCantidadDeMesadasApiladas(pilaMesadasApiladas));
		

	}

}
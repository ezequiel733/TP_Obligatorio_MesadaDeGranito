package hola;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Stack;
import java.util.stream.Stream;

import com.sun.tools.sjavac.server.SysInfo;

public class Archivo {
	
	public Stack<MesadaDeGranito> leerArchivo() throws FileNotFoundException {
		Stack<MesadaDeGranito> pila = new Stack<MesadaDeGranito>();
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			file = new File("mesadas.in");
			
			fr = new FileReader(file);
			br = new BufferedReader(fr);

			String linea = br.readLine();
			
			int numeroMesas = Integer.parseInt(linea);
			MesadaDeGranito.setNumeroMesas(numeroMesas);
			
			linea = br.readLine();

			while(linea != null) {
				String [] datos;

				datos = linea.split(" ");
		
				MesadaDeGranito m2 = new MesadaDeGranito();
				Integer p1 = Integer.parseInt(datos[0]);
				Integer p2 = Integer.parseInt(datos[1]);
	
				m2.setAncho(p1);
				m2.setLargo(p2);
				
				if(datos.length == 2) {
					//System.out.println(m1);
					pila.push(m2);
				}
				linea = br.readLine();
			}
			
		}catch(IOException e) {
			e.getMessage();
			System.out.println("no se se encuentra ningun archivo");
			
		} finally {
				
			try {
				if(fr != null) {
					fr.close();
				}
				return pila;
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
		
		return null;		
	}
	
	public void escribirArchivo(int numero) {
		
		File file = null;
		FileWriter fw = null;
		PrintWriter pw = null;
		
		try {
			file = new File("mesadas.out");
			fw = new FileWriter(file);
			pw = new PrintWriter(fw);
			
			pw.print(numero);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pw != null) {
					pw.close();
				}
			}catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}

package datos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import model.Juego;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Clase: InventarioImp<br>
 * Descripción: Esta clase sirve para trabajar con datos e implementa la
 * interfaz Inventario
 * 
 * @author María Hernández
 * @version 15/06/2021/A
 */
public class InventarioImp implements Inventario {

	public static final String SEPARATOR = ",";

	private Map<Integer, Juego> inventario = new HashMap<>();

	public Map<Integer, Juego> getInventario() {
		return inventario;
	}

	public void setInventario(Map<Integer, Juego> inventario) {
		this.inventario = inventario;
	}

	/*
	 * MÉTODOS
	 */
	/**
	 * <p>
	 * Método que añade un juego nuevo al inventario.
	 * 
	 * @param pk - Primary Key
	 * @param j  - Juego
	 * @return boolean
	 *         </p>
	 */
	public boolean addJuego(int pk, Juego j) {
		if (inventario.containsKey(pk)) {
			System.out.println("No se puede guardar el juego. El código está repetido. ");
			return false;
		} else {
			inventario.put(pk, j);
			return true;
		}
	}

	/**
	 *<p>
	 * Método que devuelve si existe un registro.
	 * @author María Hernández
	 * @param pk- Primary Key
	 * @return boolean
	 * </p>
	 */
	public boolean existePk(int pk) {
		return inventario.containsKey(pk);
	}

	/**
	 * <p>
	 * Método que reliza la carga inicial de datos en el programa.
	 * 
	 * @return boolean
	 *         </p>
	 */
	@Override
	public boolean cargaInicial() {
		BufferedReader br = null;
		Juego juego;
	      
	      try {
	         
	         br =new BufferedReader(new FileReader("../data/vgsales.csv"));
	         String line = br.readLine();
	         
	         while (null!=line) {
	            String [] fields = line.split(SEPARATOR);
	            juego = lineToJuego(fields);
	            inventario.put(Juego.ID, juego);
	            line = br.readLine();
	         }
	         if (null!=br)
		            br.close();
	         
	      } catch (Exception e) {
	         e.getMessage();
	      } 
	      
		return false;
	}
	
	private Juego lineToJuego(String[] linea) {
		Juego juego = new Juego(linea);
		return juego;
	}

}

package datos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import lombok.Data;
import model.Juego;
import java.io.BufferedReader;
import java.io.FileReader;


/**
 * <p>
 * Clase: InventarioImp<br>
 * Descripci�n: Esta clase sirve para trabajar con datos e implementa la
 * interfaz Inventario
 * @author Mar�a Hern�ndez
 * @version 15/06/2021/A
 * <\p>
 */

public class InventarioImp implements Inventario {

	public static final String SEPARATOR = ",";

	private Map<Integer, Juego> inventario = new HashMap<>();
	
	public InventarioImp() {
		super();
		this.cargaInicial();
	}


	public Map<Integer, Juego> getInventario() {
		return inventario;
	}

	public void setInventario(Map<Integer, Juego> inventario) {
		this.inventario = inventario;
	}

	/*
	 * M�TODOS
	 */
	/**
	 * <p>
	 * M�todo que a�ade un juego nuevo al inventario.
	 * @author Mar�a Hern�ndez
	 * @param pk - Primary Key
	 * @param j  - Juego
	 * @return boolean
	 *         </p>
	 */
	public boolean addJuego(int pk, Juego j) {
		if (inventario.containsKey(pk)) {
			System.out.println("No se puede guardar el juego. El c�digo est� repetido. ");
			return false;
		} else {
			inventario.put(pk, j);
			return true;
		}
	}

	/**
	 *<p>
	 * M�todo que devuelve si existe un registro.
	 * @author Mar�a Hern�ndez
	 * @param pk- Primary Key
	 * @return boolean
	 * </p>
	 */
	public boolean existePk(int pk) {
		return inventario.containsKey(pk);
	}

	/**
	 * <p>
	 * M�todo que reliza la carga inicial de datos en el programa.
	 * 
	 * @return boolean
	 *         </p>
	 */
	@Override
	public boolean cargaInicial() {
		BufferedReader br = null;
		Juego juego;
	      
	      try {
	         
	         br =new BufferedReader(new FileReader("data/vgsales.csv"));
	         String line = br.readLine();
	         
	         while (null!=line) {
	            String [] fields = line.split(SEPARATOR);
	            juego = lineToJuego(fields);
	            inventario.put(juego.getSelfID(), juego);
	            line = br.readLine();
	         }
	         if (null!=br)
		            br.close();
	         
	      } catch (Exception e) {
	    	 
	         System.out.println(e.getMessage());
	      } 
	      
		return false;
	}
	
	private Juego lineToJuego(String[] linea) {
		Juego juego = new Juego(linea);
		return juego;
	}
	
	public void listarJuegos() {
		

		
		inventario.entrySet()
		.stream()
		//.map(j -> j.getValue())
		//.collect(Collectors.toList());
		
		.forEach(juegos -> {
			System.out.println(juegos.getValue());
			
		});
		
	}
	

}

package datos;


import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;
import java.util.Map.Entry;
import java.util.TreeMap;
import model.Juego;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Collections;
import java.util.Iterator;



/**
 * <p>
 * Clase: InventarioImp<br>
 * Descripción: Esta clase sirve para trabajar con datos e implementa la
 * interfaz Inventario
 * 
 * @author María Hernández
 * @version 15/06/2021/A <\p>
 */

public class InventarioImp implements Inventario {

	public static final String SEPARATOR = ",";

	private Map<Integer, Juego> inventario = new HashMap<>();

	/*public InventarioImp() {
		super();
		this.cargaInicial();
	}*/

	public static String getSeparator() {
		return SEPARATOR;
	}

	public Map<Integer, Juego> getInventario() {
		return inventario;
	}

	public void setInventario(Map<Integer, Juego> inventario) {
		this.inventario = inventario;
	}

	/*
	 * MÉTODOS
	 */
	
	public void elegirCarga () {
		
		this.cargaInicial();
	}
	
	/**
	 * <p>
	 * Método que añade un juego nuevo al inventario.
	 * 
	 * @author María Hernández
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
	 * <p>
	 * Método que permite eliminar del inventrio un juego a través de su clave
	 * @autor Desiree
	 * @version 17/06/2021/A
	 * </p>
	 */
	public boolean eliminarJuego(int codigo) {
		if(!inventario.containsKey(codigo)) {
			System.out.println("El juego no existe");
			return false;
		}else {
			inventario.remove(codigo);
			return true;
		}
		
	} 

	/**
	 * <p>
	 * Método que devuelve si existe un registro.
	 * 
	 * @author María Hernández
	 * @param pk- Primary Key
	 * @return boolean
	 *         </p>
	 */
	public boolean existePk(int pk) {
		return inventario.containsKey(pk);
	}

	/**
	 * <p>
	 * Método que reliza la carga inicial de datos en el programa.
	 * @author Irene
	 * @return boolean
	 *         </p>
	 */
	@Override
	public boolean cargaInicial() {
		BufferedReader br = null;
		Juego juego;

		try {

			br = new BufferedReader(new FileReader("data/vgsales.csv"));
			br.readLine();
			String line = br.readLine();

			while (null != line) {
				String[] fields = line.split(SEPARATOR);
				juego = lineToJuego(fields);
				if (juego != null)
					inventario.put(juego.getSelfID(), juego);
				line = br.readLine();
			}
			if (null != br)
				br.close();

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		return false;
	}

	private Juego lineToJuego(String[] linea) {
		Juego juego = null;
		try {
			juego = new Juego(linea);
		
		}catch(Exception e){
			e.getMessage();
		}
		return juego;
	}
	
	/**
	 * Este método muestra todos los juegos por pantalla
	 * @autor desiree
	 * @version 17/06/2021/A
	 */
	public boolean listarJuegos() {
		if(!inventario.isEmpty()) {
		inventario.entrySet().stream().forEach(juegos -> {
		System.out.println(juegos.getValue());
		});
		return true;
		}
		return false;
	}
	/**
	 * Método: Recibe una clave y un valor para actualizar un registro del Map
	 * @author Irene
	 * @param key
	 * @param value
	 */
	public boolean editarRanking(int key,int value) {
		try {
		if (value > 0 && this.existePk(key)) {
			inventario.get(key).setRank(value);
			System.out.println("Modificado con éxito");
			return true;
		}else {
			
			System.out.println("No puedes editar el ranking");
			return false;
		}
		
		}catch (Exception e) {
			System.out.println("Ha ocurrido un error");
		}
		return false;
	}	
	
	/**
	 * <p>
	 * Método que lista los nombres de los juegos disponibles
	 * @author María Hernández
	 * @version 17/06/2021/A
	 * <\p>
	 */
	public boolean listarNombres() {
		
		if(!inventario.isEmpty()){
		inventario.entrySet()
		.stream()
		.forEach(juegos -> {System.out.println(juegos.getKey()+"--"+juegos.getValue().getName());

		});
		return true;
		}else {
			
			return false;
		}

	}

	
	
	
	/**
	 * <p>
	 * Método que devuelve un HashMap ordenado de manera descendente por el valor del atributo EuSales
	 * del objeto Juego
	 * @author Daniela Posas
	 * @param map HashMap
	 * @return Map<double, String>
	 */


	public Map<Double, String> leerVentas(InventarioImp inventario) {
		
		Map<Double, String> inventario2 = new HashMap<Double,String>();
		inventario.getInventario().forEach((idJuego,juego) -> inventario2.put(juego.getEuSales(), juego.getName()));
		
		Map<Double, String> reverseSortedMap = new TreeMap<Double, String>(Collections.reverseOrder());
		reverseSortedMap.putAll(inventario2);
		

		return reverseSortedMap;
		}
	
	
	
	/**
	 * <p>
	 * Método que devuelve un HashMap con los 10 primeros elementos del map que se pasa por parámetro
	 * @author Daniela Posas
	 * @param map HashMap
	 * @return Map<double, String>
	 */
	public Map<Double, String> listarMasVendidos(Map<Double, String> map) {
		
		Map<Double, String> mapa = map;
		int contador = 0;
		Iterator<Entry<Double, String>> entries = map.entrySet().iterator();
		
		
		while (entries.hasNext() && contador < 10) {
		    Entry<Double, String> entry = entries.next();
		    mapa.put(entry.getKey(), entry.getValue());
		    System.out.println(entry.getValue() + " = "+  entry.getKey());
		    contador ++;
		}
		
		return mapa;
	}
	

}
	
	


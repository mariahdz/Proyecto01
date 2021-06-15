package datos;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

import model.Juego;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * <p>
 * @author Mar�a Hern�ndez
 * @version 15/06/2021/A
 * </p>
*/
public class InventarioImp implements Inventario {

	private Map<Integer, Juego> inventario= new HashMap<>();
	
	public Map<Integer, Juego> getInventario(){
		return inventario;
	}
	
	public void setInventario(Map<Integer, Juego> inventario) {
		this.inventario=inventario;
	}

	/*
	 * M�TODOS
	 */
	/**
	 * <p>
	 * M�todo que a�ade un juego nuevo al inventario.
	 * @param pk - Primary Key
	 * @param j - Juego
	 * @return boolean
	 * </p>
	 */
	public boolean addJuego (int pk, Juego j) {
		if(inventario.containsKey(pk)) {
			System.out.println("No se puede guardar el juego. El c�digo est� repetido. ");
			return false;
		}else {
			inventario.put(pk, j);
			return true;
		}
	}
	
	/**
	 *<p>
	 * M�todo que devuelve si existe un registro. 
	 * @param pk- Primary Key
	 * @return
	 * </p>
	 */
	public boolean existePk(int pk) {
		return inventario.containsKey(pk);
	}



}


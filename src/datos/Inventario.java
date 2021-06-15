package datos;

import model.Juego;

/**
 * 
 * @author María Hernández
 * @version 15/06/2021/A
 *
 */
public interface Inventario {

	public boolean addJuego(int pk, Juego j);
	public boolean existePk(int pk);
	
}

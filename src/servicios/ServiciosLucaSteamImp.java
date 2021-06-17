package servicios;

import java.util.List;

import datos.Inventario;
import datos.InventarioImp;
import model.Juego;
import utilidades.RecogerDatos;

/**
 * Clase: ServiciosLucaSteamImp <br>
 * Descripción: Esta clase implementa la interfaz ServiciosLucaSteam
 * 
 * @author Desiree
 * @version 15/06/2021/A
 */

public class ServiciosLucaSteamImp implements ServiciosLucaSteam {

	private Inventario inventario = new InventarioImp();

	/**
	 * Este método permite añadir un juego al inventario
	 * @autor Desiree
	 * @version 15/06/2021/A
	 * </p>
	 */
	public boolean addJuego() {
		Juego juego = new Juego();
		juego.crearJuego();
		return addJuego(juego.getSelfID(), juego);
	}

	public boolean addJuego(int codigo, Juego juego) {
		if (juego != null) {
			inventario.addJuego(codigo, juego);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * <p>
	 * Método que permite eliminar del inventario un juego solicitando la clave por teclado
	 * @autor Desiree
	 * @version 17/06/2021/A
	 * </p>
	 * @throws Exception
	 */
	public void eliminarJuego () throws Exception {
	     int codigo = RecogerDatos.recogeInt("Indica el código del producto que quieres eliminar");
	     eliminarJuego(codigo);
	}
	    
	public boolean eliminarJuego (int codigo) {
	    return inventario.eliminarJuego(codigo);
	}
	
	/**
	 * Este método llama a la capa de datos para solicitar el listado de juegos sin filtrar
	 * @autor Desiree
	 * @version 15/06/2021/A   
	 */
	public void listarJuegos() {
		inventario.listarJuegos();
	}

	/**
	 * Este método permite editar el atributo ranking de un juego
	 * @autor irene
	 * @version 16/06/2021/A
	 */
	public boolean editarRanking(int key) {
		int value = 0;
		try {
			value = RecogerDatos.recogeInt("Introduzca el valor del Ranking");
			if (value > 0 && inventario.existePk(key)) {
				inventario.editarRanking(key, value);
				return true;
			}
			else {
				System.out.println("Ha ocurrido un error.");
				return false;
			}
		} catch (Exception e) {
			System.out.println("Ha ocurrido un error.");
		}
			return false;
	}

}

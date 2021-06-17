package servicios;


import java.util.Map;

import datos.Inventario;
import datos.InventarioImp;
import model.Juego;
import utilidades.RecogerDatos;

/**
 * Clase: ServiciosLucaSteamImp <br>
 * Descripci�n: Esta clase implementa la interfaz ServiciosLucaSteam
 * 
 * @author Desiree
 * @version 17/06/2021/B
 */

public class ServiciosLucaSteamImp implements ServiciosLucaSteam {

	private Inventario inventario = new InventarioImp();

	/**
	 * Este m�todo permite a�adir un juego al inventario
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
	
	public void elegirCarga() {
		inventario.elegirCarga();
	}
	
	/**
	 * <p>
	 * M�todo que permite eliminar del inventario un juego solicitando la clave por teclado
	 * @autor Desiree
	 * @version 17/06/2021/A
	 * </p>
	 * @throws Exception
	 */
	public void eliminarJuego () throws Exception {
	     int codigo = RecogerDatos.recogeInt("Indica el c�digo del producto que quieres eliminar");
	     eliminarJuego(codigo);
	}
	    
	public boolean eliminarJuego (int codigo) {
	    return inventario.eliminarJuego(codigo);
	}
	
	/**
	 * Este m�todo llama a la capa de datos para solicitar el listado de juegos sin filtrar
	 * @autor Desiree
	 * @version 15/06/2021/A   
	 */
	public void listarJuegos() {
		inventario.listarJuegos();
	}
	
	public boolean editarRanking() {
		int key=0;
		
		try {
			key = RecogerDatos.recogeInt("Introduzca la clave del juego que quieres editar");

		}catch (Exception e) {
				System.out.println("Ha ocurrido un error");
				return false;
			}
		return editarRanking(key);
	}

	/**
	 * Este m�todo permite editar el atributo ranking de un juego
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

	
	public void listarNombres() {
		inventario.listarNombres();
	}

	
	public void listarMasVendidos() {
		inventario.listarMasVendidos(inventario.leerVentas(inventario));
		
	}
}

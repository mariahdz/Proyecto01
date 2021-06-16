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

	public void listarJuegos() {
		inventario.listarJuegos();
	}

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

package servicios;

import datos.InventarioImp;
import model.Juego;

/**
*Clase: ServiciosLucaSteamImp <br>
*Descripción: Esta clase implementa la interfaz ServiciosLucaSteam
* @author Desiree
* @version 15/06/2021/A
*/

public class ServiciosLucaSteamImp implements ServiciosLucaSteam {
	
	private InventarioImp  inventario = new InventarioImp();
	
	public void addJuego() {
        Juego juego = new Juego();
        juego.crearJuego();
        addJuego(Juego.ID, juego);
    }

    public void addJuego(int codigo, Juego juego) {
         inventario.addJuego(codigo, juego);
    }

}

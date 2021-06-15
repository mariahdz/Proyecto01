package servicios;

import java.util.List;

import datos.Inventario;
import datos.InventarioImp;
import model.Juego;

/**
*Clase: ServiciosLucaSteamImp <br>
*Descripción: Esta clase implementa la interfaz ServiciosLucaSteam
* @author Desiree
* @version 15/06/2021/A
*/

public class ServiciosLucaSteamImp implements ServiciosLucaSteam {
	
	private Inventario inventario = new InventarioImp();
	
	public boolean addJuego() {
        Juego juego = new Juego();
        juego.crearJuego();
        return addJuego(Juego.ID, juego);
    }

    public boolean addJuego(int codigo, Juego juego) {
    	if(juego != null) {
    		 inventario.addJuego(codigo, juego);
    		 return true;
    	}else {
    		return false;
    	}
    }
    
    public List<Juego> listarJuegos() {
    	return inventario.listarJuegos();
    }
}

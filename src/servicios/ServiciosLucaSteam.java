package servicios;

import java.util.List;

import model.Juego;

/**
*Interfaz: ServiciosLucaSteam <br>
*Descripci�n: Esta interfaz contiene los m�todos que se utilizan en la capa de servicios
* @author Desiree
* @version 15/06/2021/A
*/

public interface ServiciosLucaSteam {
	
	public boolean addJuego(int codigo, Juego juego);
	public boolean addJuego();
	
	public List<Juego> listarJuegos();
	
	

}

package servicios;

import java.util.List;

import model.Juego;

/**
*Interfaz: ServiciosLucaSteam <br>
*Descripción: Esta interfaz contiene los métodos que se utilizan en la capa de servicios
* @author Desiree
* @version 15/06/2021/A
*/

public interface ServiciosLucaSteam {
	
	public boolean addJuego(int codigo, Juego juego);
	public boolean addJuego();
	
	public void listarJuegos();
	public void listarNombres();
	
	public boolean editarRanking();
	public boolean editarRanking(int key);
	
	

}

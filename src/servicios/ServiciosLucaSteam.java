package servicios;



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
	
	public void eliminarJuego () throws Exception;
	public boolean eliminarJuego(int codigo);
	
	public void listarJuegos();
	public void listarNombres();
	
	public boolean editarRanking();
	public boolean editarRanking(int key);
	
	public void elegirCarga();
	
	

}

package datos;

import java.util.List;

import model.Juego;

/**
* Interfaz: Inventario<br>
* Descripci�n: Esta interfaz sirve para contener los m�todos que gestionan los datos
* @author Mar�a Hern�ndez
* @version 15/06/2021/A
 */
public interface Inventario {

	public boolean addJuego(int pk, Juego j);
	public boolean existePk(int pk);
	public boolean cargaInicial();
	public void listarJuegos();
	
	public boolean editarRanking(int key, int value);
	public boolean listarNombres();
	

}

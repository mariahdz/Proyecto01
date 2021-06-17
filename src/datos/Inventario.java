package datos;


import java.util.List;
import java.util.Map;


import model.Juego;

/**
* Interfaz: Inventario<br>
* Descripci�n: Esta interfaz sirve para contener los m�todos que gestionan los datos
* @author Mar�a Hern�ndez
* @version 15/06/2021/A
 */
public interface Inventario {

	public boolean addJuego(int pk, Juego j);
	public boolean eliminarJuego(int codigo);
	public boolean existePk(int pk);
	public boolean cargaInicial();
	public boolean listarJuegos();
	
	public boolean editarRanking(int key, int value);
	public boolean listarNombres();


	public void elegirCarga();

	
	public Map<Double, String> leerVentas(Inventario inventario);
	public Map<Double,String> listarMasVendidos(Map<Double, String> map);
	

}

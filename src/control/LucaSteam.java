package control;

/**
 * <p>
 * Clase: LucaSteam<br>
 * Descripci�n: Esta clase sirve para iniciar el programa.
 * @author Mar�a Hern�ndez
 * @version 15/06/2021/A
 * </p>
 */

import gui.Menu;
import servicios.ServiciosLucaSteam;
import servicios.ServiciosLucaSteamImp;
import utilidades.RecogerDatos;



public class LucaSteam {

	
	 private boolean salir() throws Exception {
	        String seguro = RecogerDatos.recogeString("�Est�s seguro? (s/n)");
	        return (seguro.toLowerCase().charAt(0) != 's');
	    }


	private ServiciosLucaSteam inventario = new ServiciosLucaSteamImp();
	
	/**
	 * M�todo que incia la aplicaci�n LucaSteam.
	 * @author Mar�a Hern�ndez
	 */
	public void iniciarLucaSteam() {
		boolean continuar = true;
		do {
			Menu.mostrarMenu();
			continuar = this.seleccionOpciones();
		}while(continuar);
		System.out.println("--- Fin de la sesi�n ---");
	}
	
	/**
	 * M�todo que permite escoger al usuario entre diferentes opciones.
	 * @author Mar�a Hern�ndez
	 * @return boolean
	 */
	public boolean seleccionOpciones() {
		
		boolean continuar=true;
		
		try {
			switch (RecogerDatos.recogeInt()) {
				
				case 1:
					//Carga masiva CSV
					inventario.elegirCarga();		
					break;
					
				case 2:
					//Alta de un juego
					inventario.addJuego();
					break;
					
				case 3:
					//Listar los juegos disponibles
					inventario.listarJuegos();					
					break;
					
				case 4:
					//Top 10 juegos m�s vendidos
					inventario.listarMasVendidos();
					break;
					
				case 5:
					//Listar los juegos por nombre
					inventario.listarNombres();
					break;
		
				case 6:
					//Editar ranking de un juego
					inventario.editarRanking();
					break;
		
				case 7:
					//Eliminar un juego
					inventario.eliminarJuego();
					break;
					
				case 0:
					continuar = salir();
					break;
			}
		} catch (Exception e) {
			System.out.println("Error: "+e.toString());
		}
		return continuar;
	}


}

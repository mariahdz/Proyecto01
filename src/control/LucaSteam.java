package control;

import gui.Menu;
import servicios.ServiciosLucaSteam;
import servicios.ServiciosLucaSteamImp;
import utilidades.RecogerDatos;

/**
* Clase: LucaSteam <br>
* Descripción: Esta clase sirve dar inicio al prog
* @author María Hernández
* @version 15/06/2021/A
*/
public class LucaSteam {

	private ServiciosLucaSteam inventario = new ServiciosLucaSteamImp();
	
	public void iniciarLucaSteam() {
		boolean continuar = true;
		do {
			Menu.mostrarMenu();
			continuar = this.seleccionOpciones();
		}while(continuar=true);
		System.out.println();
	}
	
	public boolean seleccionOpciones() {
		
		boolean continuar=true;
		
		try {
			switch (RecogerDatos.recogeInt()) {
				
				case 1:
					//Alta de un juego
					
					
			}
		}
	}
}

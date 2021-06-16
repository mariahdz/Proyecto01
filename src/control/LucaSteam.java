package control;


import gui.Menu;
import model.Juego;
import servicios.ServiciosLucaSteam;
import servicios.ServiciosLucaSteamImp;
import utilidades.RecogerDatos;

/**
* Clase: LucaSteam <br>
* Descripción: Esta clase sirve dar inicio al prog
* @author María Hernández
* @version 15/06/2021/A
*/

import utilidades.RecogerDatos;


public class LucaSteam {

	
	 private boolean salir() throws Exception {
	        String seguro = RecogerDatos.recogeString("¿Estás seguro? (s/n");
	        return (seguro.toLowerCase().charAt(0) != 's');
	    }


	private ServiciosLucaSteam inventario = new ServiciosLucaSteamImp();
	
	public void iniciarLucaSteam() {
		boolean continuar = true;
		do {
			Menu.mostrarMenu();
			continuar = this.seleccionOpciones();
		}while(continuar==true);
		System.out.println("--- Fin de la sesión ---");
	}
	
	public boolean seleccionOpciones() {
		
		boolean continuar=true;
		
		try {
			switch (RecogerDatos.recogeInt()) {
				
				case 1:
					//Alta de un juego
					inventario.addJuego();
					break;
					
				case 2:
					//Listar los juegos disponibles
					
					break;
					
				case 3:
					//Listar los juegos disponibles de tipo plataforma
					
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
	
	public void imprimirPantalla() {
		if(!inventario.listarJuegos().isEmpty()){
		for (Juego juego : inventario.listarJuegos()) {
			System.out.println(juego);
		}
		}
	}
}

package gui;

/**
* Clase: Menu <br>
* Descripción: Esta clase sirve para mostrar el menú de opciones principal.
* @author María Hernández
* @version 15/06/2021/A
*/
public class Menu {
	
	public static void mostrarMenu() {
        System.out.println(" ");
        System.out.println(" LUCA STEAM ");
        System.out.println(" ");
        System.out.println("************************************************");
        System.out.println("*  Por favor, escoja una de las siguientes opciones: ");
        System.out.println("*    1.-Dar de alta un juego");
        System.out.println("*    2.-Listar los juegos disponibles");
        System.out.println("*    3.-Listar los juegos disponibles de tipo plataforma");
        System.out.println("*    0.-Terminar sesión");
        System.out.println("************************************************");
        System.out.println(" ");
        System.out.print(">> ");
	}

}

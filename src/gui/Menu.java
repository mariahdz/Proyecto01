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
        System.out.println("* Por favor, escoja una de las siguientes opciones: ");
        System.out.println("* 1.-Dar de alta un juego");
        System.out.println("* 2.-Listar los juegos disponibles");
        System.out.println("* 3.-Top 10 juegos más vendidos");
        System.out.println("* 4.-Listar los juegos por nombre");
        System.out.println("* 5.-Editar ranking de un juego");
        System.out.println("* 6.-Eliminar un juego");
        System.out.println("* 0.-Terminar sesión");
        System.out.println("************************************************");
        System.out.println(" ");
        System.out.print(">> ");
	}

}

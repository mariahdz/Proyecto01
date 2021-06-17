package gui;

/**
* Clase: Menu <br>
* Descripci�n: Esta clase sirve para mostrar el men� de opciones principal.
* @author Mar�a Hern�ndez
* @version 15/06/2021/A
*/
public class Menu {
	
	public static void mostrarMenu() {
        System.out.println(" ");
        System.out.println("                  LUCA STEAM ");
        System.out.println(" ");
        System.out.println("************************************************");
        System.out.println("*  Por favor, escoja una de las siguientes opciones: ");
        System.out.println("*    1.-Carga masiva CSV");
        System.out.println("*    2.-Dar de alta un juego");
        System.out.println("*    3.-Listar los juegos disponibles");
        System.out.println("*    4.-Top 10 juegos m�s vendidos");
        System.out.println("*    5.-Listar los juegos por nombre");
        System.out.println("*    6.-Editar ranking de un juego");
        System.out.println("*    7.-Eliminar un juego");
        System.out.println("*    0.-Terminar sesi�n");
        System.out.println("************************************************");
        System.out.println(" ");
        System.out.print(">> ");
	}

}

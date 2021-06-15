package utilidades;



import java.util.Scanner;

/**
*Clase: RecogerDatos <br>
*Descripción: Esta clase engloba un serie de métodos para introducir datos por teclado
* @author Desiree
* @version 15/06/2021/A
*/

public class RecogerDatos {

    public RecogerDatos() {
    }
    
    /**
     * Recoge un string por teclado
     * @return
     * @throws Exception
     */

    public static String recogeString() throws Exception {
        String dato = new Scanner(System.in).nextLine();
        return dato;
    }

    /**
     * Utiliza el método recogeString por teclado
     * @param msg
     * @return
     * @throws Exception
     */
    public static String recogeString(String msg) throws Exception {
        System.out.println(msg);
        return recogeString();
    }
    
    /**
     * Recoge un Int por teclado
     * @return
     * @throws Exception
     */

    public static int recogeInt() throws Exception {
        int dato = new Scanner(System.in).nextInt();
        return dato;
    }
    
    /**
     * Utiliza el método recogeString por teclado
     * @param msg
     * @return
     * @throws Exception
     */

    public static int recogeInt(String msg) throws Exception {
        System.out.println(msg);
        return recogeInt();
    }
    
    /**
     * Recoge un double por teclado
     * @return
     * @throws Exception
     */

    public static double recogeDouble() throws Exception {
        double dato = new Scanner(System.in).nextDouble();
        return dato;
    }
    
    
    /**
     * Utiliza el método recoge double por teclado
     * @param msg
     * @return
     * @throws Exception
     */

    public static double recogeDouble(String msg) throws Exception {
        System.out.println(msg);
        return recogeDouble();
    }
}

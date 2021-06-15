package utilidades;

/**
 *
 * @author Desiree

 */

/**Este método recoge datos por teclado
 * 
 */

import java.util.Scanner;

public class RecogerDatos {

    public RecogerDatos() {
    }

    public static String recogeString() throws Exception {
        String dato = new Scanner(System.in).nextLine();
        return dato;
    }

    public static String recogeString(String msg) throws Exception {
        System.out.println(msg);
        return recogeString();
    }

    public static int recogeInt() throws Exception {
        int dato = new Scanner(System.in).nextInt();
        return dato;
    }

    public static int recogeInt(String msg) throws Exception {
        System.out.println(msg);
        return recogeInt();
    }

    public static double recogeDouble() throws Exception {
        double dato = new Scanner(System.in).nextDouble();
        return dato;
    }

    public static double recogeDouble(String msg) throws Exception {
        System.out.println(msg);
        return recogeDouble();
    }
}

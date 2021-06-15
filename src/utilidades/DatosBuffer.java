package utilidades;

import java.io.*;

/**
* Clase: DatosBuffer <br>
* Descripción: Esta clase  sirve para leer datos
* @author Desiree
* @version 15/06/2021/A
*/


public class DatosBuffer {

    BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

    /**
     * Leer String
     * @return
     * @throws Exception
     */
    public String recogeString() throws Exception {
        String dato = teclado.readLine();
        return dato;
    }
    
    /**
     * Leer Entero
     * @return
     * @throws Exception
     */

    public int recogeInt() throws Exception {
        int dato = Integer.parseInt(teclado.readLine());
        return dato;
    }
    
    /**
     * Leer Doble
     * @return
     * @throws Exception
     */
    public double recogeDouble() throws Exception {
        double dato = Double.parseDouble(teclado.readLine());
        return dato;
    }
}

package control;

import utilidades.RecogerDatos;

public class LucaSteam {
	
	
	 private boolean salir() throws Exception {
	        String seguro = RecogerDatos.recogeString("¿Estás seguro? (s/n");
	        return (seguro.toUpperCase().charAt(0) != 's');
	    }


}

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import datos.Inventario;
import datos.InventarioImp;
import model.Juego;

class ListarMasVendidosTest {
	
	 private static Logger logger;


		// Inicializo
			static {
				try {
					logger = Logger.getLogger( InventarioTest.class.getName() );
					
				} catch (Throwable e) {
					System.out.println("Don't work");
				}
			}
			

	@Test
	void juegosNoRepetidostest() {
		
		logger.info("probando si juego ya existe en el ranking");
		Inventario inventario = new InventarioImp();
		Juego callOfDuty = new Juego;
		Juego tombRaider = new Juego;
		Juego callOfDuty = new Juego;
		inventario.addJuego(12, Call Of Duty);
		inventario.addJuego(978, Tomb Raider);
		inverntario.addJuego(12, Call of Duty;)
		
		
		
		boolean resultadoObtenido = inventario.listarMasVendidos();
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		fail("Not yet implemented");
	}

}

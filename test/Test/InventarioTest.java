package Test;

/**
* Test metodo addJuego de Inventario
* Descripción: Test que prueba el metodo addJuego 
* @author Daniela Posas
* @version 15/06/2021/A
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;
import datos.InventarioImp;
import model.Juego;


public class InventarioTest {
	private InventarioImp inventario = new InventarioImp();
	/* private static Logger logger;
	
	
	// Inicializo
		static {
			try {
				logger = LogManager.getLogger(InventarioImp.class);
			} catch (Throwable e) {
				System.out.println("Don't work");
			}
		}
		
	*/
	
	
	@Test
	public void existeJuego() {
		
		
		
		//logger.info("probando si juego ya existe");
		InventarioImp inventarioImp = new InventarioImp();
		Juego juego = new Juego();
		inventarioImp.addJuego(2, juego);
		
		boolean resultadoObtenido = inventarioImp.existePk(2);
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	//comprueba que los datos introducidos son correctos
	@Test
	public void comprobarDatos() {
		
		//logger.info("probando que los datos son correctos");
		InventarioImp inventarioImp = new InventarioImp();
		Juego juego = new Juego();

		juego.setSelfID(0);
		juego.setRank(0);
		juego.setName("Juego2");
		juego.setPlatform("XBOX");		
		juego.setGenre("aventura");
		juego.setPublisher("Publisher1");
		juego.setNaSales(20.0);
		juego.setJpSales(30.0);
		juego.setGlobalSales(0);
		juego.setOtherSales(0);
		juego.setEuSales(0.2);

		boolean resultadoObtenido = inventarioImp.addJuego(0, juego);
		boolean resultadoEsperado = true;
		assertEquals(resultadoObtenido, resultadoEsperado);
		
	}
	
	
	
	//Pruebo que falle cuando sea Juego null
	@Test
	public void isValid() {
		//logger.info("probando que no se insertan nulos");
		InventarioImp inventarioImp = new InventarioImp();
		Juego juego = new Juego();
		juego = null;
		boolean resultadoObtenido = inventarioImp.addJuego(2, juego);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	
	
	
	
	
}

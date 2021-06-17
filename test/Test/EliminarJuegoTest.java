package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import datos.Inventario;
import datos.InventarioImp;
import model.Juego;
import servicios.ServiciosLucaSteam;
import servicios.ServiciosLucaSteamImp;

/**
* <p>
* Test: EliminarJuegoTest <br>
* Descripción: Test que prueba el método eliminarJuego
* @author María Hernández
* @version 17/06/2021/A
* <\p>
*/
public class EliminarJuegoTest {

private static Logger logger;
	
	//Inicializo
	static {
		try {
			logger= Logger.getLogger(EditarRankingTest2.class.getName());
			
		}catch(Throwable e) {
			System.out.println("Don't work");
		}
	}
	@BeforeClass
	public static void onceExecutedBeforeAll() {
		logger.info("@BeforeAll: Al inicio de las pruebas");
	}

	@Before
	public void executedBeforeEach() {
		// Sustituye al setUp
		logger.info("@BeforeEach: Antes de cada prueba");
	
	}

	@AfterClass
	public static void onceExecutedAfterAll() {
		logger.info("@AfterAll: Al final de las pruebas");
		
	}

	@After
	public void executedAfterEach() {
		// Sustituye al tearDown
		logger.info("@AfterEach: Despues de cada prueba");
		
	}

	@Ignore
	//Puedes usarlo en vez de comentar el método para que no se ejecute
	//http://junit.sourceforge.net/javadoc/org/junit/Ignore.html
	public void executionIgnored() {
		logger.info("@Disabled: This execution is ignored");
	}
	
	//........
	//TEST
	//........
		
	@Test
	public void existeJuego() {
		
		logger.info("Probando si el juego que queremos eliminar existe");
		
		Inventario inventario = new InventarioImp();
		Juego juego = new Juego();
		inventario.addJuego(2, juego);
		
		boolean resultadoObtenido = inventario.existePk(2);
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	@Test
	public void checkEliminado() {
		
		logger.info("Probando si se ha eliminado el juego");
		
		ServiciosLucaSteam inventario = new ServiciosLucaSteamImp();
		Juego juego1 = new Juego();
		Juego juego2 = new Juego();
		Juego juego3 = new Juego();
		inventario.addJuego(1, juego1);
		inventario.addJuego(2, juego2);
		inventario.addJuego(3, juego3);
		
		boolean resultadoObtenido = inventario.eliminarJuego(2);
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	
	}

}

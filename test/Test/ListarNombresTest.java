package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

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

/**
 * <p>
 * Test: ListarNombresTest <br>
 * Descripción: Test que prueba el método listarNombres
 * @author María Hernández
 * @version 17/06/2021/A
 * <\p>
 */
public class ListarNombresTest {

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
	public void isImpreso() {
		
		logger.info("Probando si el método imprime");
		
		Inventario inventario = new InventarioImp();
		Juego juego1 = new Juego();
		Juego juego2 = new Juego();
		Juego juego3 = new Juego();
		inventario.addJuego(1, juego1);
		inventario.addJuego(2, juego2);
		inventario.addJuego(3, juego3);
		
		boolean resultadoObtenido = inventario.listarNombres();
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
	
	}
}


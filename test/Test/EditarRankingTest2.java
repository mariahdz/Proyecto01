package Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import datos.Inventario;
import datos.InventarioImp;
import model.Juego;
import servicios.ServiciosLucaSteam;
import servicios.ServiciosLucaSteamImp;

/**
 * <p>
 * Test: EditarRankingTest <br>
 * Descripción: Test que prueba el método editarRanking
 * @author María Hernández
 * @version 16/06/2021/A
 * <\p>
 */
public class EditarRankingTest2 {


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
	public void comprobarNumPositivo() {
		
		logger.info("Probando que la clave del juego que se quiere eliminar sea mayor que 0");

		Inventario inventario = new InventarioImp();
		Juego juego = new Juego();
		inventario.addJuego(2,juego);
		inventario.editarRanking(-2,3);
		
		boolean resultadoObtenido = inventario.editarRanking(-2,3);
		boolean resultadoEsperado = false;
		assertEquals(resultadoObtenido, resultadoEsperado);
	}


	@Test
	public void existeJuego() {
		
		logger.info("Probando si el juego que queremos editar existe");
		
		Inventario inventario = new InventarioImp();
		Juego juego = new Juego();
		inventario.addJuego(2, juego);
		inventario.editarRanking(2,3);
		
		boolean resultadoObtenido = inventario.existePk(2);
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	
	@Test
	public void noExisteJuego() {
		
		logger.info("Probando si el juego que queremos editar no existe");
		
		Inventario inventario = new InventarioImp();
		Juego juego = new Juego();
		inventario.addJuego(3, juego);
		inventario.editarRanking(2,3);
		
		boolean resultadoObtenido = inventario.existePk(2);
		boolean resultadoEsperado = false;
		
		assertNotEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	
	
	
	
	
	
	
}


package Test;

/**
* Test metodo addJuego de Inventario
* Descripción: Test que prueba el metodo addJuego 
* @author Daniela Posas
* @version 15/06/2021/A
 */

import static org.junit.jupiter.api.Assertions.assertEquals;


import java.util.logging.Logger;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;

import org.junit.Test;
import datos.InventarioImp;
import model.Juego;


public class InventarioTest {


	
	 private static Logger logger;

	
	// Inicializo
		static {
			try {
				logger = Logger.getLogger( InventarioTest.class.getName() );
				
			} catch (Throwable e) {
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

		// --------
		// TEST
		// --------
		
		
		
	
	
	/**
	 * <p>
	 * Test que comprueba que el Juego que se intenta añadir
	 * mediante el metodo addJuego ya existe
	 * </p>
	 */
	@Test
	public void existeJuego() {
		
		logger.info("probando si juego ya existe");

		InventarioImp inventarioImp = new InventarioImp();
		Juego juego = new Juego();
		inventarioImp.addJuego(2, juego);
		
		boolean resultadoObtenido = inventarioImp.existePk(2);
		boolean resultadoEsperado = true;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	
	/**
	 * <p>
	 * Test que comprueba que los datos de Juego introducidos
	 * son correctos en el metodo addJuego de la clase InventarioImp
	 * </p>
	 */
	
	@Test
	public void comprobarDatos() {
		
		logger.info("probando que los datos son correctos");
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
	
	
	
	/**
	 * <p>
	 * Test que comprueba que el método addJuego devuelva false cuando se intenta añadir un null.
	 * </p>
	 */
	
	@Test
	public void isValid() {
		logger.info("probando que no inserta un juego nulo");
		InventarioImp inventarioImp = new InventarioImp();
		Juego juego = new Juego();
		juego = null;
		boolean resultadoObtenido = inventarioImp.addJuego(2, juego);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	@Test
	public void noExisteJuego() {
		
		logger.info("probando si el juego no existe");
		InventarioImp inventarioImp = new InventarioImp();
		Juego juego = new Juego();
		inventarioImp.addJuego(2, juego);
		
		boolean resultadoObtenido = inventarioImp.existePk(2);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}

	
	@Test
	public void insertarClaveNull() {
		logger.info("probando que no se inserta Juego con clave null");
		InventarioImp inventarioImp = new InventarioImp();
		Juego juego = new Juego();
		Integer clave = null;
		boolean resultadoObtenido = inventarioImp.addJuego(clave, juego);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	
	@Test
	public void insertarClaveYJuegoNull() {
		logger.info("probando que no se inserta Juego con clave y juego null");
		InventarioImp inventarioImp = new InventarioImp();
		Juego juego = new Juego();
		Integer clave = null;
		boolean resultadoObtenido = inventarioImp.addJuego(clave, null);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoObtenido, resultadoEsperado);
	}
	
	
	
	@Test 
	public void insertarJuegoExistente() {
		logger.info("probando si juego ya existe");
		InventarioImp inventarioImp = new InventarioImp();
		Juego juego = new Juego();
		inventarioImp.addJuego(2,null);
		
		boolean resultadoObtenido = inventarioImp.addJuego(2,juego);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	
	
	@Test 
	public void insertarJuegoExistente1() {
		logger.info("probando si juego ya existe");
		InventarioImp inventarioImp = new InventarioImp();
		Juego juego = new Juego();
		inventarioImp.addJuego(2,null);
		
		boolean resultadoObtenido = inventarioImp.addJuego(2,null);
		boolean resultadoEsperado = false;
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		
	}
	

	
	
	
	
	
	
}

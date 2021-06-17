package Test.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;
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
* Test metodo listarMasVendidos
* Descripción: Test que prueba los metodos listarMasvendidos y leerVentas
* @author Desiree
* @version 16/06/2021/A
 */

class ListarMasVendidosTest {
	
	 private static Logger logger;


		// Inicializo
			static {
				try {
					logger = Logger.getLogger(ListarMasVendidosTest.class.getName() );
					
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
				
				logger.info("@BeforeEach: Antes de cada prueba");
			
			}

			@AfterClass
			public static void onceExecutedAfterAll() {
				logger.info("@AfterAll: Al final de las pruebas");
			}

			@After
			public void executedAfterEach() {
				
				logger.info("@AfterEach: Despues de cada prueba");
				
			}

			@Ignore
			
			public void executionIgnored() {
				logger.info("@Disabled: This execution is ignored");
			}

			// --------
			// TEST
			// --------
			
			
			
	
	
	
	
	/**
	 * <p>
	 * Este método comprueba que se ordenan las ventas
	 * </p>
	 */
	@Test
	void ordenarVentas() {
		
		logger.info("probando que los registros se ordenan de mayor a menor");	
		InventarioImp inventario = new InventarioImp();
		Juego juego = new Juego();

		juego.setSelfID(0);
		juego.setRank(0);
		juego.setName("Skyrim");
		juego.setPlatform("PS3");		
		juego.setGenre("Roll");
		juego.setPublisher("Bethesda");
		juego.setNaSales(20.0);
		juego.setJpSales(30.0);
		juego.setGlobalSales(0);
		juego.setOtherSales(0);
		juego.setEuSales(0.2);
		
		Juego juego1 = new Juego();

		juego1.setSelfID(1);
		juego1.setRank(0);
		juego1.setName("CyberPunk 2077");
		juego1.setPlatform("PS4");		
		juego1.setGenre("Rol de Acción");
		juego1.setPublisher("Cd Project Red");
		juego1.setNaSales(40.0);
		juego1.setJpSales(60.0);
		juego1.setGlobalSales(0);
		juego1.setOtherSales(0);
		juego1.setEuSales(1.2);
		
		inventario.addJuego(juego.getSelfID(),juego);
		inventario.addJuego(juego1.getSelfID(), juego1);
		
		Map<Double, String> resultadoObtenido = inventario.leerVentas(inventario);
		Map<Double, String> resultadoEsperado = new HashMap<>();
		resultadoEsperado.put(1.2,"CyberPunk 2077");
		resultadoEsperado.put(0.2, "Skyrim");
		
	}
	
	

}

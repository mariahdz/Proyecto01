package Test;

import static org.junit.jupiter.api.Assertions.*;

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
					logger = Logger.getLogger( ListarMasVendidosTest.class.getName() );
					
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
	 * Este método comprueba que solo se muestren diez juegos en el ranking"
	 * </p>
	 */
	@Test 
	void mostrarSoloDiez() {
		
		logger.info("probando que solo se muestren 10 registros");	
		Inventario inventario = new InventarioImp();
		Map<Double, String> ventas = new HashMap<>();
		ventas.put(1.000, "Call of Duty");
		ventas.put(2.000, "Tomb Raider");
		ventas.put(5.000, "Indiana Jones");
		ventas.put(10.000, "Crash Bandicoot");
		ventas.put(9.000, "Resident Evil");
		ventas.put(20.000, "Silent Hill 4");
		ventas.put(3.000, "The Evil Within");
		ventas.put(10.000, "The Witcher 2");
		ventas.put(7.000, "FallOut 4");
		ventas.put(15.000, "Red Dead Redemption");
		ventas.put(25.000, "HellBlade");
		ventas.put(11.000, "God of War");
		
		Map<String, Double> resultadoObtenido = inventario.listarMasVendidos(ventas);
		Map<String, Double> resultadoEsperado = new HashMap<>();
		resultadoEsperado.put("The Evil Within", 3.000);
		resultadoEsperado.put("Indiana Jones", 5.000);
		resultadoEsperado.put("Crash Bandicoot", 10.000);
		resultadoEsperado.put("Resident Evil", 9.000);
		resultadoEsperado.put("Silent Hill 4", 20.000);
		resultadoEsperado.put("The Witcher 2", 10.000);
		resultadoEsperado.put("FallOut 4", 7.000);
		resultadoEsperado.put("Red Dead Redemption", 15.000);
		resultadoEsperado.put("HellBlade", 25.000);
		resultadoEsperado.put("God of War", 11.000);
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		fail("Not yet implemented");
		
	}
	
	/**
	 * <p>
	 * Este método comprueba que se crea un map donde clave es el valor de Ventas de Europa, y valor es el nombre del juego
	 * </p>
	 */
	@Test
	void comprobarDatosLeerVentas() {
		
		Inventario inventario = new InventarioImp();
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

		juego.setSelfID(1);
		juego.setRank(0);
		juego.setName("CyberPunk 2077");
		juego.setPlatform("PS4");		
		juego.setGenre("Rol de Acción");
		juego.setPublisher("Cd Project Red");
		juego.setNaSales(40.0);
		juego.setJpSales(60.0);
		juego.setGlobalSales(0);
		juego.setOtherSales(0);
		juego.setEuSales(1.2);
		
		inventario.addJuego(juego.getSelfID(),juego);
		inventario.addJuego(juego1.getSelfID(), juego1);
		
		Map<Double, String> resultadoObtenido = inventario.leerVentas(inventario);
		Map<Double, String> resultadoEsperado = new HashMap<>();
		resultadoEsperado.put(1.2,"CyberPunk 2077");
		resultadoEsperado.put(0.2, "Skyrim");
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		fail("Not yet implemented");	

	}
	
	/**
	 * <p>
	 * Este método comprueba que se ordenan las ventas
	 * </p>
	 */
	@Test
	void ordenarVentas() {
		
		logger.info("probando que los registros se ordenan de mayor a menor");	
		Inventario inventario = new InventarioImp();
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

		juego.setSelfID(1);
		juego.setRank(0);
		juego.setName("CyberPunk 2077");
		juego.setPlatform("PS4");		
		juego.setGenre("Rol de Acción");
		juego.setPublisher("Cd Project Red");
		juego.setNaSales(40.0);
		juego.setJpSales(60.0);
		juego.setGlobalSales(0);
		juego.setOtherSales(0);
		juego.setEuSales(1.2);
		
		inventario.addJuego(juego.getSelfID(),juego);
		inventario.addJuego(juego1.getSelfID(), juego1);
		
		Map<Double, String> resultadoObtenido = inventario.leerVentas(inventario);
		Map<Double, String> resultadoEsperado = new HashMap<>();
		resultadoEsperado.put(1.2,"CyberPunk 2077");
		resultadoEsperado.put(0.2, "Skyrim");
		
		/*Map<Double, String> resultadoEsperado = new HashMap<>();
		Map<Double, String> ventas = new HashMap<>();
		ventas.put(1.000, "Call of Duty");
		ventas.put(2.000, "Tomb Raider");
		ventas.put(5.000, "Indiana Jones");
		ventas.put(10.000, "Crash Bandicoot");
		ventas.put(9.000, "Resident Evil");
		ventas.put(20.000, "Silent Hill 4");
		ventas.put(3.000, "The Evil Within");
		ventas.put(10.000, "The Witcher 2");
		ventas.put(7.000, "FallOut 4");
		ventas.put(15.000, "Red Dead Redemption");
		ventas.put(25.000, "HellBlade");
		ventas.put(11.000, "God of War");
		
		
		Map<Double, String> resultadoObtenido = inventario.leerVentas(ventas);
		Map<Double, String> resultadoEsperado = new HashMap<>();
		resultadoEsperado.put(25.000, "HellBlade");
		resultadoEsperado.put(20.000, "Silent Hill 4");
		resultadoEsperado.put(15.000, "Red Dead Redemption");
		resultadoEsperado.put(11.000, "God of War");
		resultadoEsperado.put(10.000, "Crash Bandicoot");
		resultadoEsperado.put(8.000, "The Witcher 2");
		resultadoEsperado.put(9.000, "Resident Evil");
		resultadoEsperado.put(7.000, "FallOut 4");
		resultadoEsperado.put(5.000, "Indiana Jones");
		resultadoEsperado.put(3.000, "The Evil Within");		
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		fail("Not yet implemented");
	*/	
	}
	
	
	/** 
	 * <p>
	 * Este método comprueba que se invierte la clave-valor recibida"
	 * </p>
	 */
	
	@Test
	void invertirDatos() {
		
		logger.info("probando que los registros se ordenan de mayor a menor");	
		Inventario inventario = new InventarioImp();
		Map<Double, String> ventas = new HashMap<>();
		ventas.put(1.000, "Call of Duty");
		ventas.put(2.000, "Tomb Raider");
		ventas.put(5.000, "Indiana Jones");
		ventas.put(10.000, "Crash Bandicoot");
		ventas.put(9.000, "Resident Evil");
		ventas.put(20.000, "Silent Hill 4");
		ventas.put(3.000, "The Evil Within");
		ventas.put(10.000, "The Witcher 2");
		ventas.put(7.000, "FallOut 4");
		ventas.put(15.000, "Red Dead Redemption");
		ventas.put(25.000, "HellBlade");
		ventas.put(11.000, "God of War");
		
		
		Map<Double, String> resultadoObtenido = inventario.listarMasVendidos(ventas);
		Map<Double, String> resultadoEsperado = new HashMap<>();
		resultadoEsperado.put(25.000, "HellBlade");
		resultadoEsperado.put(20.000, "Silent Hill 4");
		resultadoEsperado.put(15.000, "Red Dead Redemption");
		resultadoEsperado.put(11.000, "God of War");
		resultadoEsperado.put(10.000, "Crash Bandicoot");
		resultadoEsperado.put(8.000, "The Witcher 2");
		resultadoEsperado.put(9.000, "Resident Evil");
		resultadoEsperado.put(7.000, "FallOut 4");
		resultadoEsperado.put(5.000, "Indiana Jones");
		resultadoEsperado.put(3.000, "The Evil Within");		
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		fail("Not yet implemented");
		
	}
	
	/**
	 * <p>
	 * Este método comprueba que no entren dos juegos iguales en el ranking"
	 * </p>
	 */
	@Test
	void juegosNoRepetidostest() {
		
		logger.info("probando si juego ya existe en el ranking");	
		Inventario inventario = new InventarioImp();
		Map<Double, String> ventas = new HashMap<>();
		ventas.put(1.000,"Call of Duty");
		ventas.put(2.000,"Tomb Raider");
		ventas.put(1.000,"Call of Duty");
		
		
		Map<String, Double> resultadoObtenido = inventario.listarMasVendidos(ventas);
		Map<String, Double> resultadoEsperado = new HashMap<>();
		resultadoEsperado.put("Call of Duty", 1.000);
		resultadoEsperado.put("Tomb Raider", 2.000);
		
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		fail("Not yet implemented");
	}

}

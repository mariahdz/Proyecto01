package Test.Test;


import static org.junit.Assert.assertEquals;
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
	 * Este método comprueba que solo se muestren diez juegos en el ranking"
	 * </p>
	 */
	@Test 
	void mostrarSoloDiez() {
		
		logger.info("probando que solo se muestren 10 registros");	
		Inventario inventario = new InventarioImp();
	/*	Map<Double, String> ventas = new HashMap<>();
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
		*/
		
		Juego juego1 = new Juego();

		juego1.setName("Skyrim");
		juego1.setEuSales(0.2);
		
		Juego juego2 = new Juego();

		juego2.setName("God of War");
		juego2.setEuSales(5.7);
		
		Juego juego3 = new Juego();
		
		juego3.setName("CyberPunk 2077");
		juego3.setEuSales(3.9);
		
		Juego juego4 = new Juego();
		
		juego4.setName("HellBlade");
		juego4.setEuSales(9.0);
		
		Juego juego5 = new Juego();
		
		juego5.setName("Silent Hill 4");
		juego5.setEuSales(10.0);
		
		Juego juego6 = new Juego();

		juego6.setName("Resident Evil 4");
		juego6.setEuSales(1.0);
		
		Juego juego7 = new Juego();

		juego7.setName("Crash Bandicoot");
		juego7.setEuSales(3.0);
		
		Juego juego8 = new Juego();
		
		juego8.setName("Red Dead Redemption");
		juego8.setEuSales(6.5);
		
		Juego juego9 = new Juego();
		
		juego9.setName("The Witcher 2");
		juego9.setEuSales(2.0);
		
		Juego juego10 = new Juego();
		
		juego10.setName("Shadow of Colosus");
		juego10.setEuSales(5.0);
		
		Juego juego11 = new Juego();
		
		juego11.setName("Tomb Raider 4: The Last Revelation");
		juego11.setEuSales(7.0);
		
		inventario.addJuego(juego1.getSelfID(), juego1);
		inventario.addJuego(juego2.getSelfID(), juego2);
		inventario.addJuego(juego3.getSelfID(), juego3);
		inventario.addJuego(juego4.getSelfID(), juego4);
		inventario.addJuego(juego5.getSelfID(), juego5);
		inventario.addJuego(juego6.getSelfID(), juego6);
		inventario.addJuego(juego7.getSelfID(), juego7);
		inventario.addJuego(juego8.getSelfID(), juego8);
		inventario.addJuego(juego9.getSelfID(), juego9);
		inventario.addJuego(juego10.getSelfID(), juego10);
		inventario.addJuego(juego11.getSelfID(), juego11);
		
		Map <Double, String> juegos = inventario.leerVentas(inventario);
		
		
		Map<Double, String> resultadoObtenido = inventario.listarMasVendidos(juegos);
		Map<Double, String> resultadoEsperado = new HashMap<>();
		resultadoEsperado.put(5.0, "Shadow of Colosus");
		resultadoEsperado.put(3.9, "CyberPunk 2077");
		resultadoEsperado.put(3.0, "Crash Bandicoot");
		resultadoEsperado.put(1.0,"Resident Evil 4");
		resultadoEsperado.put(10.0, "Silent Hill 4");
		resultadoEsperado.put(2.0, "The Witcher 2");
		resultadoEsperado.put(7.0, "Tomb Raider 4: The Last Revelation");
		resultadoEsperado.put(6.5, "Red Dead Redemption");
		resultadoEsperado.put(9.0, "HellBlade");
		resultadoEsperado.put(5.7, "God of War");
		
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
		
	}
	
	
	/**
	 * <p>
	 * Este método comprueba que no entren dos juegos iguales en el ranking"
	 * </p>
	 */
	/*@Test
	void juegosNoRepetidostest() {
		
		logger.info("probando si juego ya existe en el ranking");	
		Inventario inventario = new InventarioImp();
		Map<Double, String> ventas = new HashMap<>();
		ventas.put(1.000,"Call of Duty");
		ventas.put(2.000,"Tomb Raider");
		ventas.put(1.000,"Call of Duty");
		
		
		Map<Double, String> resultadoObtenido = inventario.listarMasVendidos(ventas);
		Map<Double, String> resultadoEsperado = new HashMap<>();
		resultadoEsperado.put(1.000, "Call of Duty");
		resultadoEsperado.put(2.000, "Tomb Raider");
		
		
		assertEquals(resultadoEsperado, resultadoObtenido);
		fail("Not yet implemented");
	}*/

}

package model;

import lombok.Data;
import utilidades.RecogerDatos;

/**
 * Clase: Juego <br>
 * Descripci�n: Esta clase es el modelo de datos
 * para la administraci�n de objetos en la base de datos CSV
 * @author Irene
 * @version 15/06/2021/A
 */

@Data
public class Juego {

	public static int ID = 0;
	private int selfID;
	private int rank;
	private String name;
	private String platform;
	private int year;
	private String genre;
	private String publisher;
	private double naSales;
	private double euSales;
	private double jpSales;
	private double otherSales;
	private double globalSales;

	/**
	 * Constructor vac�o, suma al crear una instancia el ID
	 * @author Irene
	 * @version 15/06/2021/A
	 */
	public Juego() {
		super();
		ID++;
	}
	
	/**
	 * Constructor que toma un array de Strings para parsear todos
	 * los valores
	 * @param line
	 */
	
	public Juego(String[] line) {
		super();
		ID++;
		this.selfID = Juego.ID;
		this.rank = Integer.parseInt(line[0]);
		this.name = line[1];
		this.platform = line[2];
		this.year = Integer.parseInt(line[3]);
		this.genre = line[4];
		this.publisher = line[5];
		this.naSales = Double.parseDouble(line[6]);
		this.euSales = Double.parseDouble(line[7]);
		this.jpSales = Double.parseDouble(line[8]);
		this.otherSales = Double.parseDouble(line[9]);
		this.globalSales = Double.parseDouble(line[10]);
	}
	
	/**
	 * Constructor con todos los valores necesarios
	 * @author Irene
	 * @param rank
	 * @param name
	 * @param platform
	 * @param year
	 * @param genre
	 * @param publisher
	 * @param naSales
	 * @param euSales
	 * @param jpSales
	 * @param otherSales
	 * @param globalSales
	 */
	public Juego(int rank, String name, String platform, int year, String genre, String publisher, double naSales,
			double euSales, double jpSales, double otherSales, double globalSales) {
		super();
		ID++;
		this.selfID = Juego.ID;
		this.rank = rank;
		this.name = name;
		this.platform = platform;
		this.year = year;
		this.genre = genre;
		this.publisher = publisher;
		this.naSales = naSales;
		this.euSales = euSales;
		this.jpSales = jpSales;
		this.otherSales = otherSales;
		this.globalSales = globalSales;
	}
	
	/**
	 * M�todo pensado para utilizar junto con el constructor vac�o.
	 * 
	 * @author Irene
	 */

	public void crearJuego() {

		try {
			this.selfID = Juego.ID;
			this.rank = RecogerDatos.recogeInt("Introduce el rango del juego");
			this.name = RecogerDatos.recogeString("Introduce nombre del juego");
			this.platform = RecogerDatos.recogeString("Introduce la plataforma");
			this.year = RecogerDatos.recogeInt("Introduce el a�o del juego");
			this.genre = RecogerDatos.recogeString("Introduce el g�nero del juego");
			this.publisher = RecogerDatos.recogeString("Introduce el publisher del juego");
			this.naSales = RecogerDatos.recogeDouble("Introduce la cantidad de NA_Sales");
			this.euSales = RecogerDatos.recogeDouble("Introduce la cantidad de EU_Sales");
			this.jpSales = RecogerDatos.recogeDouble("Introduce la cantidad de JP_Sales");
			this.otherSales = RecogerDatos.recogeDouble("Introduce la cantidad de other_Sales");
			this.globalSales = RecogerDatos.recogeDouble("Introduce la cantidad de global_Sales");
			System.out.println("Juego creado correctamente.");
		} catch (Exception e) {
			System.out.println("Por favor, introduzca valores adecuados.");
		}
	}



	

}

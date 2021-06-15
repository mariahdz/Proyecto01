package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import utilidades.RecogerDatos;

/**
 * Clase: Juego <br>
 * Descripción: Esta clase es el modelo de datos
 * para la administración de objetos en la base de datos CSV
 * @author Irene
 * @version 15/06/2021/A
 */

@Data @AllArgsConstructor
public class Juego {

	public static int ID = 0;
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

	public Juego() {
		super();
		ID++;
	}

	public void crearJuego() {

		try {
			this.rank = RecogerDatos.recogeInt("Introduce el rango del juego");
			this.name = RecogerDatos.recogeString("Introduce nombre del juego");
			this.platform = RecogerDatos.recogeString("Introduce la plataforma");
			this.year = RecogerDatos.recogeInt("Introduce el año del juego");
			this.genre = RecogerDatos.recogeString("Introduce la género del juego");
			this.publisher = RecogerDatos.recogeString("Introduce el publisher del juego");
			this.naSales = RecogerDatos.recogeDouble("Introduce la cantidad de NA_Sales");
			this.euSales = RecogerDatos.recogeDouble("Introduce la cantidad de EU_Sales");
			this.jpSales = RecogerDatos.recogeDouble("Introduce la cantidad de JP_Sales");
			this.otherSales = RecogerDatos.recogeDouble("Introduce la cantidad de other_Sales");
			this.globalSales = RecogerDatos.recogeDouble("Introduce la cantidad de global_Sales");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}

}

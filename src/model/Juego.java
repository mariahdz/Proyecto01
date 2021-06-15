package model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import utilidades.RecogerDatos;

/**
 * 
 * @author irene
 * Modelo de la clase. 
 *
 */

@Data
public class Juego implements Serializable{

	private static long ID = 0;
	private int rank;
	private String name;
	private String platform;
	private int year;
	private String genre;
	private String publisher;
	private double NA_Sales;
	private double EU_Sales;
	private double JP_Sales;
	private double other_Sales;
	
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
			this.NA_Sales = RecogerDatos.recogeDouble("Introduce la cantidad de NA_Sales");
			this.EU_Sales = RecogerDatos.recogeDouble("Introduce la cantidad de EU_Sales");
			this.JP_Sales = RecogerDatos.recogeDouble("Introduce la cantidad de JP_Sales");
			this.other_Sales = RecogerDatos.recogeDouble("Introduce la cantidad de other_Sales");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}


	

}

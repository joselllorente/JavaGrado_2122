package edu.ucjc.gradoinformatica.programacion.arrays.bidimensionales.ejercicios.dados;

public class Dado {
	private String color;
	private int numLados;
	public Dado(String color, int numLados) {
		super();
		this.color = color;
		this.numLados = numLados; 
	}
	public String getColor() {
		return color;
	}
	public int getNumLados() {
		return numLados;
	}
	
	/**
	 * 
	 * @return
	 */
	public int lanzarDado() {
		int tirada=0;
		tirada = (int)(Math.random()*this.numLados)+1;
		System.out.println("El dado de color "+this.color + " ha sacado " + tirada);
		return tirada;
	}
}

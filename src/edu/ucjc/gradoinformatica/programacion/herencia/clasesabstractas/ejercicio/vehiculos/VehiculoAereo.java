package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.vehiculos;

public abstract class VehiculoAereo extends Vehiculo{
	private double altitudMaxima;

	public VehiculoAereo(String nombre, double altitudMaxima) {
		super(nombre);
		this.altitudMaxima = altitudMaxima;
	}
	
	public double getAltitudMaxima() {
		return altitudMaxima;
	}
	public void setAltitudMaxima(double altitudMaxima) {
		this.altitudMaxima = altitudMaxima;
	}

	public void volar() {
		System.out.println("El vheiculo "+getNombre() + " esta volando");
	}
	
}

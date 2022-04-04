package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.vehiculos;

public abstract class VehiculoTerrestre extends Vehiculo {
	
	private int numRuedas;
	
	public VehiculoTerrestre(String nombre, int numRuedas) {
		super(nombre);
		this.numRuedas = numRuedas;
	}



	@Override
	public void parar() {
		System.out.println("Parando vehiculo" + getNombre());

	}
	
	public void derrapar() {
		System.out.println("Derrapando vehiculo" + getNombre());
	}
	

}

package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.supermercado;

public final class Television extends ProductoElectronico {
	private double pulgadas;

	public Television(String nombre, double precio, String numeroSerie, double pulgadas) {
		super(nombre, precio, numeroSerie);
		this.pulgadas = pulgadas;
	}

	public double getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	
	
	
}

package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.supermercado;

public abstract class ProductoElectronico extends Producto {
	private String numeroSerie;
	
	public ProductoElectronico(String nombre, double precio, String numeroSerie) {
		super(nombre, precio);
		this.numeroSerie = numeroSerie;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}
	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	@Override
	public void almacenar() {
		System.out.println("Almacenando en una sala");
	}

}

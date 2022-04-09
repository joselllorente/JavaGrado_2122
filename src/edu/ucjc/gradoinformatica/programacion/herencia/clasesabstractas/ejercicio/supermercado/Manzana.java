package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.supermercado;

public final class Manzana extends ProductoAlimentacion {
	private String tipo;

	public Manzana(String nombre, double precio, String fechaCaducidad, String tipo) {
		super(nombre, precio, fechaCaducidad);
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}

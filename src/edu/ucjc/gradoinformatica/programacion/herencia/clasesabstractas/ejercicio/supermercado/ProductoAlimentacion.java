package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.supermercado;

public abstract class ProductoAlimentacion extends Producto {
	private String fechaCaducidad;
	
	public ProductoAlimentacion(String nombre, double precio, String fechaCaducidad) {
		super(nombre, precio);
		this.fechaCaducidad = fechaCaducidad;
	}

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}


	@Override
	public void almacenar() {
		System.out.println("Almacenando en camara frigorífica");

	}

}

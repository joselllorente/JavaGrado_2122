package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio;

public abstract class Vehiculo {
	private String nombre;
	private String color;
	private String identificador;
	
	
	
	public Vehiculo(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Vehiculo(String color, String identificador) {
		super();
		this.color = color;
		this.identificador = identificador;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public abstract void arrancar();
	
	public abstract void parar();
	
	public void acelerar() {
		System.out.println("Acelerando el vehiculo "+ this.nombre);
	}
	
}



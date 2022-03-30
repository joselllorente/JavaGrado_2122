package edu.ucjc.gradoinformatica.programacion.encapsulacion.ejercicios;

public class Concesionario {
	//Variables
	private String nombre;
	private String direccion;
	private int codPostal;
	private String marca;
	
	//Constructores
	public Concesionario (String nombre, String direccion, int codPostal, String marca) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.marca = marca;
	}

	public Concesionario (String nombre, String direccion, int codPostal) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.codPostal = codPostal;
	}

	
	
	//Get y Set
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNombre() {
		return nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public int getCodPostal() {
		return codPostal;
	}
	
	
	
}

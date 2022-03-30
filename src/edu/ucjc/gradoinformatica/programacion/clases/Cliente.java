package edu.ucjc.gradoinformatica.programacion.clases;

public class Cliente {
	//Atributos
	String nombre;
	String apellidos;
	String dni;
	int edad;
	
	//Constructores
	public Cliente (String nombre, String apellidos, String dni, int edad) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.edad = edad;
	}
	
	public Cliente (String nombre, String apellidos, String dni) {
		System.out.println("Creando objeto cliente sin edad ");
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		
	}
	
	public Cliente () {
		System.out.println("Creando objeto cliente vacio");
		this.nombre="Inventado";
	}

	
	
	
}

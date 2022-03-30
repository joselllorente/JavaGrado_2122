package edu.ucjc.gradoinformatica.programacion.clases.ejercicios.coche;

public class Coche {
	//Atributos
	String matricula;
	String color;
	int numPuertas;
	double velocidadMaxima;
	
	//Constructores
	public Coche (String matricula) {
		this.matricula = matricula;
	}
	
	public Coche (String matricula, String color, int numPuertas, double velocidadMaxima) {
		this.matricula=matricula;
		this.color = color;
		this.numPuertas = numPuertas;
		this.velocidadMaxima = velocidadMaxima;
	}
	
}

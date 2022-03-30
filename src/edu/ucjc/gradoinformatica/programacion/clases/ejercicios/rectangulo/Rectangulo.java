package edu.ucjc.gradoinformatica.programacion.clases.ejercicios.rectangulo;

public class Rectangulo {
	double base;
	double altura;
	
	public Rectangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public Rectangulo (double dato) {
		this.base = dato;
		this.altura = dato;
	}
	
	public Rectangulo () {
		this.base = 5.5;
		this.altura = 10.7;
	}
	
	public double calculaArea () {
		double reply = 0.0;
		reply = this.base * this.altura;
		
		return reply;
	}
}







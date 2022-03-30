package edu.ucjc.gradoinformatica.programacion.clases.ejercicios.rectangulo;

public class Utils {
	
	public static double calculaArea (double base, double altura) {
		double area = 0.0;
		area = base*altura;		
		return area;
	}
	
	public static double calculaArea (Rectangulo rectangulo) {
		double area = 0.0;
		area = rectangulo.base * rectangulo.altura;		
		return area;
	}
}

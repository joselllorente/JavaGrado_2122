package edu.ucjc.gradoinformatica.programacion.clases.ejercicios.rectangulo;

public class MainRectangulo {

	public static void main(String[] args) {
		
		Rectangulo rectangulo1 = new Rectangulo(8.5, 15.7);
		Rectangulo rectangulo2 = new Rectangulo(7.0);
		Rectangulo rectangulo3 = new Rectangulo();
		
		System.out.println("Base: "+ rectangulo1.base + " Altura: " + rectangulo1.altura);
		System.out.println("Base: "+ rectangulo2.base + " Altura: " + rectangulo2.altura);
		System.out.println("Base: "+ rectangulo3.base + " Altura: " + rectangulo3.altura);

		rectangulo3=rectangulo2;
		System.out.println("Base: "+ rectangulo3.base + " Altura: " + rectangulo3.altura);
		
		double areaRect1 = rectangulo1.calculaArea();
		double areaRect2 = rectangulo2.calculaArea();
		double areaRect3 = rectangulo3.calculaArea();
		System.out.println(areaRect1);
		System.out.println(areaRect2);
		System.out.println(areaRect3);
		
		double areaRect1Bis = Utils.calculaArea(rectangulo1.base, rectangulo1.altura );
		double areaRect2Bis = Utils.calculaArea(rectangulo2.base, rectangulo2.altura );
		double areaRect3Bis = Utils.calculaArea(rectangulo3.base, rectangulo3.altura );
		
		
		Utils.calculaArea(rectangulo1);
		Utils.calculaArea(rectangulo2);
		Utils.calculaArea(rectangulo3);
		
		
	}

}








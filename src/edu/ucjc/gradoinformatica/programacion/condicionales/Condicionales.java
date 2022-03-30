package edu.ucjc.gradoinformatica.programacion.condicionales;

public class Condicionales {
	public static void main(String[] args) {
		
		int num =9, num2=5;
		boolean esMayor = num>num2;
		//Condicionales con if
		if( !esMayor || num2>3 ) {
			System.out.println("Entra");
		}else if(num>10) {
			System.out.println("Entra2");
		}else if(num>5) {
			System.out.println("Entra3");
		}else if(num>1) {
			System.out.println("Entra4");
		}else {
			System.out.println("else");
		}
		
		//Condicionales con switch
		String opcion = "Z";
		switch(opcion) {
			case "A":
			case "E":
				System.out.println("El resultado es E");
				break;
			case "I":System.out.println("El resultado es I");break;
			case "O":System.out.println("El resultado es O");break;
			case "U":System.out.println("El resultado es U");break;
			default:
				System.out.println("El resultado es una consonante");
		}
		
		
		//Operador ternario
		String dato = "A";
		String color = dato.equals("A")?"AZUL":"ROJO";
		System.out.println("El color es: " + color + (num + num2));
		String color2 = "";
		if (dato.equals("A")) {
			color2 = "AZUL";
		}else {
			color2 = "ROJO";
		}
		
		
		int resultado = (2+num)*3+num2;
		//num-->9
		//num2-->5
		System.out.println("resultado"+resultado);
		
		//OPerador
		int resto = 8%2;
		System.out.println(resto);
		
		
		
		
		
		
		
		
	}
}

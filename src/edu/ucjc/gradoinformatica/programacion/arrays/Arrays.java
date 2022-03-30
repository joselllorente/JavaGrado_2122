package edu.ucjc.gradoinformatica.programacion.arrays;

public class Arrays {

	public static void main(String[] args) {
		//Declaración array
		String [] colores = new String [4];
		//Incializamos 
		colores[2] = "azul";
		colores[1] = "amarillo";
		colores[3] = "rojo";
		colores[0] = "verde";
		System.out.println(colores[0]);
		System.out.println(colores[1]);
		System.out.println(colores[2]);
		System.out.println(colores[3]);
		
		//Recorremos array
		System.out.println("========================");
		for (int i=0;i<colores.length;i++) {
			System.out.println(colores[i]);
		}
		
		//Bucle foreach
		System.out.println("========================");
		for ( String color  : colores ) {
			System.out.println(color);
		}
		
		
		
		

		
		
		
		
	}

}

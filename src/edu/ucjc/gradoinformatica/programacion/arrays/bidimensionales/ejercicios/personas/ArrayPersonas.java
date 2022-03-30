package edu.ucjc.gradoinformatica.programacion.arrays.bidimensionales.ejercicios.personas;

import java.util.Scanner;

/*
 * Crear una clase Persona con nombre y dni.
 * Crear una clase con un método main que tenga una matriz bidimensional de tipo Persona de 2x2.
 * Rellenar los objetos de la matriz con datos que se pidan por consola.
 * Una vez la matriz esté rellena, pedir un DNI por la consola e indicar en que posición dentro del array se encuentra la persona con ese DNI (si es que se encuentra).

 */
public class ArrayPersonas {

	public static void main(String[] args) {
		Persona [][] personas = new Persona [2][2];
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < personas.length; i++) {
			for (int j = 0; j < personas[i].length; j++) {
				
				System.out.println("Introduce el dni de la persona ["+ i+"],["+j + "]");
				String dni = scan.nextLine();
				System.out.println("Introduce el nombre de la persona ["+ i+"],["+j + "]");
				String nombre = scan.nextLine();
				
				//Creo el objeto que voy a guardar
				Persona persona = new Persona(nombre, dni);
				
				//Guardo el objeto en la posición
				personas[i][j] = persona;
				
			}
		}

		
		System.out.println("Introduce el dni de la persona a buscar");
		String dniABuscar = scan.nextLine();
		for (Persona[] personasArrayUni : personas) {
			for (Persona persona : personasArrayUni) {
				if (persona.getDni().equals(dniABuscar)) {
					System.out.println("Persona encontrada, su nombre es: " + persona.getNombre());
					//No puede haber una persona con el mismo DNI
					break;
				}
			}
		}
		
	}

}

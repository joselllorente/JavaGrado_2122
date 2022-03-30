package edu.ucjc.gradoinformatica.programacion.arrays.ejercicios;

import java.util.Scanner;

public class ArrayAlumnos {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.print("Introduce el numero de alumnos: \t");
		int numAlumnos = scan.nextInt();
		System.out.println(numAlumnos);
		//Declaro el array con el tamaño
		String [] alumnos = new String [numAlumnos];
		
		//Introducimos información
		scan.nextLine();
		for (int i = 0; i < alumnos.length; i++) {
			System.out.print("Escribe el nombre del alumno " + (i+1));
			String nombreAlumno = scan.nextLine();
			alumnos[i]= nombreAlumno;
		}
		
		//Mostramos información
		for (String alumno : alumnos) {
			System.out.println(alumno);
		}
		
		
		for (int i = alumnos.length-1 ; i>=0; i--) {
			System.out.println(alumnos[i]);
		}
		
		
		
		
		
		

	}

}

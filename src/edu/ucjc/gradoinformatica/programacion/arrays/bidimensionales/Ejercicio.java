package edu.ucjc.gradoinformatica.programacion.arrays.bidimensionales;

import java.util.Scanner;

public class Ejercicio {

	public static void main(String[] args) {
		//Declaramos array bidimensional con 3 filas
		int numeros [][] = new int[3][];
		
		//Indicamos el número de columnas por cada fila
		for (int i=0; i<numeros.length;i++) {
			Scanner scan = new Scanner (System.in);
			System.out.println("Introduce numero de columnas para la fila "+i);
			int columnas = scan.nextInt();
			numeros [i] = new int [columnas];
		}

		//Almaceno valores
		//Recorro las filas
		for (int i=0; i<numeros.length;i++) {
			//Por cada fila, recorro sus columnas
			for (int j=0; j<numeros[i].length;j++) {
				Scanner scan = new Scanner (System.in);
				System.out.println("Introduce valor para la posicion ["+i+"],["+j+"]");
				int numero = scan.nextInt();
				numeros [i][j] = numero;
			}
			
		}
		//System.out.print(numeros);
		
//		//Muestro valores
//		//Recorro las filas
		for (int i=0; i<numeros.length;i++) {
			//Por cada fila, recorro sus columnas
			for (int j=0; j<numeros[i].length;j++) {
				//System.out.println("["+i+"],["+j+"]:" + numeros[i][j]);
				System.out.print(numeros[i][j]+",");
				
			}
			System.out.println();
		}
		
		System.out.println("=======================================");

		for (int i=0; i<numeros.length;i++) {
			//Si la fila es par
			if (i%2==0) {
				for (int j=0; j<numeros[i].length;j++) {
					System.out.print(numeros[i][j]+",");
				}
			}else {
				for (int j= numeros[i].length-1; j>=0 ;j-- ) {
					System.out.print(numeros[i][j]+",");
				}
			}
			System.out.println();
		}

	}

}

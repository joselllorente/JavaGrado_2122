package edu.ucjc.gradoinformatica.programacion.arrays.bidimensionales;

public class ArrayBidimensionales {

	public static void main(String[] args) {
		//Array bidimensional
		int [][] numeros = new int[4][4];
		numeros[1][1] =10;
		//System.out.println(numeros[1][1]);
		for (int i=0 ; i< numeros.length ; i++) {
			for (int j=0 ;  j<numeros[i].length  ; j++ ) {
				System.out.println(numeros[i][j]);
			}
		}
		
		//
		char [][] letras = new char[3][];
		letras [0] = new char[4];
		letras [1] = new char[6];
		letras [2] = new char[3];
		System.out.println("'"+letras[1][0]+"'");
		
		
		
		
		
		
	}

}

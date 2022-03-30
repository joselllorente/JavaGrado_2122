package edu.ucjc.gradoinformatica.programacion.bucles.ejercicio;

import java.util.Scanner;

public class EjercicioMenuFibonacci2 {

	public static void main (String [] args) {
		
		int opcion = 0;
		do {
			System.out.println("1. Serie Fibonnacci");
			System.out.println("2. Conjetura Collatz");
			System.out.println("3. Salir");
			
			System.out.println("Seleccione una opción");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			switch(opcion) {
				case 1: 
					System.out.println("Introduce numero de elementos");
					Scanner scan2 = new Scanner(System.in);
					int numerosFibonnaci = scan2.nextInt();
					
					int num1 = 0;
					int num2 = 1;
					System.out.print(num1+",");
					System.out.print(num2+",");
					for(int i = 0; i<numerosFibonnaci-2 ; i++) {
						int suma = num1 + num2;
						System.out.print(suma+",");
						num1 = num2;
						num2 = suma;
					}
					System.out.println();
					break;
				
				case 2: 
					System.out.println("Introduce numero");
					Scanner scan3 = new Scanner(System.in);
					int numeroCollatz = scan3.nextInt();
					System.out.print(numeroCollatz + ", ");
					while (numeroCollatz!=1) {
						
						if(numeroCollatz%2==0) {//Es par
							numeroCollatz = numeroCollatz/2;
						}else {//Impar
							numeroCollatz = numeroCollatz*3+1;
						}
						System.out.print(numeroCollatz + ", ");
						
					}
					System.out.println();
					
					break;
				case 3: 
					System.out.println("Adios!!");
					break;
				default: System.out.println("Opcion incorrecta, vuelva a intentarlo");
			}
			
			
		}while(opcion!=3);
	}
}

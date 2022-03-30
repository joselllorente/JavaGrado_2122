package edu.ucjc.gradoinformatica.programacion.bucles.ejercicio;

import java.util.Scanner;

/**
 * 
 * @author joseluis
 * Clase que crea un menu con las opciones
 * 1. Serie Fibonacci
 * 2. Conjetura de Collatz
 * 3. Salir
 *
 * Y solicita una opción
 */
public class EjercicioMenuFibonacci {

	public static void main(String[] args) {
		
		int opcion=0;

		do {
			System.out.println("1. Serie Fibonnacci");
			System.out.println("2. Conjetura de Collatz");
			System.out.println("3. Salir");
			
			System.out.print("Seleccione una opción: ");
			Scanner scan = new Scanner(System.in);
			opcion = scan.nextInt();
			
			switch(opcion) {
				case 1:
					System.out.print("Cuantos números de la serie de Fibonnaci quieres que aparezcan: ");
					Scanner scan2 = new Scanner(System.in);
					int numRepeticiones = scan2.nextInt();
					
					int num1=0;
					int num2=1;
					System.out.print(num1+ "\t");
					System.out.print(num2+ "\t");
					for (int i= 0;i<numRepeticiones-2;i++) {
						int suma = num1+num2;
						System.out.print(suma+ "\t");
						num1 = num2;
						num2 = suma;
					}
					//Pinta linea en blanco
					System.out.println();
					break;
				case 2:
					System.out.print("Escribe el numero para demostrar la conjetura de Collatz: ");
					Scanner scan3 = new Scanner(System.in);
					int numeroCollatz = scan3.nextInt();
					System.out.print(numeroCollatz + "\t");
					//Termina cuando vale 1, por tanto seguimos en el bucle mientras no valga 1
					while (numeroCollatz!=1) {
						if(numeroCollatz%2==0) {//Es un numero par
							numeroCollatz = numeroCollatz/2;
							//numeroCollatz /=2;//Otra forma de hacerlo
						}else {//Es impar
							numeroCollatz = numeroCollatz*3+1; 
						}
						System.out.print(numeroCollatz+ "\t");
					}
					System.out.println();
					break;
				case 3:
					System.out.println("Adios!!!");
					break;
				default:
					System.err.println("Opción incorrecta vuelve a intentarlo\n");
			}
			
		}while(opcion!=3);
		
	}

}

package edu.ucjc.gradoinformatica.programacion.bucles;

import java.util.Scanner;

public class Bucles {

	public static void main(String[] args) {
		int num = 6;
		System.out.println("Ent'r'a"+num);
		
		//Bucle for
		int i=0 ;
		
		for (  ; i<5	; i++	) {
			if(i%2==0) {
				continue;
			}if(i%3==0) {
				break;
			}
			System.out.println(""+i);
		}

		System.out.println("El valor de i es: "+i);
		//Bucle while
		while(i<5) {
			System.out.println("While "+i);
			System.out.println(i++);
			System.out.println(i);
			System.out.println(++i);
		}
		
		int valor = 10;
		while (true) {//Intentar evitar
			if (valor%50==0)//El if con una linea no necesita llaves
				break;
			valor++;
		}
		
		
		//Bucle do-while()
		int numero = 10;
		do {
			
			numero +=2;
			System.out.println("Do-while El numero es"+numero);
			
		}while (numero<20);
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Escribe un numero");
		//int opcion = scan.nextInt();
		//System.out.println("El numero es "+opcion);
		String texto = scan.nextLine();
		System.out.println("El texto es "+texto);
		
		
		
		
		
		System.out.println("Fin");
	}

}

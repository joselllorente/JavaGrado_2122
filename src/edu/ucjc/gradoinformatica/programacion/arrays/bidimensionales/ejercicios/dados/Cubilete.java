package edu.ucjc.gradoinformatica.programacion.arrays.bidimensionales.ejercicios.dados;

/*
* Crear clase Dado con los atributos color y numLados con un método denominado lanzarDado() que devuelva un número aleatorio entre 1 y el número de lados del dado.
* Crear una clase con un método main() donde se creen 3 dados, el primero se debe lanzar 5 veces, el segundo 3 y el tercero 2. Almacenar el resultado de lanzar cada dado en un array bidimensional (cada fila representa las tiradas de un dado)
* Obtener cual es el dado o dados que han sacado un numero más alto.
*/
public class Cubilete {

	private static final int TIRADAS_DADO_1=5;
	private static final int TIRADAS_DADO_2=3;
	private static final int TIRADAS_DADO_3=2;
	
	public static void main(String[] args) {
		Dado dado1 = new Dado("rojo",6);
		Dado dado2 = new Dado("rojo",6);
		Dado dado3 = new Dado("rojo",6); 
		 
		//Declaro el array, tengo 3 dados por tanto con 3 filas
		int [][] resultadosTiradas = new int [3][];
		
		//Inicializo el array, cada fila con el numero de tiradas de cada dado
		resultadosTiradas[0] = new int[TIRADAS_DADO_1];
		resultadosTiradas[1] = new int[TIRADAS_DADO_2];
		resultadosTiradas[2] = new int[TIRADAS_DADO_3];
		
		System.out.println("\nLanzando dado 1");
		//Lanzo dado1
		for (int i = 0; i < TIRADAS_DADO_1; i++) {
			resultadosTiradas[0][i] = dado1.lanzarDado();
		}
		
		System.out.println("\nLanzando dado 2");
		//Lanzo dado2
		for (int i = 0; i < TIRADAS_DADO_2; i++) {
			resultadosTiradas[1][i] = dado2.lanzarDado();
		}

		System.out.println("\nLanzando dado 3");
		//Lanzo dado3
		for (int i = 0; i < TIRADAS_DADO_3; i++) {
			resultadosTiradas[2][i] = dado3.lanzarDado();
		}
		
		
		int num_max = 0;
		//Recorro las lineas que representa las tiradas de los dados
		for (int i = 0; i < resultadosTiradas.length; i++) {
			//Cojo cada tirada del mismo dado
			for (int j = 0; j < resultadosTiradas[i].length; j++) {
				//Miro si es mayor que num_max
				if (resultadosTiradas[i][j]>num_max) {
					//si lo es guardo el nuevo valor más alto
					num_max = resultadosTiradas[i][j];
				}
			}
		}
		System.out.println("\nEl numero más alto que ha salido es el "+ num_max);
		
		//Ahora miro ese valor en que dado sale
		for (int i = 0; i < resultadosTiradas.length; i++) {
			for (int j = 0; j < resultadosTiradas[i].length; j++) {
				if (resultadosTiradas[i][j]==num_max) {
					System.out.println("El numero "+num_max + " esta en el dado " + (i+1));
					break;
				}
			}
		}
	}
	
	
	
}

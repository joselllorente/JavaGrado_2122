package edu.ucjc.gradoinformatica.programacion.clases.ejercicios.coche;

public class MainCoche {

	public static void main(String[] args) {

		Coche coche1 = new Coche("1111-GHF");
		Coche coche2 = new Coche("2222-ABC");
		Coche coche3 = new Coche("3333-DEF", "azul", 4, 150.0);

		coche1.color = "Rojo";
		coche1.numPuertas = 5;
		coche1.velocidadMaxima = 200;

		coche2.color = "Negro";
		coche2.numPuertas = 4;
		coche2.velocidadMaxima = 200;

		System.out.println("Coche con matricula " + coche1.matricula + 
						" color: " + coche1.color + " numero de puertas: " 
						+coche1.numPuertas + " y velocidad máxima " +coche1.velocidadMaxima);
		
		System.out.println("Coche con matricula " + coche2.matricula + 
				" color: " + coche2.color + " numero de puertas: " 
				+coche2.numPuertas + " y velocidad máxima " +coche2.velocidadMaxima);
		
		System.out.println("Coche con matricula " + coche3.matricula + 
				" color: " + coche3.color + " numero de puertas: " 
				+coche3.numPuertas + " y velocidad máxima " +coche3.velocidadMaxima);
	}

}

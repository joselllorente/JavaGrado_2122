package edu.ucjc.gradoinformatica.programacion.encapsulacion.ejercicios;

public class TestConcesionario {

	public static void main(String[] args) {
		Concesionario concesionario1 = new Concesionario("Concesionario1", 
				"Direccion1", 28015);
		concesionario1.setMarca("OPEL");
		
		Concesionario concesionario2 = new Concesionario("Concesionario2",
				"Direccion2", 28925, "Ford");
		
		System.out.println("Concesionario :" + concesionario1.getNombre() + 
				" direccion: "+ concesionario1.getDireccion() + 
				" marca: "+ concesionario1.getMarca());
		
		System.out.println("Concesionario :" + concesionario2.getNombre() + 
				" direccion: "+ concesionario2.getDireccion() + 
				" marca: "+ concesionario2.getMarca());

	}

}

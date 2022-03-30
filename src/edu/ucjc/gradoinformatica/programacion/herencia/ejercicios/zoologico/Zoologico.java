package edu.ucjc.gradoinformatica.programacion.herencia.ejercicios.zoologico;

public class Zoologico {

	public static void main(String[] args) {
		Elefante elefante1 = new Elefante("Dumbo","Africano",2);
		elefante1.comer();
		elefante1.desplazar();

		Vaca vaca1 = new Vaca ("Rosita","Lechera",2);
		vaca1.comer();
		vaca1.desplazar();
		
		Serpiente serpiente1 = new Serpiente("Serpiente1","Víbora",3);
		serpiente1.comer();
		serpiente1.desplazar();
		
		Animal animal1 = new Animal("Animal1","Tipo1");
		
		Animal [] animales = new Animal [3];
		animales[0]=elefante1;
		animales[1] = vaca1;
		animales[2]= serpiente1;
		System.out.println("==============================");
		//comerAnimales(animales);
		
		Animal animal = new Elefante("Eli","Asiatico",1.5);
		animal.desplazar();
		//Hacemos cast
		Elefante elefante2 = ((Elefante)animal);
		elefante2.programarJava();
		//animal.programarJava();
		
		Animal animal2 = new Serpiente("Eli","Asiatico",1.5);
		if (animal instanceof Elefante) {
			Elefante elefante3 = ((Elefante)animal);
			elefante3.programarJava();
		}
		
		
		
	}
	
	public static void comerAnimales(Animal [] animales) {
		for (Animal animal : animales) {
			animal.desplazar();
			if (animal instanceof Elefante) {
				Elefante elefante3 = ((Elefante)animal);
				elefante3.programarJava();
			}
		}
	}
	
	

}






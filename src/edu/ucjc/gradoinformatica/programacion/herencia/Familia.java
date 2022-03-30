package edu.ucjc.gradoinformatica.programacion.herencia;

public class Familia {

	public static void main(String[] args) {
		Hija1 hija1 = new Hija1("Valor1","Valor2",6,"valor3");
		
		hija1.metodo1();
		Hija1 hija2 = hija1;
		
		System.out.println("Mostrando hija1: "+ hija1);
		System.out.println("Mostrando hija1: "+ hija2);
		System.out.println("Mostrando hija1: "+ 7);
		
		
		System.out.println(hija1.getAtributo1());
		//Padre p = new Hija1();
		

	}

}

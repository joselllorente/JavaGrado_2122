package edu.ucjc.gradoinformatica.programacion.metodos;

public class ClaseB {

	public static void main(String[] args) {
		ClaseA claseA = new ClaseA();
		claseA.metodo1();

	}
	
	public void metodoB1() {
		ClaseA.metodo3("");
		ClaseA claseA = new ClaseA();
		claseA.metodo2();
		claseA.metodo3("");
	}

}

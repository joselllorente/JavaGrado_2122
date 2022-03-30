package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas;

public abstract class ClaseA {
	private String atributo1;

	public String getAtributo1() {
		return atributo1;
	}

	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}
	
	public void metodo1 () {
		System.out.println(this.atributo1);
	}
	
	public abstract void metodo2();
	
	public abstract int metodo3(String nombre);
	
}









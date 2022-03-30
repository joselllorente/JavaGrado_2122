package edu.ucjc.gradoinformatica.programacion.herencia;

public class Padre {
	private String atributo1;
	private String atributo2;
	private int atributo3;
	
	public Padre() {
		super();
		System.out.println("Constructor Padre");
	}
	
	public Padre(String atributo1, String atributo2, int atributo3) {
		super();
		this.atributo1 = atributo1;
		this.atributo2 = atributo2;
		this.atributo3 = atributo3;
	}
	
	public String getAtributo1() {
		return atributo1;
	}
	public void setAtributo1(String atributo1) {
		this.atributo1 = atributo1;
	}
	public String getAtributo2() {
		return atributo2;
	}
	public void setAtributo2(String atributo2) {
		this.atributo2 = atributo2;
	}
	public int getAtributo3() {
		return atributo3;
	}
	public void setAtributo3(int atributo3) {
		this.atributo3 = atributo3;
	}
	
	public void metodo1() {
		System.out.println("Yo soy tu padre!");
	}

	@Override
	public String toString() {
		return "Padre [atributo1=" + atributo1 + ", atributo2=" + atributo2 + ", atributo3=" + atributo3 + "]";
	}
	
	
}







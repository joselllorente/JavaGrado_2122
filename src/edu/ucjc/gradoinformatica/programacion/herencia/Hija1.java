package edu.ucjc.gradoinformatica.programacion.herencia;

public class Hija1 extends Padre{
	private String atributo4;
	
//	public Hija1 () {
//		super("","",9);
//		System.out.println("Constructor Hija1");
//	}

	public Hija1(String atributo1, String atributo2, int atributo3, String atributo4) {
		super(atributo1, atributo2, atributo3);
		this.atributo4 = atributo4;
		
	}

//	public Hija1(String atributo4) {
//		this.atributo4 = atributo4;
//	}
	
	public String getAtributo4() {
		return atributo4;
	}

	public void setAtributo4(String atributo4) {
		this.atributo4 = atributo4;
	}
	
	
	@Override
	public void metodo1() {
		//super.metodo1();
		System.out.println("Yo soy la hija!");
	}

//	@Override
//	public String toString() {
//		return "Hija1 [atributo4=" + atributo4 + "]";
//	}
	
	
}






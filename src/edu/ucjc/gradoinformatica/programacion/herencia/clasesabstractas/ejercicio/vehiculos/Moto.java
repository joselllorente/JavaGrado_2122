package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.vehiculos;

public class Moto extends VehiculoTerrestre {
	private String manillar;
	private String cadena;
	
	public Moto(String nombre, int numRuedas, String manillar, String cadena) {
		super(nombre, numRuedas);
		this.manillar = manillar;
		this.cadena = cadena;
	}

	
	public String getManillar() {
		return manillar;
	}
	public void setManillar(String manillar) {
		this.manillar = manillar;
	}


	public String getCadena() {
		return cadena;
	}
	public void setCadena(String cadena) {
		this.cadena = cadena;
	}

	@Override
	public void arrancar() {
		System.out.println("Arrancando Moto " + getNombre());
	}
	
	public void hacerCaballito() {
		System.out.println("La Moto "+getNombre() +" esta haciendo un caballito");
	}

}

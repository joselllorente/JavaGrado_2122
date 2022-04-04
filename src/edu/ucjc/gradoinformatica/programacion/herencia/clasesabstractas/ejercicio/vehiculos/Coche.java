package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.vehiculos;

public final class Coche extends VehiculoTerrestre {
	private String ventanillas;
	
	public Coche(String nombre, int numRuedas, String ventanillas) {
		super(nombre, numRuedas);
		this.ventanillas = ventanillas;
	}

	public String getVentanillas() {
		return ventanillas;
	}
	public void setVentanillas(String ventanillas) {
		this.ventanillas = ventanillas;
	}

	@Override
	public void arrancar() {
		System.out.println("Arrancando coche "+ getNombre());

	}
	
	public void subirVentanillas() {
		System.out.println("El coche "+getNombre() +" esta subiendo las ventanillas");
	}

}




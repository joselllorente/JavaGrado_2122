package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.vehiculos;

public final class Avion extends VehiculoAereo {
	private String turbinas;
	
	public Avion(String nombre, double altitudMaxima, String turbinas) {
		super(nombre, altitudMaxima);
		this.turbinas = turbinas;
	}

	public String getTurbinas() {
		return turbinas;
	}
	public void setTurbinas(String turbinas) {
		this.turbinas = turbinas;
	}

	@Override
	public void arrancar() {
		System.out.println("El avión " + getNombre() + " esta arrancando motores" );

	}

	@Override
	public void parar() {
		System.out.println("El avión " + getNombre() + " esta parando motores" );

	}

}

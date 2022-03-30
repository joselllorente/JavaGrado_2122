package edu.ucjc.gradoinformatica.programacion.encapsulacion;

public class Universidad {
	public static void main(String[] args) {
		
		Alumno alumno1 = new Alumno("nombre1","apellidos","213B");
		System.out.println(alumno1.getNombre());
		alumno1.setNombre("Nombre2");
		System.out.println(alumno1.getNombre());
		
	}
}

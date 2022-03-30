package edu.ucjc.gradoinformatica.programacion.clases;

public class Banco {

	public static void main(String[] args) {
		String color = "rojo";
		Cliente cliente1 = new Cliente("Maria","Apellidos","1X");
		Cliente cliente4 = new Cliente("Mario","Apellidos","1Z");
		cliente1.edad =23;
		System.out.println(cliente1.nombre);
		System.out.println(cliente4.dni);
		
		Cliente cliente2 = cliente1;
		cliente2.edad = 35;
		System.out.println(cliente1.edad);
		
		//System.out.println(cliente1==cliente2);
		
		
//		String mensaje = "Hola";
//		String mensaje2 = "Hola";
//		String mensaje3 = new String("Hola");
//		
//		System.out.println("Comparando Strings: "+(mensaje==mensaje2));
//		System.out.println(mensaje.equals(mensaje2));
//		System.out.println(mensaje==mensaje3);
//		System.out.println(mensaje.equals(mensaje3));
		
		
		
	}

}




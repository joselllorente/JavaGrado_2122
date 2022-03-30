package edu.ucjc.gradoinformatica.programacion.metodos;

public class ClaseA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClaseA claseA = new ClaseA();
		claseA.metodo1();
	}
	
	public void metodo1() {
		System.out.println("Llamando a metodo1");
		String texto = metodo2();
		
		System.out.println(texto);
		
		System.out.println(metodo2());
	}
	
	public String metodo2() {
		String reply="";
		reply = "Hola Mundo";
		
		int longitudTexto = metodo3(reply);
		
		return reply;
	}
	
	public static int metodo3 (String cadenaTexto) {
		int reply=0;
		
		reply = cadenaTexto.length();
		
		
		return reply;
	}

}






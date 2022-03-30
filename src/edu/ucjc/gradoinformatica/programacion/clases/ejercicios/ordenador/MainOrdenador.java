package edu.ucjc.gradoinformatica.programacion.clases.ejercicios.ordenador;

public class MainOrdenador {

	public static void main(String[] args) {
		
		Ordenador ordenador1 = new Ordenador(1);
		
		MemoriaRAM memoriaRam = new MemoriaRAM("Marca1", "Tipo1", 256, 3600, 150);
		DiscoDuro discoDuro = new DiscoDuro("Marca2", "modelo", "SSD", 500, 100);
		
		Ordenador ordenador2 = new Ordenador(2, memoriaRam, discoDuro);
		
		System.out.println(ordenador2.memoriaRam.precio);
		
		
		MemoriaRAM memoriaRam2 = new MemoriaRAM("MarcaXXR", "TipoR", 32, 2400, 60);
		DiscoDuro discoDuro2 = new DiscoDuro("Marca4", "modeloT", "SSD", 1, 200);
		ordenador1.memoriaRam = memoriaRam2;
		ordenador1.discoDuro = discoDuro2;
		
		double precioOrdenador1 = ordenador1.memoriaRam.precio + ordenador1.discoDuro.precio;
		double precioOrdenador2 = ordenador2.memoriaRam.precio + ordenador2.discoDuro.precio;

		System.out.println("Precio del ordenador 1: "+ precioOrdenador1);
		System.out.println("Precio del ordenador 2: "+ precioOrdenador2);
	}

}

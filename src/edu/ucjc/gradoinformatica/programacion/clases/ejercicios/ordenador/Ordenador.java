package edu.ucjc.gradoinformatica.programacion.clases.ejercicios.ordenador;

public class Ordenador {
	//Atributos o variables de clase
	int id;
	MemoriaRAM memoriaRam;
	DiscoDuro discoDuro;

	//Constructores
	public Ordenador(int id) {
		this.id = id;
	}

	public Ordenador(int id, MemoriaRAM memoriaRam, DiscoDuro discoDuro) {
		this.id = id;
		this.memoriaRam = memoriaRam;
		this.discoDuro = discoDuro;
	}
	
}

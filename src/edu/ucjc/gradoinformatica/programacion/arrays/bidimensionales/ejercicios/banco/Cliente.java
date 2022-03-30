package edu.ucjc.gradoinformatica.programacion.arrays.bidimensionales.ejercicios.banco;

public class Cliente {
	private String nombre;
	private String dni;
	private CuentaBancaria cuentaBancaria;
	
	//Constructores
	public Cliente(String nombre, String dni) {
		super();
		this.nombre = nombre;
		this.dni = dni;
	}
	
	public Cliente(String nombre, String dni, CuentaBancaria cuentaBancaria) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.cuentaBancaria = cuentaBancaria;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public CuentaBancaria getCuentaBancaria() {
		return cuentaBancaria;
	}
	public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}
	public String getDni() {
		return dni;
	}
	
	
}

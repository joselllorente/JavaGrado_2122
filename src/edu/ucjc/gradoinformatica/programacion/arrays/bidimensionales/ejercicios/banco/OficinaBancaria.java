package edu.ucjc.gradoinformatica.programacion.arrays.bidimensionales.ejercicios.banco;

public class OficinaBancaria {
	private String nombre;
	private Cliente [] clientes;
	
	public OficinaBancaria(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	public Cliente[] getClientes() {
		return clientes;
	}



	public void setClientes(Cliente[] clientes) {
		this.clientes = clientes;
	}



	public String getNombre() {
		return nombre;
	}



	/**
	 * Método para calcular el saldo de todos los clientes
	 * @return
	 */
	public double calculaSaldoClientes () {
		double saldoTotal = 0;
		
		for (Cliente cliente : clientes) {
			saldoTotal+= cliente.getCuentaBancaria().getSaldo();
		}
		
		
		return saldoTotal;
		
	}
	
}

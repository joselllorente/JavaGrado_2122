package edu.ucjc.gradoinformatica.programacion.arrays.bidimensionales.ejercicios.banco;

public class CuentaBancaria {
	private String numCuenta;
	private double saldo;
	public CuentaBancaria(String numCuenta, double saldo) {
		super();
		this.numCuenta = numCuenta;
		this.saldo = saldo;
	}
	public String getNumCuenta() {
		return numCuenta;
	}
	public double getSaldo() {
		return saldo;
	}
	
}

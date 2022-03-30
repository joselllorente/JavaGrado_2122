package edu.ucjc.gradoinformatica.programacion.arrays.bidimensionales.ejercicios.banco;

import java.util.Iterator;

public class Banco {
	public static void main(String[] args) {
		OficinaBancaria [] oficinas = new OficinaBancaria[2];
		
		//============================================================================
		//CREO OFICINA 1
		//============================================================================
		//Creo la oficina1
		OficinaBancaria oficina1 = new OficinaBancaria("Oficina1");
		
		//Creo los clientes de la oficina 1, cada cliente necesita una cuenta
		Cliente cliente1 = new Cliente("Cliente1","DNI1");
		CuentaBancaria cuenta1 = new CuentaBancaria("Cuenta1", 100);
		cliente1.setCuentaBancaria(cuenta1);
		
		Cliente cliente2 = new Cliente("Cliente2","DNI2");
		CuentaBancaria cuenta2 = new CuentaBancaria("Cuenta2", 1000);
		cliente2.setCuentaBancaria(cuenta2);
		
		//Como la oficina tiene dos clientes, creo un array de Cliente de tamaño 2
		Cliente [] clientesOficina1 = new Cliente[2];
		//Meto los clientes en sus posiciones
		clientesOficina1[0] = cliente1;
		clientesOficina1[1] = cliente2;
		
		//Asigno los clientes a la oficina
		oficina1.setClientes(clientesOficina1);
		
		//Meto la primera oficina en el array de oficinas
		oficinas[0] = oficina1;
		
		
		//============================================================================
		//CREO OFICINA 2
		//============================================================================
		
		//Creo la oficina2
		OficinaBancaria oficina2 = new OficinaBancaria("Oficina2");
		
		//Creo los clientes de la oficina 2, cada cliente necesita una cuenta
		Cliente cliente3 = new Cliente("Cliente3","DNI3");
		CuentaBancaria cuenta3 = new CuentaBancaria("Cuenta3", 200);
		cliente3.setCuentaBancaria(cuenta3);
		
		Cliente cliente4 = new Cliente("Cliente4","DNI4");
		CuentaBancaria cuenta4 = new CuentaBancaria("Cuenta4", 10000);
		cliente4.setCuentaBancaria(cuenta4);
		
		Cliente cliente5 = new Cliente("Cliente5","DNI5");
		CuentaBancaria cuenta5 = new CuentaBancaria("Cuenta5", 10);
		cliente5.setCuentaBancaria(cuenta5);
		
		//Como la oficina tiene res clientes, creo un array de Cliente de tamaño 3
		Cliente [] clientesOficina2 = new Cliente[3];
		//Meto los clientes en sus posiciones
		clientesOficina2[0] = cliente3;
		clientesOficina2[1] = cliente4;
		clientesOficina2[2] = cliente5;
		
		//Asigno los clientes a la oficina
		oficina2.setClientes(clientesOficina2);
		
		//Meto la primera oficina en el array de oficinas
		oficinas[1] = oficina2;
		
		
		calculaSaldoPorOficina(oficinas);
	}
	
	/**
	 * 
	 * @param oficinas
	 */
	private static void calculaSaldoPorOficina(OficinaBancaria [] oficinas) {
		
		for (OficinaBancaria oficina : oficinas) {
			double saldoTotal = oficina.calculaSaldoClientes();
			System.out.println("El saldo de la oficina " + oficina.getNombre() + " es " + saldoTotal);
		}
	}
	
}

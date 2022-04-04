package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.vehiculos;

public class FlotaVehiculos {

	public static void main(String[] args) {

		Moto moto1 = new Moto("Moto1",2 ,"Manillar","cadena");
		VehiculoTerrestre moto2 = new Moto("Moto2",2 ,"Manillar","cadena");
		
		moto1.arrancar();
		moto1.acelerar();
		moto1.hacerCaballito();
		moto1.derrapar();
		moto1.parar();
		
		Coche coche1 = new Coche("Coche1",4,"Ventanilla");
		VehiculoTerrestre coche2 = new Coche("Coche2",5,"Ventanilla2");
		Vehiculo coche3 = new Coche("Coche3",4,"Ventanilla3");

		coche1.subirVentanillas();
		if (coche2 instanceof Coche) {
			//Hago el Cast
			((Coche)coche2).subirVentanillas();
		}
		
		Avion avion1 = new Avion ("Avion1",10000,"Turbinas");
		
		
		VehiculoTerrestre [] vehiculos = {moto1,moto2,coche1,
				coche2,(VehiculoTerrestre)coche3};
		
		FlotaVehiculos flota = new FlotaVehiculos();
		flota.derraparVehiculos (vehiculos);
	}
	
	private void derraparVehiculos (VehiculoTerrestre [] vehiculos) {
		
		for (VehiculoTerrestre vehiculoTerrestre : vehiculos) {
			vehiculoTerrestre.derrapar();
			if (vehiculoTerrestre instanceof Moto) {
				Moto moto = (Moto)vehiculoTerrestre;
				moto.hacerCaballito();
			}
		}

	}
	

}






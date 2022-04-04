package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.vehiculos;

/*
 *Enunciado: 
 *
 * Crear la siguiente estructura jerarquica de clases

		+ Clase Vehiculo con los atributos nombre, color e identificador, con los métodos arrancar y parar abstractos y el método acelerar que ponga el "Acelerando el vehiculo <nombre>"
		+ Clase VehiculoTerrestre que herede de Vehiculo con el atributo numRuedas, dónde se implementa el código solo del método parar de la clase padre y el método derrapar que muestre el "Derrapando el vehiculo <nombre>"
		+ Clase VehiculoAereo que herede de Vehiculo con el atributo altitudMaxima, donde se declare el método volar que muestre "El vehículo aereo <nombre> esta volando como mucho a una altura de <alturaMaxima>
		+ Clase Coche que herede de VehiculoTerrestre con el atributo ventanilla de tipo String, que implemente el método arrancar() (sobreescribir de la clase Vehiculo) indicando "Arrancando coche <nombre>" y por otro lado crear el método subirVentanillas que muestra "El coche <nombre> esta subiendo las ventanillas"
		+ Clase Moto que herede de VehiculoTerrestre con los atributos ventanilla y manillar de tipo String, que implemente el método arrancar() (sobreescribir de la clase Vehiculo) indicando "Arrancando moto <nombre>" y por otro lado crear el método hacerCaballito que muestra "La moto <nombre> esta haciendo un caballito"
		+ Clase Avion que herede de VehiculoAereo  con el atributo turbinas de tipo String, y que sobreescriba arrancar y parar indicando en cada paso que está parando y arrancando motores

En la clase FlotaVehiculos, crear un main donde se crean los siguientes objetos

		+ Dos objetos de tipo Moto, el primero asociado a una variable de tipo Moto y el segundo a una variable de tipo VehiculoTerrestre. Se ejecutaran todos los métodos posibles para el primero de los objetos creados.
		+ Tres objetos de tipo Coche, el primero asociado a una variable de tipo Coche, el segundo a una variable de tipo VehiculoTerrestre y el tercero a una variable de tipo Vehiculo. Subir la ventanilla de los dos primeros coches
		+ Un objeto de tipo Avion

Crear método en FlotaVehiculos (no estático) para poner a derrapar sólo a los vehiculos terrestres y que cuando derrape una moto luego haga un caballito.

 */

public class FlotaVehiculos {

	public static void main(String[] args) {

		//Dos objetos de tipo Moto, el primero asociado a una variable de tipo Moto 
		//y el segundo a una variable de tipo VehiculoTerrestre. 
		Moto moto1 = new Moto("Moto1",2 ,"Manillar","cadena");
		VehiculoTerrestre moto2 = new Moto("Moto2",2 ,"Manillar","cadena");
		
		//Se ejecutaran todos los métodos posibles para el primero de los objetos creados		
		moto1.arrancar();
		moto1.acelerar();
		moto1.hacerCaballito();
		moto1.derrapar();
		moto1.parar();
		
		//Tres objetos de tipo Coche, el primero asociado a una variable de tipo Coche, 
		//el segundo a una variable de tipo VehiculoTerrestre y el tercero a una variable de tipo Vehiculo
		Coche coche1 = new Coche("Coche1",4,"Ventanilla");
		VehiculoTerrestre coche2 = new Coche("Coche2",5,"Ventanilla2");
		Vehiculo coche3 = new Coche("Coche3",4,"Ventanilla3");

		// Subir la ventanilla de los dos primeros coches
		coche1.subirVentanillas();
		
		//Del coche2 no se puede invocar al método directamente
		//coche2.subirVentanillas();
		//Para poder hacerlo es necesario primero ver que el objeto es del tipo que queremos en este caso Coche
		if (coche2 instanceof Coche) {
			//Y hago el Cast porque la varible de es de tipo VehiculoTerrestre y no tiene asociado el método subirVentanillas()
			((Coche)coche2).subirVentanillas();
		}
		
		//Ceo un objeto de tipo Avion
		Avion avion1 = new Avion ("Avion1",10000,"Turbinas");
		
		
		//Meto todos todos los vehiculos terrestres en un array de tipo VehiculoTerrestre
		VehiculoTerrestre [] vehiculos = {moto1,moto2,coche1, coche2,(VehiculoTerrestre)coche3};
		
		//Creo un objeto de la clase para llamar al método derraparVehiculos ya que no puede ser estático
		FlotaVehiculos flota = new FlotaVehiculos();
		
		//Invoco al método pasandole el array de vehiculos terrestres
		flota.derraparVehiculos (vehiculos);
	}
	
	
	//Crear método en FlotaVehiculos (no estático) para poner a derrapar sólo a los vehiculos terrestres 
	//y que cuando derrape una moto luego haga un caballito.
	private void derraparVehiculos (VehiculoTerrestre [] vehiculos) {
		
		for (VehiculoTerrestre vehiculoTerrestre : vehiculos) {
			vehiculoTerrestre.derrapar();
			//Miro si el vehiculoTerrestre es una moto
			if (vehiculoTerrestre instanceof Moto) {
				//Si es una moto hago el Cast para indicar que ese objeto es una Moto
				Moto moto = (Moto)vehiculoTerrestre;
				//Ahora la moto si puede llamar al método hacerCaballito
				moto.hacerCaballito();
			}
		}

	}
}






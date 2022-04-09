package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.supermercado;

public class Supermercado {
	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Nombre1","apellido1","Dir1",false);
		Cliente cliente2 = new Cliente("Nombre2","apellido2","Dir2",true);
		Cliente cliente3 = new Cliente("Nombre3","apellido3","Dir3",false);
		
		//Creamos Productos
		Producto manzana1 = new Manzana("Manzana1",1,"2023","GOlden");
		Producto manzana2 = new Manzana("Manzana2",1.5,"2023","Fuji");
		Producto manzana3 = new Manzana("Manzana3",1,"2023","GOlden");
		
		Producto tele1 = new Television("PH1", 500 , "PH1-3453", 50);
		Producto tele2 = new Television("PH2", 600 , "PH1-38976", 50);
		Producto tele3 = new Television("PH2", 400 , "PH1-34267", 50);
		
		cliente1.cogerCarrito();
		cliente1.aniadirProductoCarrito(tele3);
		cliente1.aniadirProductoCarrito(manzana1);
		
		cliente2.cogerCarrito();
		cliente2.aniadirProductoCarrito(tele2);
		cliente2.aniadirProductoCarrito(manzana2);
		
		cliente3.cogerCarrito();
		cliente3.aniadirProductoCarrito(tele1);
		cliente3.aniadirProductoCarrito(manzana3);
		
		//Fila de clientes
		Cliente [] colaClientes = {cliente2, cliente1, cliente3};
		
		Cajera cajera1 = new Cajera ("Cajera1","","","1");
		Cajera cajera2 = new Cajera ("Cajera2","","","1");
		
		Cajera [] cajeras = {cajera1, cajera2};
		
		//Defino booleano para ver si hay clientes esperando
		boolean hayClientesEsperando = true;
		
		//Mientras haya clientes sigo recorriendo las cajeras
		while (hayClientesEsperando) {
			//Recorro las cajeras 
			for (Cajera cajera : cajeras) {
				if (hayClientesEsperando) {
					System.out.println("La cajera " + cajera.getNombre() + " esta mirando si hay clientes");
		
					for (int i = 0; i < colaClientes.length; i++) {
						if (colaClientes[i]!=null) {
							Cliente clienteFila = colaClientes[i];
							System.out.println("La cajera " + cajera.getNombre() + " esta cobrando al cliente " 
							+ clienteFila.getNombre());
							double importe = cajera.pasarCarrito(clienteFila);
							clienteFila.pagar(importe);
							colaClientes[i]=null;
							
							//Si es el último cliente, no habrá más clientes esperando
							if (i== colaClientes.length-1) {
								hayClientesEsperando = false;
							}
							
							//Hago el break para que no siga mirando más clientes y pase a la siguiente cajera
							break;
						}
					}
				}else {
					System.out.println("Ya no hay clientes esperando");
				}
			}
		
		}
		
	}
}

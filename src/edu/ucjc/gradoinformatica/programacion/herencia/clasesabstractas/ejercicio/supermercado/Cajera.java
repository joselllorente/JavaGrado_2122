package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.supermercado;

public class Cajera extends Persona {
	private String id;

	public Cajera(String nombre, String apellidos, String direccion, String id) {
		super(nombre, apellidos, direccion);
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	public double pasarCarrito (Cliente cliente) {
		double importe = 0;
		Producto [] carrito = cliente.getCarrito();
		//Recorro todos los productos
		for (Producto producto : carrito) {
			double importeProducto = producto.getPrecio();
			
			if(cliente.isClienteAsiduo() && producto instanceof ProductoElectronico) {
				importe += importeProducto - (importeProducto*0.1);
			}else {
				importe += importeProducto;
			}	
		}
		
		return importe;
	}
}

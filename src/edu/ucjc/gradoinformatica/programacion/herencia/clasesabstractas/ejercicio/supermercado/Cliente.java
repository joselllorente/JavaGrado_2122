package edu.ucjc.gradoinformatica.programacion.herencia.clasesabstractas.ejercicio.supermercado;

public class Cliente extends Persona {
	private boolean clienteAsiduo;
	private Producto[] carrito;

	public Cliente(String nombre, String apellidos, String direccion, boolean clienteAsiduo) {
		super(nombre, apellidos, direccion);
		this.clienteAsiduo = clienteAsiduo;
	}

	
	public boolean isClienteAsiduo() {
		return clienteAsiduo;
	}
	public void setClienteAsiduo(boolean clienteAsiduo) {
		this.clienteAsiduo = clienteAsiduo;
	}

	public Producto[] getCarrito() {
		return carrito;
	}

	public void setCarrito(Producto[] carrito) {
		this.carrito = carrito;
	}
	
	public void cogerCarrito() {
		carrito = new Producto[6];
	}
	
	//Método para añadir productos al carrito del cliente
	public void aniadirProductoCarrito(Producto producto) {
		System.out.println("Cliente " + getNombre() + " añadiendo " + producto.getNombre() );
		for (int i = 0; i < carrito.length; i++) {
			if (carrito[i]==null) {
				carrito[i]= producto;
			}
		}
	}
	
	public void pagar (double importe) {
		System.out.println("El cliente "+ getNombre() +" esta pagando " + importe);
	}
	
}

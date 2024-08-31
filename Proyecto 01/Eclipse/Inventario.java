package Proyecto;

import java.util.HashMap;

public class Inventario {
	 private HashMap<String, Integer> productosTerminados;
	    private HashMap<String, Integer> productosEnFabricacion;

	    public Inventario() {
	        this.productosTerminados = new HashMap<>();
	        this.productosEnFabricacion = new HashMap<>();
	    }

	    public void agregarProductoTerminado(String producto, int cantidad) {
	        productosTerminados.put(producto, productosTerminados.getOrDefault(producto, 0) + cantidad);
	    }

	    public void agregarProductoEnFabricacion(String producto, int cantidad) {
	        productosEnFabricacion.put(producto, productosEnFabricacion.getOrDefault(producto, 0) + cantidad);
	    }

	    public void mostrarInventario() {
	        System.out.println("Productos Terminados:");
	        productosTerminados.forEach((producto, cantidad) -> System.out.println("- " + producto + ": " + cantidad));
	        System.out.println("Productos en Fabricación:");
	        productosEnFabricacion.forEach((producto, cantidad) -> System.out.println("- " + producto + ": " + cantidad));
	    }
	}


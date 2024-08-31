package Proyecto;

public class Factura {
	 private static int contadorFacturas = 1;
	    private int idFactura;
	    private String fecha;
	    private double total;
	    private Pedido pedido;

	    public Factura(Pedido pedido) {
	        this.idFactura = contadorFacturas++;
	        this.fecha = pedido.getFecha();
	        this.pedido = pedido;
	        this.total = calcularTotal();
	    }

	    private double calcularTotal() {
	        double total = 0.0;
	        for (Producto p : pedido.getProductos()) {
	            total += p.getCantidad() * 10.0; // Ejemplo: costo base por producto
	            for (Modificacion m : p.getModificaciones()) {
	                total += m.getCosto();
	            }
	        }
	        return total;
	    }

	    public void mostrarFactura() {
	        System.out.println("Factura ID: " + idFactura + ", Fecha: " + fecha + ", Total: " + total);
	    }
	}
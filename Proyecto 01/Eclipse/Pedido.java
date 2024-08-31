package Proyecto;

import java.util.ArrayList;

public class Pedido {
	private int idPedido;
    private String fecha;
    private String estado;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private Factura factura;

    public Pedido(int idPedido, String fecha, Cliente cliente) {
        this.idPedido = idPedido;
        this.fecha = fecha;
        this.estado = "En Proceso";
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.factura = null;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void generarFactura() {
        this.factura = new Factura(this);
    }

    public void mostrarDetalle() {
        System.out.println("Pedido ID: " + idPedido + ", Fecha: " + fecha + ", Estado: " + estado);
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.println("- " + p.getNombre() + " (" + p.getTipo() + "), Cantidad: " + p.getCantidad());
        }
        if (factura != null) {
            factura.mostrarFactura();
        }
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
}
package Proyecto;

import java.util.ArrayList;

public class Empresa {
	
	private String nombre;
    private String direccion;
    private String contacto;
    private Inventario inventario;
    private ArrayList<Pedido> pedidos;

    public Empresa(String nombre, String direccion, String contacto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.contacto = contacto;
        this.inventario = new Inventario();
        this.pedidos = new ArrayList<>();
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Pedido agregado para el cliente: " + pedido.getCliente().getNombre());
    }

    public void mostrarPedidos() {
        System.out.println("Pedidos actuales:");
        for (Pedido pedido : pedidos) {
            pedido.mostrarDetalle();
        }
    }

    public Pedido getPedidoPorID(int idPedido) {
        for (Pedido pedido : pedidos) {
            if (pedido.getIdPedido() == idPedido) {
                return pedido;
            }
        }
        return null;
    }

    public Inventario getInventario() {
        return inventario;
    }
}
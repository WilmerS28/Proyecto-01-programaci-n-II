package Proyecto;

import java.util.ArrayList;

public class Producto {
	private String nombre;
    private String tipo;  // Importado o local
    private int cantidad;
    private ArrayList<Modificacion> modificaciones;

    public Producto(String nombre, String tipo, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.modificaciones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void agregarModificacion(Modificacion modificacion) {
        modificaciones.add(modificacion);
    }

    public ArrayList<Modificacion> getModificaciones() {
        return modificaciones;
    }
}

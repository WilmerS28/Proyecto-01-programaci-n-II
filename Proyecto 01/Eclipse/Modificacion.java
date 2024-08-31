package Proyecto;

public class Modificacion {
	 private String descripcion;
	    private double costo;

	    public Modificacion(String descripcion, double costo) {
	        this.descripcion = descripcion;
	        this.costo = costo;
	    }

	    public double getCosto() {
	        return costo;
	    }

	    public String getDescripcion() {
	        return descripcion;
	    }
	}
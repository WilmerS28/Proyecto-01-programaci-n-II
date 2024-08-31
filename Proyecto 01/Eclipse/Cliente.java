package Proyecto;

public class Cliente {
	private String nombre;
    private String contacto;
    private String direccion;

    public Cliente(String nombre, String contacto, String direccion) {
        this.nombre = nombre;
        this.contacto = contacto;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
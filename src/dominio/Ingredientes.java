package dominio;

public class Ingredientes {

	private String nombre;
	private Double precio;
	private Origen origen;

	public Ingredientes(String nombre, Double precio, Origen origen) {
		this.nombre = nombre;
		this.precio = precio;
		this.origen = origen;

	}

	public String getNombre() {
		return this.nombre;
	}

	public Origen getOrigen() {
		return this.origen;
	}

	public Double getPrecio() {
		return this.precio;
	}

	public String toString() {
		return this.nombre;
	}

}

package dominio;

import java.util.Arrays;

public class Ensalada {

	private String nombreDeLaEnsalada;
	private Ingredientes ingredientes[];
	private Integer contadorIngredientes = 0;
	// no lucas basta

	public Ensalada(String nombreDeLaEnsalada) {
		this.nombreDeLaEnsalada = nombreDeLaEnsalada;
		this.ingredientes = new Ingredientes[20];
	}

	public Ingredientes[] getIngredientes() {
		return this.ingredientes;
	}

	public String getNombre() {
		return this.nombreDeLaEnsalada;
	}

	public Boolean agregarIngrediente(Ingredientes nuevo) {
		this.ingredientes[contadorIngredientes++] = nuevo;
		return true;
	}

	public Boolean paraCeliacos() {
		return false;
	}

	public Boolean paraVegetarianos() {
		return false;
	}

	public boolean paraVeggies() { // emoji con ojos estrella
		return false;
	}

	@Override
	public String toString() {
		return "Ensalada [nombreDeLaEnsalada=" + nombreDeLaEnsalada + ", ingredientes=" + Arrays.toString(ingredientes)
				+ ", contadorIngredientes=" + contadorIngredientes + "]";
	}

	public String getNombreDeLaEnsalada() {
		return nombreDeLaEnsalada;
	}

	public void setNombreDeLaEnsalada(String nombreDeLaEnsalada) {
		this.nombreDeLaEnsalada = nombreDeLaEnsalada;
	}

	public Integer getContadorIngredientes() {
		return contadorIngredientes;
	}

	public void setContadorIngredientes(Integer contadorIngredientes) {
		this.contadorIngredientes = contadorIngredientes;
	}

	public void setIngredientes(Ingredientes[] ingredientes) {
		this.ingredientes = ingredientes;
	}

	
}

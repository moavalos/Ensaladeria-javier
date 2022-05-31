package dominio;

import java.util.Arrays;

public class Ensalada {

	private String nombreDeLaEnsalada;
	private Ingredientes ingredientes[];
	private Integer contadorIngredientes = 0;
	// no lucas basta

	public Ensalada(String nombreDeLaEnsalada) {
		this.nombreDeLaEnsalada = nombreDeLaEnsalada;
		this.ingredientes = new Ingredientes[50];
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
		/* devuelve true si ningun ingrediente es de origen TACC. */
		Boolean origenTacc = false;
		for (int i = 0; i < this.ingredientes.length; i++) {
			if (this.ingredientes[i].getOrigen() == Origen.TACC) {
				origenTacc = false;
				return origenTacc;
			} else {
				continue;
			}
		}
		origenTacc = true;
		return origenTacc;
	}

	public Boolean paraVegetarianos() {
		/* devuelve true si ningun ingrediente es de origen ANIMAL. */
		/* muy confuso */
		Boolean apto = false;
		for (int i = 0; i < this.ingredientes.length; i++) {
			if (!(this.ingredientes[i].getOrigen() == Origen.ANIMAL)) {
				apto = true;
				return apto;
			}
		}
		return apto;
	}

	public boolean paraVeggies() { // emoji con ojos estrella
		/* devuelve true si ningun ingrediente es de origen ANIMAL ni LECHE ni HUEVO */
		for (int i = 0; i < this.ingredientes.length; i++) {
			if (this.ingredientes[i].getOrigen() == Origen.ANIMAL && this.ingredientes[i].getOrigen() == Origen.LECHE
					&& this.ingredientes[i].getOrigen() == Origen.HUEVO) {
				return false;
			} else {
				continue;
			}
		}
		return true;
	}

	public String toString() {
		/*
		 * Devuelve un String con el nombre de la ensalada y el detalle de los
		 * ingredientes que la componen
		 */
		String ingredientes = "";
		for (int i = 0; i < this.ingredientes.length; i++) {
			if (this.ingredientes[i] == null) {
				continue;
			}
			ingredientes += this.ingredientes[i].toString() + ",";
		}
		return "Ensalada: " + this.getNombre() + ", Ingredientes: " + ingredientes + ".";
	}

	/*
	 * @Override public String toString() { return "Ensalada [nombreDeLaEnsalada=" +
	 * nombreDeLaEnsalada + ", ingredientes=" + Arrays.toString(ingredientes) +
	 * ", contadorIngredientes=" + contadorIngredientes + "]"; }
	 */

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

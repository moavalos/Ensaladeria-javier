package dominio;

public class Pedido {

	private String nombreDelCliente;
	private Ensalada[] ensaladas;
	private Integer contadorEnsaladas;

	public Pedido(String nombreDelCliente) {
		this.nombreDelCliente = nombreDelCliente;
		this.ensaladas = new Ensalada[100];
	}

	public Boolean agregarNuevaEnsalada(Ensalada nueva) {
		this.ensaladas[this.contadorEnsaladas++] = nueva;
		return true;
	}

	public Double getImporte() {
		/* calcula el importe en funcion del precio de cada ingrediente */
		Double aux = 0.0;
		for (int i = 0; i < this.ensaladas.length; i++) {
			if (this.ensaladas[i] == null) {
				continue;
			}
			for (int j = 0; j < this.ensaladas[i].getIngredientes().length; j++) {
				if (this.ensaladas[i].getIngredientes()[j] == null) {
					continue;
				}
				aux += (this.ensaladas[i].getIngredientes())[j].getPrecio();
			}
		}
		return aux;
	}

}

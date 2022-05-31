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
		return 0.0;
	}


}

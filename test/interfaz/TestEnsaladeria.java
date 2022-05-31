package interfaz;

import java.util.Scanner;

import dominio.Ensalada;
import dominio.Ingredientes;
import dominio.Origen;
import dominio.Pedido;

public class TestEnsaladeria {

	static Scanner teclado = new Scanner(System.in);

	public static void main(String args[]) {

		/*
		 * esto es un proyecto de mierda dedicado a programacion basica 1 y lo querida
		 * que fue esta hecho con 0 conceptos de poo,, unicamente es para marcar
		 * diferencias en 6 meses
		 */
		final Integer CANTIDAD_MAXIMA_DE_INGREDIENTES = 50, CANTIDAD_MAXIMA_DE_ENSALADAS = 10,
				CANTIDAD_MAXIMA_DE_PEDIDOS_POR_DIA = 100;
		Integer contadorIngredientes = 0, contadorEnsaladas = 0, contadorPedidos = 0;

		Ingredientes ingredientesDisponibles[] = new Ingredientes[CANTIDAD_MAXIMA_DE_INGREDIENTES];
		Ensalada ensaladasPreEstablecidas[] = new Ensalada[CANTIDAD_MAXIMA_DE_ENSALADAS];
		Pedido pedidos[] = new Pedido[CANTIDAD_MAXIMA_DE_PEDIDOS_POR_DIA];

		System.out.println("Bienvenido a la Ensaladeria de Javier uwu");
		Integer opcionDeseada;

		do {
			System.out.println("*******************");
			System.out.println("que chota queres hacer:\n");
			System.out.println(
					"1) Incorporar un nuevo ingrediente.\n2) Crear una nueva ensalada.\n3) Crear un nuevo pedido.\n4) Salir");
			opcionDeseada = teclado.nextInt();

			switch (opcionDeseada) {
			case 1:
				incorporarNuevoIngrediente(ingredientesDisponibles, contadorIngredientes);
				contadorIngredientes++;
				break;
			case 2:
				crearUnNuevaEnsalada(ensaladasPreEstablecidas, contadorEnsaladas, ingredientesDisponibles);
				contadorEnsaladas++;
				break;
			case 3:
				crearUnNuevoPedido(pedidos, contadorPedidos, ensaladasPreEstablecidas, ingredientesDisponibles);
				contadorPedidos++;
				break;
			}
		} while (opcionDeseada != 4);
	}

	private static void crearUnNuevoPedido(Pedido[] pedidos, Integer contadorPedidos,
			Ensalada[] ensaladasPreEstablecidas, Ingredientes[] ingredientesDisponibles) {

		System.out.println("Ingrese el nombre del cliente");
		String nombre = teclado.next();

		pedidos[contadorPedidos] = new Pedido(nombre);

		System.out.println("Elija una ensalada");
		for (int i = 0; i < ensaladasPreEstablecidas.length; i++) {
			if (ensaladasPreEstablecidas[i] == null) {
				continue;
			}
			System.out.println(i + ") " + ensaladasPreEstablecidas[i]);
		}

		Integer EnsaladaElegida = teclado.nextInt();
		pedidos[contadorPedidos].agregarNuevaEnsalada(ensaladasPreEstablecidas[EnsaladaElegida]);

		String listadoIngredientes = "";
		for (int i = 0; i < ingredientesDisponibles.length; i++) {
			if (ingredientesDisponibles[i] == null) {
				continue;
			}
			listadoIngredientes += i + ")" + ingredientesDisponibles[i].toString() + " ";
		}
		System.out.println(listadoIngredientes);
		Integer ingredienteElegido = 0;

		while (ingredienteElegido != 99) {
			System.out.println("Agregue ingredientes, ingrese 99 para finalizar");
			ingredienteElegido = teclado.nextInt();
			if (ingredienteElegido == 99) {
				System.out.println("Nombre del cliente: "
						+ nombre + " " + pedidos[contadorPedidos]
								.buscarEnsalada(ensaladasPreEstablecidas[EnsaladaElegida].getNombre()).toString()
						+ "\nImporte a pagar: $" + pedidos[contadorPedidos].getImporte());
				break;
			}

			pedidos[contadorPedidos].buscarEnsalada(ensaladasPreEstablecidas[EnsaladaElegida].getNombre())
					.agregarIngrediente(ingredientesDisponibles[ingredienteElegido]);
		}

	}

	private static void crearUnNuevaEnsalada(Ensalada[] ensaladasPreEstablecidas, Integer contadorEnsaladas,
			Ingredientes[] ingredientesDisponibles) {
		String listadoIngredientes = "";
		System.out.println("ingrese el nombre de la nueva ensalada");
		String nombre = teclado.next();

		ensaladasPreEstablecidas[contadorEnsaladas] = new Ensalada(nombre);

		for (int i = 0; i < ingredientesDisponibles.length; i++) {
			if (ingredientesDisponibles[i] == null) {
				continue;
			}
			listadoIngredientes += i + ")" + ingredientesDisponibles[i].toString() + " ";
		}

		System.out.println(listadoIngredientes);
		Integer opc = 0;
		while (opc != 99) {
			System.out.println("Seleccione un ingrediente, para finalizar ingrese 99");
			opc = teclado.nextInt();
			if (opc == 99) {
				break;
			}
			ensaladasPreEstablecidas[contadorEnsaladas].agregarIngrediente(ingredientesDisponibles[opc]);

		}
		System.out.println(ensaladasPreEstablecidas[contadorEnsaladas].toString());

	}

	private static void incorporarNuevoIngrediente(Ingredientes[] ingredientesDisponibles,
			Integer contadorIngredientes) {
		System.out.println("Ingrese el nombre del ingrediente");
		String nombre = teclado.next();

		System.out.println("Ingrese el precio del ingrediente");
		Double precio = teclado.nextDouble();

		System.out.println("Ingrese el origen del ingrediente");
		System.out.println("1) Animal\n2) Vegetal\n3) TACC\n4) Leche\n5) Huevo");
		Origen origen = null;

		switch (teclado.nextInt()) {
		case 1:
			origen = Origen.ANIMAL;
			break;
		case 2:
			origen = Origen.VEGETAL;
			break;
		case 3:
			origen = Origen.TACC;
			break;
		case 4:
			origen = Origen.LECHE;
			break;
		case 5:
			origen = Origen.HUEVO;
			break;
		default:
			System.out.println("opcion de origen incorrecta");
			break;
		}
		ingredientesDisponibles[contadorIngredientes] = new Ingredientes(nombre, precio, origen);

		for (int i = 0; i < ingredientesDisponibles.length; i++) {
			if (ingredientesDisponibles[i] == null) {
				continue;
			}
			System.out.println(ingredientesDisponibles[i].toString());
		}

	}

}

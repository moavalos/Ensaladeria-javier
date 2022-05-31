package interfaz;

import java.util.Scanner;

import dominio.Ensalada;
import dominio.Ingredientes;
import dominio.Pedido;

public class TestEnsaladeria {

	public static void main(String args[]) {

		/*
		 * esto es un proyecto de mierda dedicado a programacion basica 1 y lo querida
		 * que fue esta hecho con 0 conceptos de poo,, unicamente es para marcar
		 * diferencias en 6 meses
		 */

		Scanner teclado = new Scanner(System.in);
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
			System.out.println("1) Incorporar un nuevo ingrediente.\n2) Crear una nueva ensalada.\n3) Crear un nuevo pedido.\n4) Salir");
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
				crearUnNuevoPedido(pedidos, contadorPedidos, ensaladasPreEstablecidas,
						ingredientesDisponibles);
				contadorPedidos++;
				break;
			}
		} while (opcionDeseada != 4);
	}

	private static void crearUnNuevoPedido(Pedido[] pedidos, Integer contadorPedidos,
			Ensalada[] ensaladasPreEstablecidas, Ingredientes[] ingredientesDisponibles) {
		// TODO Auto-generated method stub
		
	}

	private static void crearUnNuevaEnsalada(Ensalada[] ensaladasPreEstablecidas, Integer contadorEnsaladas,
			Ingredientes[] ingredientesDisponibles) {
		// TODO Auto-generated method stub
		
	}

	private static void incorporarNuevoIngrediente(Ingredientes[] ingredientesDisponibles,
			Integer contadorIngredientes) {
		// TODO Auto-generated method stub
		
	}

}

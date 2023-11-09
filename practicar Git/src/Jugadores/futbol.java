package Jugadores;

import java.util.Scanner;

public class futbol {

	static String apellidos;
	static String Nombres;
	static int nro_camisetas;
	static String[] posiciones = new String[3];
	static boolean continuar = true;

	public static void ingresarDatos(String[] nombresJugadores, String[] apellidosJugadores, int[] numeroCamisetas) {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {

			System.out.print("Ingrese el nombre: ");
			nombresJugadores[i] = entrada.next();
			System.out.println();
			System.out.print("Ingrese el apellido: ");
			apellidosJugadores[i] = entrada.next();
			System.out.println();
			System.out.print("Ingrese el numero de camiseta: ");
			numeroCamisetas[i] = entrada.nextInt();
			System.out.println();
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("Jugador " + (i + 1));

			System.out.println("Nombre: " + nombresJugadores[i]);

			System.out.println("Apellido: " + apellidosJugadores[i]);

			System.out.println("Número de camiseta: " + numeroCamisetas[i]);
			System.out.println();

		}

	}

	public static void agregarJugadorSuplente(String[] nombresJugadores, String[] apellidosJugadores,
			int[] numeroCamisetas) {

		Scanner entrada = new Scanner(System.in);

		boolean respuestaIncorrecta = true;

		while (respuestaIncorrecta) {

			{

				System.out.print("¿Desea agregar un jugador suplente? (si/no): ");
				String respuestaAgregar = entrada.next().toLowerCase();

				if (respuestaAgregar.equals("si")) {
					System.out.print("Ingrese el nombre del jugador suplente: ");
					 nombresJugadores[3] = entrada.next();

					System.out.print("Ingrese el apellido del jugador suplente: ");
					apellidosJugadores[3] = entrada.next();

					System.out.print("Ingrese el número de camiseta del jugador suplente: ");
					numeroCamisetas[3] = entrada.nextInt();

					System.out.println("el nombre " + Nombres + " el apellido " + apellidos
							+ " y el nro de la camiseta es : " + nro_camisetas);
					respuestaIncorrecta = false;
				} else if (respuestaAgregar.equals("no")) {
					continuar = false;
					respuestaIncorrecta = false;
				} else {
					System.out.println("Respuesta no válida. Por favor, responda 'si' o 'no'.");

					// Sal del bucle para agregar un jugador
				}
			}
		}
	}

	public static void analizarDatosTresJugadores(String[] nombresJugadores, String[] apellidosJugadores,
			int[] numeroCamisetas) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Datos ingresados:");

		for (int i = 0; i < 3; i++) {
			System.out.println("Jugador " + (i + 1));
			System.out.println("Nombre: " + nombresJugadores[i]);
			System.out.println("Apellido: " + apellidosJugadores[i]);
			System.out.println("Número de camiseta: " + numeroCamisetas[i]);
			System.out.println("");
			
		}

		System.out.print("¿Los datos son correctos? (si/no): ");
		String respuestaCorrectos = entrada.next().toLowerCase();

		if (respuestaCorrectos.equals("no")) {
			System.out.print("Ingrese el número de camiseta del jugador que desea modificar: ");
			int numeroModificar = entrada.nextInt();

			for (int i = 0; i < 3; i++) {
				if (numeroCamisetas[i] == numeroModificar) {
					System.out.print("Ingrese el nuevo nombre: ");
					nombresJugadores[i] = entrada.next();
					System.out.println();
					System.out.print("Ingrese el nuevo apellido: ");
					apellidosJugadores[i] = entrada.next();
					System.out.println();
					System.out.print("Ingrese el nuevo número de camiseta: ");
					numeroCamisetas[i] = entrada.nextInt();
					System.out.println("Datos modificados correctamente.");
				}
			}

			System.out.println("Datos ingresados después de la modificación:");

			for (int i = 0; i < 3; i++) {
				System.out.println("Jugador " + (i + 1));
				System.out.println("Nombre: " + nombresJugadores[i]);
				System.out.println("Apellido: " + apellidosJugadores[i]);
				System.out.println("Número de camiseta: " + numeroCamisetas[i]);
				System.out.println();
			}
		}
	}

	public static void analizarDatosCuatroJugadores(String[] nombresJugadores, String[] apellidosJugadores,
			int[] numeroCamisetas) {
		Scanner entrada = new Scanner(System.in);

		System.out.println("Datos ingresados:");

		for (int i = 0; i < 4; i++) {
			System.out.println("Jugador " + (i + 1));
			System.out.println("Nombre: " + nombresJugadores[i]);
			System.out.println("Apellido: " + apellidosJugadores[i]);
			System.out.println("Número de camiseta: " + numeroCamisetas[i]);
			System.out.println();
		}

		System.out.print("¿Los datos son correctos? (si/no): ");
		String respuestaCorrectos = entrada.next().toLowerCase();

		if (respuestaCorrectos.equals("no")) {
			System.out.print("Ingrese el número de camiseta del jugador que desea modificar: ");
			int numeroModificar = entrada.nextInt();

			for (int i = 0; i < 4; i++) {
				if (numeroCamisetas[i] == numeroModificar) {
					System.out.print("Ingrese el nuevo nombre: ");
					nombresJugadores[i] = entrada.next();
					System.out.println();
					System.out.print("Ingrese el nuevo apellido: ");
					apellidosJugadores[i] = entrada.next();
					System.out.println();
					System.out.print("Ingrese el nuevo número de camiseta: ");
					numeroCamisetas[i] = entrada.nextInt();
					System.out.println("Datos modificados correctamente.");
				}
			}

			System.out.println("Datos ingresados después de la modificación:");

			for (int i = 0; i < 4; i++) {
				System.out.println("Jugador " + (i + 1));
				System.out.println("Nombre: " + nombresJugadores[i]);
				System.out.println("Apellido: " + apellidosJugadores[i]);
				System.out.println("Número de camiseta: " + numeroCamisetas[i]);
				System.out.println();
			}
		}
	}

	public static void main(String[] args) {
		String[] nombresJugadores = new String[4];
		String[] apellidosJugadores = new String[4];
		int[] numeroCamisetas = new int[4];

		ingresarDatos(nombresJugadores, apellidosJugadores, numeroCamisetas);
		analizarDatosTresJugadores(nombresJugadores, apellidosJugadores, numeroCamisetas);
		agregarJugadorSuplente(nombresJugadores, apellidosJugadores, numeroCamisetas);
		analizarDatosCuatroJugadores(nombresJugadores, apellidosJugadores, numeroCamisetas);
	}
}
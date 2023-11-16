package desafio5;

import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;
public class desafio5 {
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
				System.out.println("Nombre: " + nombresJugadores[3]);
				System.out.println("Apellido: " + apellidosJugadores[3]);
				System.out.println("Número de camiseta: " + numeroCamisetas[3]);
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
		
		
		 try {

	         // Especificar la ruta del archivo en la que se guardaran los datos
	    	 // NO olvidarse de escribir el nombre del archivo, y luego .txt
	    	 // En este caso, si mi_archivo.txt no lo agregamos a la ruta, 
	    	 // Java NO va a identificar ningún archivo .txt
	         String ruta = "C:\\Users\\Alumno\\Documents\\evaluacion.txt";

	         // Crear un objeto "file" que representa el archivo en la ruta especificada
	         File file = new File(ruta);

	         // Verificar si el archivo no existe, y si es asi, crearlo
	         if (!file.exists()) {
	             file.createNewFile();
	         }

	         // Crear un objeto "fw" de tipo FileWriter para escribir en el archivo
	         // Este objeto nos permite llenar el archivo de información. 
	         FileWriter fw = new FileWriter(file);

	         // Crear un objeto "bw" de tipo BufferedWriter para escribir en el archivo de
	         // manera eficiente. Esto es como que "limpia" el archivo para ser escrito
	         // con los datos que se cargaron en los arrays "nombre" y "apellido".
	         BufferedWriter bw = new BufferedWriter(fw);

	         // Iniciar un ciclo "for" que se ejecutara 3 veces
	         for (int i = 0; i < 3; i++) {
	             // Escribir en el archivo una linea que contiene el nombre y el apellido
	             bw.write("Nombre: " + nombresJugadores[i] + ", Apellido: " + apellidosJugadores[i]);

	             // Agregar una nueva linea (un salto de linea) despues de cada entrada
	             bw.newLine();
	         }

	         // Cerrar el BufferedWriter para finalizar la escritura en el archivo
	         // Si no se cierra el bufer, no se genera el archivo.
	         bw.close();

	         // Mostrar un mensaje en la consola para indicar que el archivo se creo con
	         // exito
	         System.out.println("Archivo creado con éxito.");
	     } catch (Exception e) {
	         // En caso de un error, mostrar informacion detallada sobre el error en la
	         // consola
	    	 // Aca en vez de "e.printStackTrace" se podría poner un "syso" 
	    	 // que indique "Error al escribir el archivo". 
	         e.printStackTrace();
	     }
		
		
		
	}
}



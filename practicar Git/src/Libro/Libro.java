package Libro;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Se debe generar un programa que almacene la información de varios libros. El programa debe ser eficiente, es decir, se deben incluir los temas vistos en el año. 
Crear una clase llamada Libro que contenga los siguientes atributos:
Título del libro
Autor del libro
Número de páginas

Crear arreglos para almacenar los datos de los libros. Esta lista representará la colección de libros en la biblioteca.
 El programa debe mostrar un menú con las siguientes opciones:
Mostrar lista de libros: El programa debe mostrar la lista de libros registrados en la biblioteca, 
incluyendo el título, autor y número de páginas de cada libro.
Buscar un libro por título: El usuario debe ingresar el título del libro y el programa debe buscar y
 mostrar los libros que coincidan con el título.
CONSEJO PARA BUSCAR LIBRO:
Usar nextLine() para buscar una frase completa. Ejemplo:
// String[] titulosLibros = { "Harry Potter", "Ariel Chavez" };
// entrada.nextLine(); -> Limpiar el bufer de la memoria.
// String busqueda = entrada.nextLine(); -> Almacenamos TODA la frase.
// "Harry Potter"
Salir: Terminar el programa.
El programa debe ser capaz de manejar excepciones, como entradas no válidas o valores negativos para el número de páginas.
Asegúrate de que el programa permita al usuario realizar varias operaciones antes de salir.
 */

public class Libro {

	static String[] nombres_autor = { "Messi", "Maradona", "Aymar", "Gallardo" };
	static String[] titulos_libro = { "El chanchito", "La Casa De Tu Abuela 4", "Codigo Da Vinci", "El Principito" };
	static int[] numero_paginas = { 23, 280, 489, 208 };
	static String busqueda;
	static boolean encontrar = false;
	static int opc = 0;
	static boolean continuar = true;

	public static void saludar() {

		System.out.println("Hola, quiero ver las opciones que hayan");

	}

	public static void ingresarOpciones() {
		Scanner entrada = new Scanner(System.in);

		while (continuar) {
			try {

				System.out.print("Ingrese la opción que desea ver: ");
				System.out.println("\n1. Título del libro.");
				System.out.println("2. Autor del libro.");
				System.out.println("3. Salir");
				opc = entrada.nextInt();

				switch (opc) {
				case 1:

					entrada.nextLine();
					System.out.println("Ingrese el titulo del libro y le diremos cantidad de paginas de esta");
					busqueda = entrada.nextLine();

					for (int i = 0; i < titulos_libro.length; i++) {

						if (titulos_libro[i].toLowerCase().contains(busqueda.toLowerCase())) {
							System.out.println("La cantidad de paginas de el titulo  " + titulos_libro[i] + " es de: "
									+ numero_paginas[i]);
							encontrar = true;
							break;
						}
						continuar = false;
					}

					if (!encontrar) {
						System.out.println("No se encontró ningún libro escrito por ese autor.");
					}
					break;

				case 2:
					entrada.nextLine();
					System.out.print("Ingrese el nombre del autor y va aparecer con su respectivo libro: ");
					busqueda = entrada.nextLine();

					for (int i = 0; i < nombres_autor.length; i++) {
						if (nombres_autor[i].toLowerCase().contains(busqueda.toLowerCase())) {
							System.out.println("Libro escrito por " + nombres_autor[i] + ": " + titulos_libro[i]);
							encontrar = true;
							break; // Termina el bucle cuando se encuentra el libro del autor
						}
					}
					if (!encontrar) {
						System.out.println("No se encontró ningún libro escrito por ese autor.");
					}
					continuar = false;
					break;

				case 3:
					System.out.println("Saliendo del programa. ¡Hasta luego!");
					continuar = false;
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("Error: Debe ingresar un número de opción válido.");
				entrada.nextLine();

				System.out.print("¿Desea volver a ingresar una opción del menú? (S/N): ");
				String respuesta = entrada.next();
				if (!respuesta.equalsIgnoreCase("S")) {
					continuar = false;

				}
			}
		}
	}

	public static void main(String[] args) {
		saludar();
		ingresarOpciones();

	}

}

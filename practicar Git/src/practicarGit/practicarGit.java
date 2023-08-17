package practicarGit;

import java.util.Scanner;

public class practicarGit {

	static String nombre, nombre_min;
	static String apellido, apellido_may;

	public static void IngDeDatos() { 
		Scanner entrada = new Scanner(System.in);
		System.out.println("ingrese el nombre: ");
		nombre = entrada.next();
		System.out.println("ingrese el apellido: ");
		apellido = entrada.next();
	}

	public static void palabras() {

		String nombre_min = nombre.toLowerCase(); //cualquier letra en mayuscula la pasara a minuscula
		
		String apellido_mayu = apellido.toUpperCase(); //y este pasara cualquier letra que este en minuscula la pasara a mayuscula 
		
		System.out.println(nombre_min + "\n" + apellido_mayu);//y aca mostrara el resultado de los codigos anterior o sea mostrara
		// el nombre en minuscula y el apellido en mayuscula

	}

	public static void main(String[] args) {

		IngDeDatos();
		palabras();

	}
}

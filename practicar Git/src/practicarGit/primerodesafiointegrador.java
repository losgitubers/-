package practicarGit;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Generar un número random entre 1 y 100. Utilizá el método random.nextInt(). -
 * 
 * Investigá por cuenta cómo se utiliza correctamente este número. -
 * 	
 * Almacená ese número en alguna variable entera llamada "numeroSecreto". -
 * 
Solicitá a un usuario que ingrese un número entre 1 y 100. -

Almacená el número ingresado en una variable correspondiente. -

Contá la cantidad de intentos. Para ello, vas a necesitar una variable que almacene el número de intentos, y que comience en 0.-

Si el número ingresado por el usuario es menor al número secreto, indicar al usuario "el número que ingresaste es menor". 

Si no, si es mayor al número secreto, indicar al usuario "el número ingresado es mayor".

Si no, si el número es igual al número secreto, indicarle que ganó, e indicarle su cantidad de intentos.

Tené en cuenta que la persona debería intentar algunas veces el poder descubrir este número. 

Es decir, todo lo generado anteriormente a partir del ingreso del número por parte del usuario, 

debe repetirse mientras no se haya encontrado el número secreto, o mientras se hayan alcanzado los 10 intentos.

Para evitar errores, hay que encerrar el ingreso de datos del usuario en un bloque try-catch. 

Capturar excepción si ingresa un número menor a 1, o mayor a 100. Además, capturar excepción 
si se ingresa un elemento que no sea un número.
 */

public class primerodesafiointegrador {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Ingrese un numero del 1 al 100:");

		int numerosecreto = (int) (Math.random() * 100) + 1;
		int contador = 0;

		try {

			while (true) {

				int Numero = entrada.nextInt();
6
				contador++;

				if (Numero < 1 || Numero > 100) {
					System.out.println("Por favor, ingresa un número entre 1 y 100.");
					entrada.nextLine();
				}

				if (Numero == numerosecreto) {
					System.out.println("¡GANASTE! El número era: " + numerosecreto);
					System.out.println("LOS INTENTOS FUERON DE: " + contador);
					break;

				} else if (Numero > numerosecreto) {
					System.out.println("El número secreto es menor al número ingresado");

				} else {
					System.out.println("El número secreto es mayor al número ingresado");
				}
			}

		} catch (InputMismatchException e) {
			System.out.println("Por favor, ingresa un número válido.");

		} finally {
			System.out.println("Programa finalizado.");
		}

	}

}

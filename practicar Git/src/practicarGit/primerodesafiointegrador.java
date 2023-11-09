package practicarGit;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Generar un n�mero random entre 1 y 100. Utiliz� el m�todo random.nextInt(). -
 * 
 * Investig� por cuenta c�mo se utiliza correctamente este n�mero. -
 * 	
 * Almacen� ese n�mero en alguna variable entera llamada "numeroSecreto". -
 * 
Solicit� a un usuario que ingrese un n�mero entre 1 y 100. -

Almacen� el n�mero ingresado en una variable correspondiente. -

Cont� la cantidad de intentos. Para ello, vas a necesitar una variable que almacene el n�mero de intentos, y que comience en 0.-

Si el n�mero ingresado por el usuario es menor al n�mero secreto, indicar al usuario "el n�mero que ingresaste es menor". 

Si no, si es mayor al n�mero secreto, indicar al usuario "el n�mero ingresado es mayor".

Si no, si el n�mero es igual al n�mero secreto, indicarle que gan�, e indicarle su cantidad de intentos.

Ten� en cuenta que la persona deber�a intentar algunas veces el poder descubrir este n�mero. 

Es decir, todo lo generado anteriormente a partir del ingreso del n�mero por parte del usuario, 

debe repetirse mientras no se haya encontrado el n�mero secreto, o mientras se hayan alcanzado los 10 intentos.

Para evitar errores, hay que encerrar el ingreso de datos del usuario en un bloque try-catch. 

Capturar excepci�n si ingresa un n�mero menor a 1, o mayor a 100. Adem�s, capturar excepci�n 
si se ingresa un elemento que no sea un n�mero.
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
					System.out.println("Por favor, ingresa un n�mero entre 1 y 100.");
					entrada.nextLine();
				}

				if (Numero == numerosecreto) {
					System.out.println("�GANASTE! El n�mero era: " + numerosecreto);
					System.out.println("LOS INTENTOS FUERON DE: " + contador);
					break;

				} else if (Numero > numerosecreto) {
					System.out.println("El n�mero secreto es menor al n�mero ingresado");

				} else {
					System.out.println("El n�mero secreto es mayor al n�mero ingresado");
				}
			}

		} catch (InputMismatchException e) {
			System.out.println("Por favor, ingresa un n�mero v�lido.");

		} finally {
			System.out.println("Programa finalizado.");
		}

	}

}

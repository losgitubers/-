package evaluacion_integradora_anual;

import java.util.InputMismatchException;
import java.util.Scanner;

public class prueba {

	static float n1, n2;
	static char opc;
	static boolean quiero_salir = false;
	static float potencia;
	static float raiz;

	public static void saludar() {
		System.out.println("Hola. Quiero usar la calculadora");
	}

	public static void ingresarNumeros() {
		Scanner entrada = new Scanner(System.in);

		while (true) {
			try {
				System.out.println("Ingresa un primer número: ");
				n1 = entrada.nextFloat();
				System.out.println("Ingresa un segundo número: ");
				n2 = entrada.nextFloat();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error: Ingresa números válidos.");
				entrada.nextLine();
			}
		}
	}

	public static void Potencia() {
		Scanner entrada = new Scanner(System.in);
		while (true) {
			try {
				System.out.println("De que numero queres saber la potencia: ");
				potencia = entrada.nextFloat();
				break;
			} catch (InputMismatchException e) {
				System.out.println("Error: Ingresa números válidos.");
				entrada.nextLine();
			}
		}

	}

	public static void Raiz() {
		Scanner entrada = new Scanner(System.in);

		System.out.println("De que numero queres saber la raiz:  ");
		raiz = entrada.nextFloat();

	}

	public static float sumar(float a, float b) {
		return a + b;
	}

	public static float restar(float a, float b) {
		return a - b;
	}

	public static float multiplicacion(float a, float b) {
		return a * b;
	}

	public static float division(float a, float b) {
		return a / b;
	}

	public static float potencia(float a) {
		return a * a;
	}

	public static float raiz(float a, float b) {
		return (float) Math.pow(a, 0.5);

	}

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		saludar();

		while (!quiero_salir) {
			System.out.println("1. Sumar.");
			System.out.println("2. Restar.");
			System.out.println("3. Multiplicación.");
			System.out.println("4. División.");
			System.out.println("5. Potencia.");
			System.out.println("6. Raiz.");
			System.out.println("7. Salir");

			opc = entrada.next().charAt(0);

			switch (opc) {
			case '1':
				ingresarNumeros();
				float resultadoSuma = sumar(n1, n2);
				System.out.println("El resultado de la suma es: " + resultadoSuma);
				break;
			case '2':
				ingresarNumeros();
				float resultadoResta = restar(n1, n2);
				System.out.println("El resultado de la resta es: " + resultadoResta);
				break;
			case '3':
				ingresarNumeros();
				float resultadoMultiplicacion = multiplicacion(n1, n2);
				System.out.println("El resultado de la multiplicación es: " + resultadoMultiplicacion);
				break;
			case '4':
				ingresarNumeros();
				if (n2 != 0) {
					float resultado = division(n1, n2);
					System.out.println("El resultado de la división es: " + resultado);
				} else {
					System.out.println("Error: No es posible dividir por cero. Intentelo de nuevo");
				}
				break;

			case '5':
				Potencia();
				float resultadoPotencia = potencia(potencia);
				System.out.println("El resultado de la potencia es: " + resultadoPotencia);
				break;
			case '6':
				Raiz();
				if (raiz > 0) {
	           
				float ResultadoRaiz = raiz(raiz, (float) 0.5);
				System.out.println("El resultado de la raiz es: " + ResultadoRaiz);
				break;
			} else {
				System.out.println("Error: No es posible sacar la raiz de un numero negativo. Intentelo de nuevo");
				break;
			}
			case '7':
				quiero_salir = true;
				System.out.println("Programa finalizado, Hasta luego");
				break;
			default:
				System.out.println("Opción no válida.");
			}

			if (!quiero_salir) {
				System.out.println("¿Desea realizar otra operación? (sí/no)");
				String respuesta = entrada.next();
				if (respuesta.equalsIgnoreCase("no")) {
					quiero_salir = true;
				}
			}
		}
	}

}

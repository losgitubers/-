package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Se debe crear un programa que simule las operaciones matemáticas de una calculadora, pero esta vez, se debe realizar un programa eficiente, con los temas vistos en el año. 
El programa debe mostrar un menú con las siguientes opciones:
Suma
Resta
Multiplicación
División
El usuario seleccionará una de las opciones del menú. Luego:
El programa debe solicitar al usuario que ingrese dos números para realizar la operación matemática seleccionada.
El programa debe realizar la operación correspondiente (suma, resta, multiplicación o división) y mostrar el resultado al usuario.
Cada una de las opciones anteriores, debe estar dentro de una función. 
Si el usuario selecciona la opción de división, deben manejar la excepción de división por cero, en caso de que el denominador sea igual a 0.
Después de mostrar el resultado, el programa debe preguntar al usuario si desea realizar otra operación. Si la respuesta es "sí", debe volver al menú principal. Si la respuesta es "no", el programa debe finalizar.
El programa debe ser capaz de manejar excepciones, como entradas no válidas (por ejemplo, letras en lugar de números) y otras situaciones que puedan causar errores.
 */

public class calculadora {

    static float n1, n2;
    static char opc;
    static boolean quiero_salir = false;

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

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        saludar();

        while (!quiero_salir) {
            System.out.println("1. Sumar.");
            System.out.println("2. Restar.");
            System.out.println("3. Multiplicación.");
            System.out.println("4. División.");
            System.out.println("5. Salir");

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
                    quiero_salir = true;
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
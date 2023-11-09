package calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 Se debe crear un programa que simule las operaciones matem�ticas de una calculadora, pero esta vez, se debe realizar un programa eficiente, con los temas vistos en el a�o. 
El programa debe mostrar un men� con las siguientes opciones:
Suma
Resta
Multiplicaci�n
Divisi�n
El usuario seleccionar� una de las opciones del men�. Luego:
El programa debe solicitar al usuario que ingrese dos n�meros para realizar la operaci�n matem�tica seleccionada.
El programa debe realizar la operaci�n correspondiente (suma, resta, multiplicaci�n o divisi�n) y mostrar el resultado al usuario.
Cada una de las opciones anteriores, debe estar dentro de una funci�n. 
Si el usuario selecciona la opci�n de divisi�n, deben manejar la excepci�n de divisi�n por cero, en caso de que el denominador sea igual a 0.
Despu�s de mostrar el resultado, el programa debe preguntar al usuario si desea realizar otra operaci�n. Si la respuesta es "s�", debe volver al men� principal. Si la respuesta es "no", el programa debe finalizar.
El programa debe ser capaz de manejar excepciones, como entradas no v�lidas (por ejemplo, letras en lugar de n�meros) y otras situaciones que puedan causar errores.
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
                System.out.println("Ingresa un primer n�mero: ");
                n1 = entrada.nextFloat();
                System.out.println("Ingresa un segundo n�mero: ");
                n2 = entrada.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingresa n�meros v�lidos.");
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
            System.out.println("3. Multiplicaci�n.");
            System.out.println("4. Divisi�n.");
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
                    System.out.println("El resultado de la multiplicaci�n es: " + resultadoMultiplicacion);
                    break;
                case '4':
                    ingresarNumeros();
                    if (n2 != 0) {
                        float resultado = division(n1, n2);
                        System.out.println("El resultado de la divisi�n es: " + resultado);
                    } else {
                        System.out.println("Error: No es posible dividir por cero. Intentelo de nuevo");
                    }
                    break;
                case '5':
                    quiero_salir = true;
                    break;
                default:
                    System.out.println("Opci�n no v�lida.");
            }

            if (!quiero_salir) {
                System.out.println("�Desea realizar otra operaci�n? (s�/no)");
                String respuesta = entrada.next();
                if (respuesta.equalsIgnoreCase("no")) {
                    quiero_salir = true;
                }
            }
        }
    }
}
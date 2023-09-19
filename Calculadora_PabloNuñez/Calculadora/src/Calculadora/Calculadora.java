package Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
	public static void main(String[] args) {

		int cont=0;

		Scanner input =new Scanner (System.in);

		
		try {
            while (true) {
                double total = 0;
                System.out.println("Ingrese una opción");
                System.out.println("1 Suma");
                System.out.println("2 Resta");
                System.out.println("3 Multiplicar");
                System.out.println("4 Dividir");
                System.out.println("5 Salir");

                int opcion = input.nextInt();

                if (opcion == 1) {
                    System.out.println("Ingrese el primer número");
                    int numero1 = input.nextInt();

                    System.out.println("Ingrese el segundo número");
                    int numero2 = input.nextInt();

                    total = numero1 + numero2;
                    System.out.println("La suma es " + total);

                } else if (opcion == 2) {
                    System.out.println("Ingrese el primer número");
                    int numero1 = input.nextInt();

                    System.out.println("Ingrese el segundo número");
                    int numero2 = input.nextInt();

                    total = numero1 - numero2;
                    System.out.println("La resta es " + total);

                } else if (opcion == 3) {
                    System.out.println("Ingrese el primer número");
                    int numero1 = input.nextInt();

                    System.out.println("Ingrese el segundo número");
                    int numero2 = input.nextInt();

                    total = numero1 * numero2;
                    System.out.println("La multiplicación es " + total);

                } else if (opcion == 4) {
                    System.out.println("Ingrese el primer número");
                    int numero1 = input.nextInt();

                    System.out.println("Ingrese el segundo número");
                    int numero2 = input.nextInt();

                    if (numero2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        total = (double) numero1 / numero2;
                        System.out.println("La división es " + total);
                    }

                } else if (opcion == 5) {
                    break; // Salir del bucle si el usuario elige la opción 5
                } else {
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                }
            }

        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un número.");
            // Limpiar el búfer del escáner
            input.nextLine();
        }

	}

}

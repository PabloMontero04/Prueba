package Calculadora;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            while (true) {
                double total = 0;
                System.out.println("Ingrese una opcion");
                System.out.println("1 Suma");
                System.out.println("2 Resta");
                System.out.println("3 Multiplicar");
                System.out.println("4 Dividir");
                System.out.println("5 Raiz Cuadrada");
                System.out.println("6 Exponente");
                System.out.println("7 Valor Absoluto");
                System.out.println("0 Salir");

                int opcion = input.nextInt();

                if (opcion == 1) {
                    System.out.println("Ingrese el primer numero");
                    int numero1 = input.nextInt();

                    System.out.println("Ingrese el segundo numero");
                    int numero2 = input.nextInt();

                    total = numero1 + numero2;
                    System.out.println("La suma es " + total);

                } else if (opcion == 2) {
                    System.out.println("Ingrese el primer numero");
                    int numero1 = input.nextInt();

                    System.out.println("Ingrese el segundo numero");
                    int numero2 = input.nextInt();

                    total = numero1 - numero2;
                    System.out.println("La resta es " + total);

                } else if (opcion == 3) {
                    System.out.println("Ingrese el primer numero");
                    int numero1 = input.nextInt();

                    System.out.println("Ingrese el segundo numero");
                    int numero2 = input.nextInt();

                    total = numero1 * numero2;
                    System.out.println("La multiplicacion es " + total);

                } else if (opcion == 4) {
                    System.out.println("Ingrese el primer numero");
                    int numero1 = input.nextInt();

                    System.out.println("Ingrese el segundo numero");
                    int numero2 = input.nextInt();

                    if (numero2 == 0) {
                        System.out.println("No se puede dividir por cero.");
                    } else {
                        total = (double) numero1 / numero2;
                        System.out.println("La division es " + total);
                    }

                } else if (opcion == 5) {
                    System.out.println("Ingrese el numero");
                    int numero1 = input.nextInt();
                    double resultado = Math.sqrt(numero1);
                    System.out.println("La raiz cuadrada es " + resultado);

                } else if (opcion == 6) {
                    System.out.println("Ingrese el primer numero");
                    int numero1 = input.nextInt();

                    System.out.println("Ingrese el exponente");
                    int exponente = input.nextInt();

                    total = Math.pow(numero1, exponente);
                    System.out.println(numero1 + " elevado a la " + exponente + " es " + total);
                } else if (opcion == 7) {
                    System.out.println("Ingrese el numero");
                    int numero1 = input.nextInt();

                    total = Math.abs(numero1);
                    System.out.println("El valor absoluto de " + numero1 + " es " + total);
                } else if (opcion == 0) {
                    break;
                } else {
                    System.out.println("Opcion no valida");
                }
            }

        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente un numero.");
            input.nextLine();
        }
    }
}



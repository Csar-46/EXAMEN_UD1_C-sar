package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {

    public void ejercicio1() {

        boolean error = true;
        int num1 = -1;
        int num2 = -1;
        int num3 = -1;
        float media;

        Scanner entrada = new Scanner(System.in);
        while (error == true) { //Controlamos que el valor del multiplicador sea numerico
            try {
                while (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10 || num3 < 0 || num3 > 10) {

                    System.out.println("Introuce la nota del primer trimestre (0-10):");
                    num1 = entrada.nextInt();
                    System.out.println("Introuce la nota del segundo trimestre (0-10):");
                    num2 = entrada.nextInt();
                    System.out.println("Introuce la nota del tercer trimestre (0-10):");
                    num3 = entrada.nextInt();

                    if (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10 || num3 < 0 || num3 > 10) {
                        System.out.println("Nota fuera de rango (0-10). Vuelve a introducirlas...");
                    }
                }

                error = false; //cambiamos el valor para que no vuelva a entrar al bucle.

            } catch (InputMismatchException er) {

                System.out.println("ERROR. Introduce un valor numérico:");
                entrada.nextLine();

            }

            media = num1 + num2 + num3;
            media = media / 3;
            System.out.println("La media obtenida es " + media);

            if (media >= 5) {
                System.out.println("APROBADO.");
            } else
                System.out.println("SUSPENDIDO.");

        }

    }

    public void ejercicio2() {

        int num = 0;
        boolean error = true;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce un numero...");

        while (error == true) { //Controlamos que el valor del multiplicador sea numerico

            try {
                num = entrada.nextInt();

                error = false; //Cambiamos el valor para que no vuelva a entrar al bucle.

            } catch (InputMismatchException er) {

                System.out.println("ERROR. Introduce un valor válido:");
                entrada.nextLine();

            }

            if (num >= 0){
                System.out.println("El valor absoluto es " + num);
            }else{
                num = num + (2*(-num));
                System.out.println("El valor absoluto es " + num);
            }

        }
    }
}

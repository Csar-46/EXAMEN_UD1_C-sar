package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {

    public void ejercicio1 (){

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

                    if (num1 < 0 || num1 > 10 || num2 < 0 || num2 > 10 || num3 < 0 || num3 > 10){
                        System.out.println("Nota fuera de rango (0-10). Vuelve a introducirlas...");
                    }
                }

                error = false;

            } catch (InputMismatchException er) {

                System.out.println("ERROR. Introduce un valor numérico:");
                entrada.nextLine();

            }

            media = num1 + num2 + num3;
            media = media /3;
            System.out.println("La media obtenida es " + media);

            if (media >= 5) {
                System.out.println("APROBADO.");
            }else
                System.out.println("SUSPENDIDO.");

        }

    }
    public void ejercicio2 (){

    }
}

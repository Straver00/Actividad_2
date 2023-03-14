/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.activid2;

import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int numeroInscripcion,estrato;
        double patrimonio,valorMatricula;

        System.out.println("Ingrese el número de inscripción:");
        numeroInscripcion = t.nextInt();      
        
        t.nextLine();
        System.out.println("Ingrese los nombres del estudiante:");
        String nombres = t.nextLine();

        System.out.println("Ingrese el patrimonio del estudiante:");
        patrimonio = t.nextDouble();

        System.out.println("Ingrese el estrato social del estudiante:");
        estrato = t.nextInt();
        
        valorMatricula = 50000.0;
        
        if (patrimonio > 2000000 && estrato > 3) {
            valorMatricula += patrimonio * 0.03;
        }
        System.out.println("Número de inscripción: " + numeroInscripcion);
        System.out.println("Nombres: " + nombres);
        System.out.println("El estudiante debe pagar: $" + valorMatricula);
    }
}


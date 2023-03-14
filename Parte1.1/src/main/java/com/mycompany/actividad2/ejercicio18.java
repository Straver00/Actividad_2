/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
       double horas,valorhora,retencion,salarioB,salarioN; 
       Scanner s = new Scanner(System.in);
    System.out.println("ingrese su codigo: ");
    String C = s.nextLine();
    System.out.println("ingrese su nombre: ");
    String N=s.nextLine();
    System.out.println("ingrese el número de horas al mes: ");
    horas=s.nextDouble();
    System.out.println("ingrese el valor de la hora: ");
    valorhora=s.nextDouble();
    System.out.println("ingrese el valor de retención: ");
    retencion=s.nextDouble();
       salarioB=horas*valorhora;
       salarioN=horas*valorhora-(salarioB*(retencion/100));
    System.out.println("Código: "+C +" Nombres: "+N +" Salario bruto: "+salarioB +" Salario neto:"+salarioN );
    }    
}    
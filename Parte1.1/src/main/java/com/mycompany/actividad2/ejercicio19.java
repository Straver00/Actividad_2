/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad2;

import java.util.Scanner;
        
public class ejercicio19 {
    public static void main(String[] args) {
        double lado, perimetro, h, area;
        Scanner s = new Scanner(System.in);
        
      System.out.println("ingrese un lado del triángulo: ");
      lado=s.nextInt();
      perimetro=3*lado;
      h= (lado*Math.sqrt(3))/2;
      area=(lado*h)/2;
      System.out.println("El perimetro es "+perimetro);
      System.out.println("El valor de la altura es "+h);
      System.out.println("EL área es "+area);                            
     }
    
}

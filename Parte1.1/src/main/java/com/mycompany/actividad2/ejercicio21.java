/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.actividad2;

import java.util.Scanner;

public class ejercicio21 {
    public static void main (String[] args){
        double a, b, c, perimetro, semi, area;
        Scanner s = new Scanner(System.in);
        
      System.out.println("ingrese los lados del triángulo: ");
      a=s.nextInt();
      b=s.nextInt();
      c=s.nextInt();
      perimetro=a+b+c;
      semi= (a+b+c)/2;
      area=Math.sqrt(semi*(semi-a)*(semi-b)*(semi-c));
      System.out.println("El perimetro es "+perimetro);
      System.out.println("El semiperimetro es "+semi);
      System.out.println("EL área es "+area);                            
     }
    
}

   


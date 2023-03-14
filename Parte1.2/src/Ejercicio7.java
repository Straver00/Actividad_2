/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.activid2;

import java.util.Scanner;

public class Ejercicio7 {
   
    public static void main (String[] args){
        double a,b;
        Scanner s = new Scanner(System.in);
        
      System.out.println("ingrese dos valores numericos: ");
      a=s.nextDouble();
      b=s.nextDouble();
      
      if (a > b){
          System.out.println(a+" es mayor a "+b);
      }
      else if (a < b){
          System.out.println(a+" es menor a "+b);
      }
      else 
          System.out.println(a+" es igual a "+b);
    }
}          


import java.util.Scanner;

public class Ejercicio_15 {
    /* Se tienen cuatro esferas (A, B, C, D) de las cuales se sabe que tres son de igual peso y una
diferente. Elaborar un algoritmo que determine cuál es la esfera diferente y si es de mayor
o menor peso. */

    public static void main(String[] args) {
        int pesoA, pesoB, pesoC, pesoD;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A:");
        pesoA = teclado.nextInt();
        System.out.println("Ingrese el peso de la esfera B:");
        pesoB = teclado.nextInt();
        System.out.println("Ingrese el peso de la esfera C:");
        pesoC = teclado.nextInt();
        System.out.println("Ingrese el peso de la esfera D:");
        pesoD = teclado.nextInt();
        if ((pesoA == pesoB) & (pesoA == pesoC)) {
            System.out.println("La esfera D es la diferente");
            if (pesoD > pesoA) {
                System.out.println("Y es de mayor peso");
            } else {
                System.out.println("Y es de menor peso");
            }
        } else {
            if ((pesoA == pesoB) & (pesoA == pesoD)) {
                System.out.println("La esfera C es la diferente");
                if (pesoC > pesoA) {
                    System.out.println("Y es de mayor peso");
                } else {
                    System.out.println("Y es de menor peso");
                }
            }else{
                if ((pesoA == pesoC) & (pesoA == pesoD)) {
                    System.out.println("La esfera B es la diferente");
                    if (pesoB > pesoD) {
                        System.out.println("Y es de mayor peso");
                    } else {
                        System.out.println("Y es de menor peso");
                    }
                }else{
                    System.out.println("La esfera A es la diferente");
                    if (pesoA > pesoB) {
                        System.out.println("Y es de mayor peso");
                    } else {
                        System.out.println("Y es de menor peso");
                    }
                }
            }
        }
    }
}

import java.util.Scanner;
public class Ejercicio_23 {
    public static void main(String[] args) {
        int a, b, c;
        double sol1, sol2;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa A: ");
        a = entrada.nextInt();
        System.out.println("Ingresa B: ");
        b = entrada.nextInt();
        System.out.println("Ingresa C: ");
        c = entrada.nextInt();
        sol1 =  (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c)) )/(2 * a);
        System.out.println("Solución 1: " + sol1);
        sol2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c) )/ (2 * a);
        System.out.println("Solución 1: " + sol2);
    }
}
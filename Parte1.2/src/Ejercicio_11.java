import java.util.Scanner;
// Escribir un algoritmo que acepte tres números enteros diferentes y muestre el mayor de
// ellos.
public class Ejercicio_11 {
    public static void main(String[] args) {
        int n1,n2,n3,mayor;
        Scanner teclado = new Scanner(System.in);
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        n3 = teclado.nextInt();
        if((n1 > n2) & (n1 > 3)){
            mayor = n1;
        }else if(n2>n3){
            mayor = n2;
        }else{
            mayor = n3;
        }
        System.out.println("El valor mayor entre: "+n1+","+n2+" y "+n3+" es: "+mayor);
    }
}
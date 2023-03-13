import java.util.Scanner;

public class Ejercicio_24 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Peso de esfera A: ");
        a=entrada.nextDouble();
        System.out.println("Peso de esfera B: ");
        b=entrada.nextDouble();
        System.out.println("Peso de esfera C: ");
        c=entrada.nextDouble();
        if (a>b && a>c){
            System.out.println("La esfera mas pesada es la esfera A");
        } else if (b>a && b>c) {
            System.out.println("La esfera mas pesada es la esfera B");
        } else if (c>a && c>b){
            System.out.println("La esfera mas pesada es la esfera C");
        } else{
            System.out.println("Todas las esferas pesan lo mismo o hay 2 esferas con el maximo valor");
        }
    }
}
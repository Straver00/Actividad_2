import java.util.Scanner;

public class Ejercicio_13 {
    /*Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
    compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita
    es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es
    amarilla un 25%, si es azul un
    50% y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un
    cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores
    mencionados. */
    public static void main(String[] args) {
        int valcomp, valpag, pdes;
        String color;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el color:");
        color = teclado.nextLine();
        System.out.println("Ingrese el valor de la compra:");
        valcomp = teclado.nextInt();
        if (color.equals("BLANCO")) {
            pdes = 0;
        } else if (color.equals("VERDE")) {
            pdes = 10;
        } else if (color.equals("AMARILLO")) {
            pdes = 25;
        } else if (color.equals("AZUL")) {
            pdes = 50;
        } else {
            pdes = 100;
        }
        valpag = valcomp - pdes * valcomp / 100;
        System.out.println("El cliente debe pagar:$" + valpag);
    }
}

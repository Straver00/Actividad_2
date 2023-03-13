
import java.util.Scanner;
public class Ejercicio_22 {
    public static void main(String[] args) {
        String name;
        double salhor, horas;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa tu nombre: ");
        name=entrada.next();
        System.out.println("Ingresa tu salario basico por hora: ");
        salhor=entrada.nextDouble();
        System.out.println("Ingresa tus horas trabajadas en el mes: ");
        horas=entrada.nextDouble();
        if (salhor*horas>450000){
            System.out.println("Nombre: "+name+"\nSalario Mensual: "+String.format("%.0f",salhor*horas));
        }
        else {
            System.out.println("Nombre: "+name);
        }
    }
}
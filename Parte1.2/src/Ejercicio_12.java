import java.util.Scanner;
/*
Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas
semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden
de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando
no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo
que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes
datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora
normal de trabajo.
 */
public class Ejercicio_12 {

  public static void main(String[] args) {
    String nom;
    int nht,vhn, het, hee8, salario;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese el nombre del trabajador: ");
    nom = teclado.nextLine();
    System.out.println("Ingrese el numero de horas trabajadas: ");
    nht = teclado.nextInt();
    System.out.println("Ingrese el valor de las horas normales: ");
    vhn = teclado.nextInt();
    if (nht > 40){
      het =   nht - 40;
      if (het > 8 ){
        hee8 = het-8;
        salario = 40 * vhn + 16 *vhn + hee8 * 3 * vhn;
      }else{
        salario = 40 * vhn + het * 2 * vhn;
      }
    }else{
      salario = nht * vhn;
    }
    System.out.println("El trabajador "+nom+" devengo: $"+salario);
  }
}

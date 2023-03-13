import java.util.Scanner;

public class Ejercicio_14 {
    /*Una empresa con tres departamentos tiene establecido un plan de incentivos para sus
vendedores. Al final del período, a cada departamento se le pide el importe global de las
ventas. A los departamentos que excedan el 33% de las ventas totales se les adiciona al
salario de los vendedores un porcentaje equivalente al 20% del salario mensual. Las
nóminas de los tres departamentos son iguales. Si se tienen los siguientes datos:
     */

    public static void main(String[] args) {
       double vd1,vd2,vd3,salar,totven,salar1,salar2,salar3,porven;
       Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 1");
        vd1 = teclado.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2");
        vd2 = teclado.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3");
        vd3 = teclado.nextDouble();
        System.out.println("Ingrese el salario de los vendedores");
        salar = teclado.nextDouble();
        totven = vd1 + vd2 + vd3;
        porven = 0.33 * totven;
        if (vd1 > porven){
            salar1 = salar + 0.2 * salar;
        }else{
            salar1 = salar;
        }
        if (vd2 > porven){
            salar2 = salar + 0.2 * salar;
        }else{
            salar2 = salar;
        }
        if (vd3 > porven){
            salar3 = salar + 0.2 * salar;
        }else{
            salar3 = salar;
        }
        System.out.println("Salario vendedores Depto. 1: "+salar1+"\nSalario vendedores Depto. 2: "+salar2+"\nSalario vendedores Depto. 3: "+salar3);

    }
}

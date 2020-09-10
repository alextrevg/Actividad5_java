import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        //declaramos nuestras variables
        float x,y, SumaRes, RestaRes, MultRes, DivRes, ModRes;
        Scanner numero = new Scanner(System.in);
        System.out.println("En esta actividad haremos algunas operaciones basicas. Favor de seguir las instrucciones");
        //capturamos nuestro primer dato
        System.out.println("Ingresa el primer numero");
        x=numero.nextFloat();
        //caputramos nuestro segundo dato
        System.out.println("Ingresa el segundo numero");
        y=numero.nextFloat();

        //Operaciones
        SumaRes= x+y;
        RestaRes=x-y;
        MultRes=x*y;
        DivRes=x/y;
        ModRes=x%y;

        //Informamos de los datos ingresados
        System.out.println("Datos ingresados");
        System.out.println("El primer numero ingresado es x: "+x);
        System.out.println("El segundo numero ingresado es y: "+y);
        System.out.println("\n");

        //Resultados de operaciones
        System.out.println("Resultados");
        System.out.println("El resultado de la suma es: "+SumaRes);
        System.out.println("El resultado de la resta es: "+RestaRes);
        System.out.println("El resultado de la multiplicaciones es: "+MultRes);
        System.out.println("El resultado de la division es: "+DivRes);
        System.out.println("El resultado del modulo es: "+ModRes);


    }
}
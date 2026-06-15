import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        float clasficacion1, clasificacion2, clasificacion3, suma;

        System.out.println("Ingrese la primer calificación: ");
        clasficacion1 = entrada.nextFloat();
        System.out.println("Ingrese la segunda calificación: ");
        clasificacion2 = entrada.nextFloat();
        System.out.println("Ingrese la tercera calificación: ");
        clasificacion3 = entrada.nextFloat();
        suma = clasficacion1 + clasificacion2 + clasificacion3;
        System.out.println("\nLa suma es: " + suma);

    }

}
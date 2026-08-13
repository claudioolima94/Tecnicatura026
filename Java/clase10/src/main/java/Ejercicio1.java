import java.util.Scanner;

/*
Ejercicio 1: Construir un programa que, dado un número total de

horas, devuelve el número de semanas, días y horas equivalentes.

Por ejemplo dado un total de 1000 horas debe mostrar 5 semanas,

6 días y 16 horas.
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int totalHoras, semanas, dias, horas;

        System.out.println("Ingrese la cantidad de horas: ");
        totalHoras = entrada.nextInt();

        semanas = totalHoras / 168;
        horas = totalHoras % 168;
        dias = totalHoras % 24;
        System.out.println("\nEquivalencia del tiempo:");
        System.out.println("Semanas: " + semanas);
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);

    }
}
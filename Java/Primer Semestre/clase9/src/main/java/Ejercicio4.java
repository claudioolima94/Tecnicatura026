import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 al 10: ");

        var calificacion = Integer.parseInt(entrada.nextLine());

        switch (calificacion) {
            case 9:
            case 10:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");

                break;
            case 7:
                System.out.println("C");

                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.println("F");
                break;
            default:
                System.out.println("Fuera del rango.");

        }
    }
}
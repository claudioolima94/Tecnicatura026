
import java.util.Scanner;

//Actividad Detalles Libro
public class Ejercicio {

    public static void main(String[] args) {
        //Clase scanner
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el título del libro: ");
        var nombreTitulo = entrada.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        var autor = entrada.nextLine();
        System.out.println(nombreTitulo + " fue escrito por " + autor);
    }
}
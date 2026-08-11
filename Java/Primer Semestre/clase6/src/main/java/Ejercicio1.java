/*
 Ejercicio: Tienda de libros
Mostrar: Ingrese los siguientes datos del libro
Digite el nombre del libro
Digite el ID del libro
Digite el precio del libro
Indicar si el envío es gratuito (True/False)
Mostrar:
	Nombre:
	ID: 
	Precio:
	Envío Gratuito?:
 */
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
         System.out.println("Ingrese los siguientes datos del libro");
        System.out.println("Ingrese el nombre del libro: ");
        var nombreLibro = entrada.nextLine();
        System.out.println("Ingrese el ID del libro: ");
        int idLibro = Integer.parseInt(entrada.nextLine());
        System.out.println("Ingrese el precio del libro: ");
        double precio = Double.parseDouble(entrada.nextLine());
         System.out.println("Indicar si el envío es gratuito: ");
        boolean envio = Boolean.parseBoolean(entrada.nextLine());
        System.out.println(nombreLibro + " #" + idLibro);
        System.out.println("Precio del libro: $"+precio);
        System.out.println("El envío del libro gratuito es: "+envio);
    }
}
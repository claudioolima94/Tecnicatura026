import java.util.Scanner;

/*Ejercicio : Rectángulo
Se solicita calcular el área y el perímetro de un rectángulo, para esto deberemos crear las variables:
Alto (int)
Ancho(int)
El usuario debe proporcionar los valores de alto, ancho y después se debe imprimir el resultado en el siguiente formato: (recuerden no usar acentos, respetar los espacios, mayúsculas, minúsculas y saltos de líneas.
*/
public class ejercicio02 {
    public static void main(String[] args) {
        int alto, ancho, perimetro, area;
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingresar el alto de un rectángulo: ");
                alto = entrada.nextInt();
                System.out.println("Ingresar el ancho de un rectángulo: ");
                ancho = entrada.nextInt();
                area = ancho * alto;
                perimetro = 2 * (alto + ancho);
                System.out.println("El area del rectángulo es: " + area);
                System.out.println("El perímetro del rectángulo es: "+ perimetro);

    }
}
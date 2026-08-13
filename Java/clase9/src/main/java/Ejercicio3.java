import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float num1, num2, resultado;

        System.out.println("Ingrese el primer número: ");
        num1 = entrada.nextFloat();
        System.out.println("Ingrese el segundo número: ");
        num2 = entrada.nextFloat();

        if (num1 == num2) {
            resultado = num1 * num2;
        } else if (num1 > num2) {
            resultado = num1 - num2;
        } else {
            resultado = num1 + num2;
        }
        System.out.println("El resultado es: " + resultado);
    }
}
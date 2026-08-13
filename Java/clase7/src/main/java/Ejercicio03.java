import java.util.Scanner;

/*Ejercicio: El mayor de 2 números

Usaremos el Operador Ternario

Le vamos a pedir los números al usuario
*/
public class Ejercicio03 {
    public static void main(String[] args) {
        int num1, num2;
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingresar el número 1: ");
                num1 = entrada.nextInt();
                 System.out.println("Ingresar el número 2: ");
                num2 = entrada.nextInt();
                
                System.out.println(num1 > num2 ? "El número 1 es mayor" : "El número 2 es mayor");
    }
    
}
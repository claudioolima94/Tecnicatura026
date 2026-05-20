import java.util.Scanner;
public class MayorNumero {
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        int num1, num2, mayor;
        System.out.println("Ingrese el primer numero: ");
        num1 = teclado.nextInt();
        
        System.out.println("Ingrese el segundo numero: ");
        num2 = teclado.nextInt();
        
        mayor = (num1 > num2) ? num1 : num2;
        
        System.out.println("El mayor es: " + mayor);
    } 
}

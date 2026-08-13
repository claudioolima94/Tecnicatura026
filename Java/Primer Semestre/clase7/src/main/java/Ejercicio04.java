import java.util.Scanner;

/*
Ejercicio 2:
Hacer un programa que calcule e imprima el salario de un empleado, a partir de sus horas semanales trabajadas y de su salario por hora.
 */
public class Ejercicio04 {
    public static void main(String[] args) {
        double horasSemanales, salarioPorHora, salario;
        
                Scanner entrada = new Scanner(System.in);
                System.out.println("Ingresa la cantidad de horas semanales trabajadas: ");
                horasSemanales = entrada.nextDouble();
                System.out.println("Ingrese el salario por hora: ");
                salarioPorHora = entrada.nextDouble();
                salario = horasSemanales * salarioPorHora;
                System.out.println("El salario del empleado es: $" + salario);

    }
}
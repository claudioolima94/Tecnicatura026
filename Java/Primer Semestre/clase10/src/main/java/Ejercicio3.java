import java.util.Scanner;

/*Ejercicio 3: La calificacion final de un estudiante de informática
se calcula con base a las calificaciones de cuatro aspectos de su
rendimiento académico: participación, primer examen parcial, segundo
examen parcial y examen final. Sabiendo que las calificaciones anteriores
entran a la calificación final con ponderaciones de 10%, 25%, 25%
y 40%, Hacer un programa que calcule e imprima la calificación final
obtenida por un estudiante. 
Que el usuario digite las calificaciones de estos 4 datos y así podremos tener,
la calificación final.
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double participacion, primerExamen, segundoExamen, finalExamen, calificacionFinal;
        System.out.println("Ingrese la calificación de participación: ");
        participacion = entrada.nextDouble();
        System.out.println("Ingrese la calificación del primer exámen: ");
        primerExamen = entrada.nextDouble();
        System.out.println("Ingrese la calificación del segundo exámen: ");
        segundoExamen = entrada.nextDouble();
        System.out.println("Ingrese la calificación del exámen final: ");
        finalExamen = entrada.nextDouble();

        calificacionFinal = (participacion * 0.10) + (primerExamen * 0.25) + (segundoExamen * 0.25) + (finalExamen * 0.40);
        System.out.println("\nLa calificación final del alumno es: " + calificacionFinal);

    }
}
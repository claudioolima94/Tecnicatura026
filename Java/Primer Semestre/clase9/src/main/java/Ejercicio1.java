import java.util.Scanner;

public class Ejercicio1 {
     public static void main(String[] args) {
          Scanner entrada = new Scanner(System.in);
          
          float nota1, nota2, nota3, promedio;
          System.out.print("Ingrese la primer nota: ");
          nota1 = entrada.nextFloat();
          System.out.print("Ingrese la segunda nota: ");
          nota2 = entrada.nextFloat();
          System.out.print("Ingrese la tercer nota: ");
          nota3 = entrada.nextFloat();
          promedio = (nota1+nota2+nota3) / 3;
          promedio = Math.round(promedio * 10);
          
          if(promedio >= 70) {
               System.out.print("El alumno está aprobado con: "+promedio+"%");
          } else {
               System.out.print("El alumno NO está aprobado con: "+promedio+"%");
          }
          
     }
     
}
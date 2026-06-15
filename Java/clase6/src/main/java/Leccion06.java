import java.util.Scanner;


public class Leccion06 {
    public static void main(String[] args) {
        /*boolean varBool = true;
        System.out.println("varBool = " + varBool );
        
        if(varBool){
            System.out.println("La bandera es verde");
        } else {
            System.out.println("La bander es roja");
        }
        
        //Algoritmo: ¿Es mayor de edad?
        var edad = 20;
        
        if(edad >= 18){
            System.out.println("Eres mayor de edad");
        }else {
            System.out.println("Eres menor de edad");
        }
*/
        //Conversión
        /*var edad = Integer.parseInt("20");
        System.out.println("edad = " + (edad + 1));
        var valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = " + valorPI);
        
        //Pedir un valor
        System.out.println("Ingrese su edad: ");
        edad = Integer.parseInt(entrada.nextLine());
        System.out.println("edad = " + edad);
*/
                var entrada = new Scanner(System.in);

        //Conversión de tipos primitivos en Java parte 2
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto = " + edadTexto);
        
        var fraseChar = "Programadores".charAt(4);
        System.out.println("fraseChar = "+ fraseChar);
        
        System.out.println("Ingrese un caracter: ");
        fraseChar = entrada.nextLine().charAt(0);
        System.out.println("fraseChar = "+ fraseChar);
        
    }
}
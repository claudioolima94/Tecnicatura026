import java.util.Scanner;


public class Leccion3 {

    public static void main(String[] args) {
       /* var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos creciendo";
        System.out.println("miVariableCadena2 = " + miVariableCadena2);
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        //soutv + tab
        //Pära ejecutar Shitf + F6 es la tecla mayúscula
        //Reglas para definir una variable Java
    
        var usuario = "Osvaldo";
        var titular = "Ingeniero";
        var union = titular + usuario;
        System.out.println("union = " + union);

        
        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b));
        
        //Ejercicio: Caracteres Especiales con Java
        var nombre = "Natalia";
        System.out.println("\nNueva linea: \n"+nombre);
        System.out.println("Tabulador: \t"+nombre);
        System.out.println("\t.:MENÚ:.");
        System.out.println("Retroceso: \b\b"+nombre);
        System.out.println("Comillas simples: \'"+nombre+"\'");
        System.out.println("Comillas Dobles: \""+nombre+"\"");
*/
       //Clase Scanner
       Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        var usuario2 = entrada.nextLine();
        System.out.println("usuario2 = " + usuario2);
         System.out.println("Escriba el título: ");
         var titulo2 = entrada.nextLine();
         System.out.println("Resultado: "+titulo2+" "+usuario2);
    }
}


import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        float gillermo, juan, luis, total;
        System.out.println("Digite el dinero de Gillermo");
        
        gillermo = Float.parseFloat(entrada.nextLine());
        luis = gillermo / 2;
        juan = (gillermo + luis) / 2;
        total = gillermo + luis + juan;
        
        System.out.println("El dinero total entre los tres es: "+ total);
        
                
        
        
     
        
         
    }
    
}

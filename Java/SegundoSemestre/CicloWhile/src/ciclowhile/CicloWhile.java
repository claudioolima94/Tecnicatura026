
package ciclowhile;

public class CicloWhile {
    public static void main(String[] args) {
     var conteo = 0; // Inferencias de tipos 
     while (conteo < 7) {
         System.out.println("conteo = " + conteo);
         conteo++; //vamos aumentando en uno la variable
         
     }
     var contador = 0;
     do{
         System.out.println("contador = " + contador);
         contador++;
    }while(contador <= 7);
  } 
}

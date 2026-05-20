import java.util.Scanner;
public class Rectangulo {
    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
        double base, altura, area, perimetro;
        System.out.println("ingrese la base: ");
        base = teclado.nextDouble();
        System.out.println("Ingrese la altura");
        altura = teclado.nextDouble();
        
        area = base * altura;
        perimetro = 2 * (base + altura);
        
        System.out.println("El area es: " + area);
        System.out.println("El perimetro es: " + perimetro);
        
        
    }       
    
}

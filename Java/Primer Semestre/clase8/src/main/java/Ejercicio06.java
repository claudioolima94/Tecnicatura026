import java.util.Scanner;


public class Ejercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float dolarsGuillermo, dolarsLuis, dolarsJuan, total;
        
        System.out.print("Ingrese la cantidad de dólares que tiene Guillermo: ");
        dolarsGuillermo = entrada.nextFloat();
        dolarsLuis = dolarsGuillermo / 2;
        dolarsJuan = (dolarsGuillermo + dolarsLuis) / 2;
        total = dolarsGuillermo + dolarsLuis + dolarsJuan;
        System.out.println("\n--- Resultados ---");
        System.out.println("Guillermo tiene: US$" + dolarsGuillermo);
        System.out.println("Luis tiene: US$" + dolarsLuis);
        System.out.println("Juan tiene: US$" + dolarsJuan);
        System.out.println("El dinero total entre los tres es: US$" + total);
    }
}
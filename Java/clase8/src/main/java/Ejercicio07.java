import java.util.Scanner;


public class Ejercicio07 {
    public static void main(String[] args) {
        
      Scanner entrada = new Scanner(System.in);  
      
        final double SALARIO_BASE = 1000.0;
        final double COMISION_FIJA = 150.0;
        final double PORCENTAJE_VENTA = 0.05; // 5% expresado en decimal
        
        int autosVendidos;
        double valorTotalVentas, totalComisionFija, totalComisionPorcentaje, salarioTotal;
        
        System.out.print("Ingrese la cantidad de autos vendidos en el mes: ");
        autosVendidos = entrada.nextInt(); 
        System.out.print("Ingrese el valor total de las ventas de esos autos: $");
        valorTotalVentas = entrada.nextDouble();
        
        totalComisionFija = autosVendidos * COMISION_FIJA;
        totalComisionPorcentaje = valorTotalVentas * PORCENTAJE_VENTA;
        salarioTotal = SALARIO_BASE + totalComisionFija + totalComisionPorcentaje;
        
        System.out.println("\n--- Desglose de Salario Mensual ---");
        System.out.println("Salario Base Fijo: $" + SALARIO_BASE);
        System.out.println("Comisión por cantidad vendida (" + autosVendidos + "): $" + totalComisionFija);
        System.out.println("Comisión por el 5% del valor total: $" + totalComisionPorcentaje);
        System.out.println("------------------------------------");
        System.out.println("El salario mensual total del vendedor es: $" + salarioTotal);
    }
 
}
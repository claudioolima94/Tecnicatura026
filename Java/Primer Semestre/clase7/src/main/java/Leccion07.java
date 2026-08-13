public class Leccion07 {

    public static void main(String[] args) {
        /* int num1 = 5, num2 = 4;
        var solucion = num1 + num2;
        System.out.println("Solución de la suma = " + solucion);
        
        solucion = num1 - num2;
        System.out.println("Solución de la resta = " + solucion);
        
        solucion = num1 * num2;
        System.out.println("Solución de la multiplación = " + solucion);
        
        solucion = num1 / num2;
        System.out.println("Solución de la divisón = " + solucion);
        
        var solucion2 = 3.4 / num2;
        System.out.println("solucion2 resultado de la división = " + solucion2);
        
        solucion = num1 % num2; //Guarda el residuo entero de la división
        System.out.println("Solucion = " + solucion); //5/4
        
        if (num1% 2 == 0)
            System.out.println("Es un número Par");
        else 
            System.out.println("Es un número Impar");
         */
        //Operadores unarios: Cambio de signo
        /*
        var varA = 7;
        var varB = -varA;
        System.out.println("varA = " + varA);
        System.out.println("varB = " + varB); //El resultado será un número negativo
        
        //Operador de negación
        var varC = true; //Esta literal por default en Java de tipo boolean
        var varD = !varC; //Aqui está invirtiendo el valor
        System.out.println("varC = " + varC);
        System.out.println("varD = " + varD);
        
        //Operadores unario de incremento: Preincremento
        var varE = 9; //Se va a modificar su valor
        var varF = ++varE; //Va suman uno
        //Primero se incrementa la variable y después suma su valor
        System.out.println("varE = " + varE); //Se incrementa en la unidad
        System.out.println("varF = " + varF); //Va sumar uno
        
        //PostIncremento (el simbolo va después de la variable)
        var varG = 3;
        var varH = varG++;
        System.out.println("varG = " + varG);
        System.out.println("varH = " + varH);
        
        //Operadores unarios de decremento
        var varI = 4;
        var varJ = --varI;
        System.out.println("varI = " + varI);
        System.out.println("varJ = " + varJ);
        
        //Postdecremento
        var varK = 8;
        var varL = varK--; //Primero el valor de la variable, luego queda el drecemento
        System.out.println("varK = " + varK); //Aqui va a decrementar en 1
        System.out.println("varL = " + varL);
         */

        //Operadores de igualdad y relacionales
        /* var aNum = 5;
        var bNum = 4;
        var cNum = (aNum == bNum);
        System.out.println("cNum = " + cNum);

        var dNum = aNum != bNum;
        System.out.println("dNum = " + dNum);

        var cadenaA = "Hello";
        var cadenaB = "bye bye";
        var cVar = cadenaA == cadenaB;
        System.out.println("cVar = " + cVar);

        var fVar = cadenaA.equals(cadenaB);
        System.out.println("fVar = " + fVar);

        var gVar = aNum != bNum; //> >= < <= == !=
        System.out.println("gVar = " + gVar);

        if (aNum % 2 ==  0) {
            System.out.println("El numero es Par");
        } else {
            System.out.println("El numero es Impar");
        }
        
        var edad = 15;
        var adulto = 18;
        if(edad >= adulto) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

         */
 /*
        var valorA = 7;
        var valorMinimo = 0; //valor del 0 al 10
        var valorMaximo = 10;
        var respuesta = valorA >= 0 && valorA <= 10;

        if (respuesta) {
            System.out.println("Está dentro del rango establecido");
        } else {
            System.out.println("No está dentro del rango establecido");
        }

        var vacaciones = false;
        var diaLibre = true;
        if (vacaciones || diaLibre) {
            System.out.println("Papá puede asistir al juego de su hijo");
        } else {
            System.out.println("Papá no puede asistir al juego de su hijo");

        }
         */
        //Operador ternario
        /*
        var resultadoT = (5 > 8) ? "Verdadero" : "Falso";
        System.out.println("resultadoT = " + resultadoT);
        
        var numeroT = 4;
        resultadoT = (numeroT % 2 == 0) ? "Es Par" : "No es impar";
        System.out.println("resultadoT = " + resultadoT );
         */
        var x = 5;
        var y = 10;
        var z = ++x + y--;
        System.out.println("x =  " + x); //6
        System.out.println("y =  " + y);// 9
        System.out.println("z =  " + z);//16
        
        var solucionAritmetica = 4 + 5 *6 / 3; //4 + ((5 * 6) / 3) = 30 / 3 = 10 + 4 = 14
        System.out.println("solucionAritmetica = " + solucionAritmetica);
        
        solucionAritmetica = (4 + 5) * 6 / 3; // 4 + 5 = 9 * 6 = 54 / 3 = 18
        System.out.println("solucionAritmetica = " + solucionAritmetica);
    }
}
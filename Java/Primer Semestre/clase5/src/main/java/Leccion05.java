public class Leccion05 {
    public static void main(String[] args) {
        /*
        //Inferenca de tipos var y tipos primitivos
        var numEntero = 20; //Las literales sin punto automaticamente son de tipo int
        System.out.println("numEntero = " + numEntero);
        var numFloat = 10.0F; //Automaticamente con el tipo se tranforma en tipo double
        System.out.println("numFLoat = " + numFloat);
         var numDouble = 10.0; //Automaticamente con el tipo se tranforma en tipo double
        System.out.println("numDouble = " + numDouble);
*/
        char miVariableChar = 'a';
        System.out.println("miVariableChar = " + miVariableChar);
        char varCharacter = '\u0024'; //Indicamos a Java la asignación con el código unicode
        System.out.println("varCharacter = " + varCharacter);
        char varCaracterDecimal = 36; //Valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal = " + varCaracterDecimal);
        char varCaracterSimbolo = '$'; //Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo = " + varCaracterSimbolo);
        
         var miVariableChar1 = 'a';
        System.out.println("miVariableChar1 = " + miVariableChar1);
        var varCharacter1 = '\u0024'; //Indicamos a Java la asignación con el código unicode
        System.out.println("varCharacter1 = " + varCharacter1);
        var varCaracterDecimal1 = (char)36; //Valor decimal del juego de caracteres unicode
        System.out.println("varCaracterDecimal1 = " + varCaracterDecimal1);
        var varCaracterSimbolo1 = '$'; //Un caracter especial, podemos copiar y pegar desde unicode
        System.out.println("varCaracterSimbolo1 = " + varCaracterSimbolo1);
        
        int varEnteroChar = '$';
        System.out.println("varEnteroChar = " + varEnteroChar);
        int caracterChar = 'b';
        System.out.println("caracterChar = " + caracterChar);
    }
}
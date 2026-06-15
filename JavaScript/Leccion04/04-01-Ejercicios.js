//Ejercicio 1: Calcular la estación del año
let mes = 9;
let estacion;
if (mes == 1 || mes || 2 || mes == 3) {
    estacion = "Verano"
} else if (mes == 4 || mes == 5 || mes == 6) {
    estacion = "Otoño"
} else if (mes == 7 || mes == 8 || mes == 9) {
    estacion = "Invierno"
} else if (mes == 10 || mes == 10 || mes == 11) {
    estacion = "Primavera"
} else {
    estacion = "Valor incorrecto"
}
console.log("El valor corresponde a la estación de: " + estacion)

//Estructura switch(la sintaxis es igual a Java)
switch (mes) {
    case 1: case 2: case 3:
        estacion = "Verano";
        break;
    case 4: case 5: case 6:
        estacion = "Otoño";
        break;
    case 7: case 8: case 9:
        estacion = "Invierno";
        break;
    case 10: case 11: case 12:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
        break;
}
console.log("Bienvenido a la estación de: " + estacion);

//Ejercicio 2: Hora del día
/*
de 6 a 11 nos saluda: Godd Morning
de 12 a 16 nos saluda: Good afternoon
de 17 a 19 nos saluda: Good evening
de 20 a 23 nos saluda: Good night 
Trabajaremos con 24 horas
*/
let horaDia = 7;
let mensaje;
if (horaDia >= 6 && horaDia <= 11) {
    mensaje = "Godd Morning"
} else if (horaDia >= 12 && horaDia <= 16) {
    mensaje = "Good afternoon"
} else if (horaDia >= 17 && horaDia <= 19) {
    mensaje = "Good evening"
} else if (horaDia >= 20 && horaDia <= 23) {
    mensaje = "Good night "
} else {
    mensaje = "Valor incorrecto"
}
console.log(mensaje)

/*
Con var puedes reasingar en cualquier momento
este forma del ámbito global
Un error es que se sobreescriba
*/
var nombre = "Felipe";
nombre = "Osvaldo";
console.log(nombre);

function saludar() {
    var nombre3 = "Natalia";
    console.log(nombre3);
}
// console.log(nombre3)//EL problema es que aquí no lee el dato de la función

if (true) {
    var edad = 34;
    console.log(edad)
}

console.log(edad);//En la función funciono correctamente, en la estructura if fallo

/*
let: esta puede ser reasignada en cualquier momento
la diferencia es que su ámbito es de bloque,
solo disponible dentro  de un bloque de llaves
o dentro de una función
*/

function saludar2() {
    let nombre2 = "Ariel";
    console.log(nombre2)
}
//console.log(nombre2)

if (true) {
    let edad2 = 33;
    console.log(edad2)
}

//console.log(edad2);

/*const se utiliza para valores constantes que no pueden ser reasignados*/

const fechaNacimiento = 2006;
console.log(fechaNacimiento);
 fechaNacimiento = 2003;
console.log(fechaNacimiento); //Solo se ejecuta el console anterior

//Evitar repetir tu código
//Dry don't repeat yourself
let days = 5;
switch (days) {
    case 1:
        console.log("hoy es Lunes")
        break;
    case 2:
        console.log("hoy es Martes")
        break;
    case 3:
        console.log("hoy es Miércoles")
        break;
    case 4:
        console.log("hoy es Jueves")
        break;
    case 5:
        console.log("hoy es Viernes")
        break;
    case 6:
        console.log("hoy es Sábado")
        break;
    case 7:
        console.log("hoy es Domingo")
        break;

    default:
        console.log("Error en el ingreso del día de la semana")
        break;
}

//Esta es la opción mejorada
let days2 = ["Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"];
function getDay(n) {
    if (n < 1 || n > 7) {
        throw new Error("out of range")
    }
    return days[n - 1]
}
console.log(getDay(3));
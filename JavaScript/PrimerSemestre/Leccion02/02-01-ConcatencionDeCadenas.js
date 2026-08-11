var nombre = "jose ";
var apellido = "Montes";
var nombreCompleto = nombre+" "+apellido;
console.log(nombreCompleto);
var nombreCompleto2 = 'Claudio'+' '+'Olima';
console.log(nombreCompleto2);
var juntos = nombre + 219; //lee de izq a der siguiendo la cadena lee el numero como str
console.log(juntos);
juntos = nombre + 78 + 17; //Aqui se puede diferenciar atravez de los parentesis
console.log(juntos);
juntos = 78 + 17 + nombre;
console.log(juntos);

nombre += apellido; //Tercera concatencion usando el operador simplificado
console.log(nombre);

let nombre2 = "Pedro";
console.log(nombre2);

const apellido2 = "Lepes";
//apellido2 = "Peres"; una constante no puede ser modificada
console.log(apellido2)

let x, y; //Se puede crear varias variables dentro de una misma linea
x = 17, y = 21; //Se puede hacer asignacion de varias variables dentro de la misma linea
let z = x + y;
console.log(z);

let _1num = 31; //No utilizar numeros para iniciar el nombre de una variable
let rompiedno = "rompe"; //No utilizar paralabras reservadas para variables

console.log(_1num);
console.log(rompiedno);
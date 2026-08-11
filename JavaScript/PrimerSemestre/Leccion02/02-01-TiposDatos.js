// Tipos de datos en JavaScript
/*
la sintaxis en lo que es comentarios
es muy similar a la de java
Realmente que es identica
*/

var nombre = 'Claudio'; //Tipo Str
console.log(nombre);
nombre = 7;
console.log(nombre);
nombre = 12.3;
console.log(nombre);
var numero = 3000; //Tipo Numerico
console.log(numero);

var objeto = {
    nombre : "Claudio",
    apellido : "Olima",
    telefono : "2604645784"

}
console.log(objeto);

//Tipo De Dato Boolean
var bandera = true;
console.log(bandera);

//Tipo de dato Funcion
function miFuncion(){}
console.log(typeof miFuncion);

//Tipo de dato Symbol
var simbolo = Symbol("Mi simbolo");
console.log(typeof simbolo);

//tipo de dato clase
class Persona{
    constructor(nombre,apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(typeof Persona);

//Tipo de dato undefined
var x;
console.log(x);

x = undefined;
console.log(typeof x);

//null: significa ausencia de valor 
var y = null; //null no es un tipo de dato, pero su oriigen es de tipo objeto
console.log(typeof y);

//tipo de dato array y Empty String
var autos = ["Citroen", "audi","BMW","Ford"];
console.log(autos);
console.log(typeof autos); //Preguntamos que tipo de dato es :

var z = "";
console.log(z); // esto se refiere a que es una cadena vacia:
console.log(typeof z);


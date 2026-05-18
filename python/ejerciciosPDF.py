""""
#Ejercicio 1
a = float(input("Digite el valor de a"))
b = float(input("digite el valor de b"))
c = float(input("Digite el valor de c"))

#Calculamos la expresion 

resultado = (a**3 * (b**2 - 2*a*c)) / (2*b)

#Mostramos el resultado final

print("el resultado final es:", resultado)
"""
"""
# Ejercicio 2 
# Determinar la solucion logica de la siguiente operacio
# ((3 + 5 * 8 ) < 3 and ((- 6/3 * 4) + 2 < 2)) or ( a > b)

a = 10
b = 5

# La exprecion contiene operaciones matematicas,
# comparaciones logicas y operadores booleanos.

#Primero se evaluan las operaciones matematicas,
#luego se realizan laas comparaciones (< y >)
# despues se resuelve el operador logico AND.
# Finalmente se evalua el operador logico OR.
resutaldo = ((3 + 5 * 8)< 3 and ((- 6/3 * 4) + 2 < 2) or (a < b))
print("Resultado:", resultado)

# Ejercicio 3

a = 10
b = 5

# Mostramos los valores originales 
print("Valor de a:", a)
print("valor de b", b)

print("Ahora intercambiamos los valores")
# Guardamos el valor de a en aux
aux = a
a = b
b = aux

print("Nuevo valor de a:", a)
print("nuevo valor de b", b)
"""

import math

radio = float(input("ingrese el radio del circulo: "))
#Calculamos el area y la longitud
area = math.pi * (radio ** 2)
longitud = 2 * math.pi * radio 

print(f"el area del circulo es: {area}")
print(f"La longitud de la circunferencia es: {longitud}")


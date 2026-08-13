# a = float(input("Digite el valor de a"))
# b = float(input("digite el valor de b"))
# c = float(input("Digite el valor de c"))

# #Calculamos la expresion 

# resultado = (a**3 * (b**2 - 2*a*c)) / (2*b)

# #Mostramos el resultado final

# print(f"el resultado final es:, {resultado}")

#Pedimos el valor de a y b 
# a = int(input("Ingrese valor de a: "))
# b = int(input("Ingrese valor de b: "))
# # Evaluamos la operacion logica3
# parte1 = (3 + 5 * 8) < 3
# parte2 = ((-6 / 3 * 4) + 2 ) < 2
# parte_and = parte1 and parte2

# resultado = parte_and or (a < b)
# print(f"El resultado es: {resultado}")

# Pedimos los valores
# a = int(input("Ingrese valor de a: "))
# b = int(input("Ingrese valor de b: "))

# print(f"Antes del intercambio: a = {a}, b = {b}")

# # Intercambiamos usando variable auxiliar
# aux = a
# a = b
# b = aux

# print(f"Despues del intercambio: a = {a}, b = {b}")

import math

# Pedimos el radio al usuario
radio = float(input("Ingrese el radio del circulo: "))

# Calculamos área y longitud
area = math.pi * radio**2
longitud = 2 * math.pi * radio

# Mostramos los resultados
print(f"El area del circulo es: {area}")
print(f"La longitud de la circunferencia es: {longitud}")
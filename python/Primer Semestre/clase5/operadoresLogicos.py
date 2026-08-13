"""""
# Operadores Logicos

a = False
b = False
resultado = a and b
print(resultado)

# Operador or 

resultado = a or b
print(resultado)

# Operador not 

resultado = not a
print(resultado)
"""""
"""""
# ejercicio: valor dentro de un rango

valor = int(input("digite un numero"))
valorMinimo = 0
valorMaximo = 5
dentroRango = valor >= valorMinimo and valor <= valorMaximo
if dentroRango:
    print(f'El valor {valor} esta dentro del rango')
else:
    print(f'El valor {valor} No esta dentro del rango')
"""
""""

# Ejercicio con el operador or, Operador Not
vacaciones = True
diaDescanso = True
if not (vacaciones or diaDescanso):
    print('Tiene trabajo que hacer')
else:
    print('puede asistir al juego')

"""
"""
# Ejercicio: Rango entre 20 y 30 años 

edad = int(input("Digite su edad: "))
#  veinte = edad >= 20 and edad < 30
# print(veinte)
# treinta = edad >= 30 and edad < 40
# print(treinta)

#if veinte or treinta:
if (20 <= edad < 30) or (30 <= edad < 40): # Sintaxis simplificada del operador and
    print("Estas dentro del rango de los (20'0)a (30\'0) años")
#     if veinte:
#        print("estas dentro del rango de los 20'0) años")
#     elif treinta:
#        print("Estas dentro de los (30'0) años")
#     else:
#        print("no estas dentro del rango")
else:
    print("no estas dentro del rango de los (20'0)a (30\'0) años")
"""
"""
# Ejercicio: El mayor de dos numeros

numero1 = int(input("Digite el valor para el numero1: "))
numero2 = int(input("Digite el valor para el numero2: "))

if numero1 > numero2:
    print("El numero 1 es mayor")
else:
    print("El numero 2 es mayor")
"""

# Ejercicio: Tienda de libros

print("Digite los siguientes datos del libro: ")
nombre = input("Digite el nombre del libro: ")
id = int(input("Digite el ID del libro: "))
precio = float(input("Digite el precio del libro: "))
envioGratuito = input("Indicar si el libro es gratuito (True/False): ")
if envioGratuito == "True":
    envioGratuito = True
elif envioGratuito == "False":
    envioGratuito = False
else:
    envioGratuito = "El valor es incorrecto, debe escribir True/False"
print(f'''
        Nombre: {nombre}
        Id: {id}
        Precio: {precio}
        Envio Gratuito: {envioGratuito}
''')
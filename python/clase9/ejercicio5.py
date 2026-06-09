# Ejercicio 5: Calcular el factorial de un numero mayor o igual a 0.

num = int(input("Digite un numero: "))

while num <= 0:
    print("Error: Debe ingresar un numero mayor que 0")
    num = int(input("Digite un numero: "))

i = 1
factorial = 1

while i <= num:
    factorial = factorial * i
    i = i + 1
print("El factorial es: ", factorial)
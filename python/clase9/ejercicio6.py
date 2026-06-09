n_elementos = int(input("Ingrese la cantidad de números: "))
i = 1
suma_pares = 0
conteo_pares = 0
suma_impares = 0
conteo_impares = 0

while i <= n_elementos:
    num = int(input(f"{i}. Ingrese un numero: "))

    if num % 2 == 0:
        suma_pares += num
        conteo_pares += 1
    else:
        suma_impares += num
        conteo_impares += 1
    i += 1

if conteo_pares == 0:
    print("No se han ingresado números pares.")
else:
    print(f"La suma de los números pares es: {suma_pares}")
    print(f"Cantidad de números pares que existen: {conteo_pares}")

# Resultados de números impares
if conteo_impares == 0:
    print("No se han ingresado números impares.")
else:
    promedio_impares = suma_impares / conteo_impares
    print(f"El promedio de impares es: {promedio_impares}")
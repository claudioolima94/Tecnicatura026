# opcion = 1

# while opcion == 1:  # Mientras el usuario ponga 1, se repite
#     print("Comprobamos que año es bisiesto")
#     anio = int(input("Ingrese el anio: "))
    
#     if (anio % 4 == 0 and anio % 100 != 0) or (anio % 400 == 0):
#         print("El anio es Bisiesto")
#     else:
#         print("El anio no es Bisiesto")
    
#     opcion = int(input("Para seguir adelante digite la opcion 1: "))

# print("Fin del proceso")

# Definir N, suma, i como entero
# suma = 0

# # Digite la cantidad de numeros a sumarse
# N = int(input("Digite la cantidad de numeros a sumarse: "))

# # i desde 1 hasta N
# for i in range(1, N + 1):
#     suma = suma + i  # suma += i

# # La suma es: suma
# print("La suma es:", suma)

# Definir num, i como Entero
# Definir conteo_positivos, conteo_negativos, conteo_neutros como Entero

conteo_positivos = 0
conteo_negativos = 0
conteo_neutros = 0

# i desde 1 hasta 10
# for i in range(1, 11):
#     num = int(input(f"Digite un numero {i}/10: "))
    
#     if num > 0:
#         conteo_positivos += 1  # conteo_positivos = conteo_positivos + 1
#     elif num < 0:
#         conteo_negativos += 1
#     else:  # num == 0
#         conteo_neutros += 1

# # Imprimir resultados
# print("La cantidad de positivos es:", conteo_positivos)
# print("La cantidad de negativos es:", conteo_negativos)
# print("La cantidad de neutros es:", conteo_neutros)

# Definir calificacion, promedio, calificacion_baja, suma como Real
# Definir i como Entero

suma = 0
calificacion_baja = 99999  # Arranca muy alto para que cualquiera sea menor

for i in range(1, 11):
    calificacion = float(input(f"Digite una calificacion {i}/10: "))
    
    suma = suma + calificacion  # Suma interactiva
    
    if calificacion < calificacion_baja:
        calificacion_baja = calificacion  # Guarda la menor

calificacion_promedio = suma / 10

print("La calificacion promedio es:", calificacion_promedio)
print("La calificacion mas baja es:", calificacion_baja)
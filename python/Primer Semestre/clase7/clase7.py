# Ciclo while (Mientras o durante)
# contador = 0
# while contador < 78:
#     print('Ejecutamos nuestro ciclo while ', contador)
#     contador += 1
# else:
#     print('Fin del ciclo while')

# maximo = 5
# contador = 0
# while contador <= maximo:
#     print(contador)
#     contador += 1
    
    
# minimo = 1
# contador = 5
# while contador >= minimo:
#     print(contador)
#     contador -= 1

#Ciclo for

# cadena = "Hello"
# for letra in cadena:
#     print(letra)
    
# else:
#     print("fin del ciclo for")

#Palabra reservada break
# for letra in "Alemania":
#     if letra == "a":
#         print(f"Letra encontrada: {letra}")
#         break
# else:
#     print("Fin del ciclo for")
    
#Palabra reservada continue

for i in range(6):
    if i % 2 != 0:
        continue
    print(f"valor: {i}")
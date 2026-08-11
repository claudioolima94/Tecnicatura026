mes = int(input("Ingrese un mes del año (1-12): "))

if mes >= 1 and mes <= 3:
    print("La estacion es Verano")

elif mes >= 4 and mes <= 6:
    print("La estacion es Otoño")

elif mes >= 7 and mes <= 9:
    print("La estacion es Invierno")

elif mes >= 10 and mes <= 12:
    print("La estacion es Primavera")

else:
    print("Mes invalido")
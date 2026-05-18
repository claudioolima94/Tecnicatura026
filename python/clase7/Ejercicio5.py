nota = float(input("Ingrese una calificacion del 0 al 10: "))

if nota >= 9 and nota <= 10:
    print("Exelente")

elif nota >= 8 and nota < 9:
    print("Muy Bien")

elif nota >= 7 and nota < 8:
    print("Bien")

elif nota >= 6 and nota < 7:
    print("Regular")

elif nota >= 0 and nota < 6:
    print("Mal")

else:
    print("El valor ingresado es incorrecto")
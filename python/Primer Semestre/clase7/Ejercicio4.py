edad = int(input("Ingrese su edad "))

if edad >= 0 and edad <= 10:
    print("La infancia es increible y bella")

elif edad >= 11 and edad <= 19:
    print("Tienes muchos cambios, mucho que estudiar")

elif edad >= 20 and edad <= 29:
    print("Amor y comienza el trabajo")

elif edad >= 30 and edad <= 59:
    print("Etapa de mucho trabajo y responsabilidades")

elif edad >= 60:
    print("Tiempo de descansar y disfrutar la vida")

else:
    print("edad invalido")
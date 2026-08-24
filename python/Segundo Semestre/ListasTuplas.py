# Lista = Claudio, German, Veronica, Gema

nombres = ["Claudio", "German", "Veronica", "Gema"]
""""
print(nombres)
print(nombres[0])
print(nombres[1])
print(nombres[3])
print(nombres[-3])
print(nombres[-2])
"""

print(nombres)
print(nombres[0:2]) #Solo muestra el indice 0, 1 pero no el indice 2
#ir del inicio de la lista alindice (sin incluirlo)
print(nombres[ :3]) # Indices a mostrar 0, 1, 2
#desde el indice indicado hasta el final
print(nombres[1: ])
# Modificamos un valor 
nombres[2] = "Marcelo"
nombres[0] = "Sebastian"
print(nombres)
# Iterar una lista
for nombre in nombres: # nombre es singular, la lista es plural
    print(nombre)
else:
    print('se acabaron los elementos de la lista')

# Preguntamos cuantos elementos tiene 
print(len(nombres)) # le pasamos como parametro la lista

# Agregamos un elemento

nombres.append('Juan')
print(nombres)

# Insertar un elemento e un indice especifico

nombres.insert(1,'Lidia')
print(nombres)
nombres.insert(3, 'Micaela')
print(nombres)

# Eliminamos un elemento
nombres.remove('Micaela')
print(nombres)

# Eliminar el ultimo elemento
nombres.pop()
print(nombres)

# Eliminar un indice especifico
del nombres[2] # Del significa delete (eliminar)
print(nombres)

# Eliminar, borrar o limpiar todos los elementos
nombres.clear()
print(nombres)

# Eliminar la lista
del nombres
# print(nombres) #Aqui nos muestra error

#Definimos una tupla
cocina = ('cuchara', 'cuchillo','tenedor')
print(len(cocina))

# Acceder a un elemento, para esto utilizamos corchets no parentesis
print(cocina[0])

# Mostrar de manera inversa
print(cocina[-1])

# Acceder a un  rango
print(cocina[0:2])
# Ejemplo 
verduras = ('papa',) #una tupla necesita aunque sea de un elemento la coma
# De lo contrario solo seria un tipo str cadena

# Recorrcomos los elementos de la tupla
for cocinar in cocina: # Print esta usando \n para saltos de lineas
    print(cocinar, end=' ') # Usamos end= para eliminar los saltos de linaes

cocinaLista = list(cocina)
cocinaLista[0] = 'Plato'
cocina = tuple(cocinaLista)
print('\n', cocina)

# del cocina es para eliminar la tupla

# Tipo set 

planetas = {'marte', 'Jupiter', 'Venus'}
print(len(planetas)) # Usamos la funcion len = length significa largo

#Revisar si un elemento existe dentro de set
print('Jupiter' in planetas)

# Agregar un elemento 
planetas.add('Tierra') # add es una funcion
print(planetas)

# Eliminar elementos, puede arrojar un error si el elemento no existe
planetas.remove('Jupiter')
print(planetas)
planetas.discard('Tierra') # Esta funcion no nos precenta ningun error
print(planetas)

# Limpiar set
planetas.clear()
print(planetas)

# Eliminar set o conjunto
del planetas
#print(planetas) # Al eliminar nos muestra fun error

# 'Maradona' :10 Un diccionario esta compuesto por dos elementos
# UNA LLAVE Y UN VALOR
# DICT(KEY,VALUE)
diccionario = {
    'IDE':'Integrated Development Environment',
    'POO':'Programacion Orientada a Objetos' ,
    'SABD':'Sistema de Administracion de Base de Datos'
}
# Verificar la cantidad de elementos del diccionario
print(len(diccionario))
print(diccionario)

# Acceder a un diccionario con la llave(key)
print(diccionario['IDE'])

# Otra forma de recuperar otro elemento
print(diccionario.get('POO'))
print(diccionario.get('SABD'))

# Modificamos elementos
diccionario['IDE'] = 'Entorno de Desarrollo Integrado'
print(diccionario)

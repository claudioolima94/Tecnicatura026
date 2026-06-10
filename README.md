Abrimos la terminal de Git Bash en Window o la terminal de Ubuntu, tambien la terminal de Mac, y comenzamos con los siguientes comandos y creación de directorios

pwd #Vemos la ruta de la carpeta en la que estamos

cd #Es para navegar a una carpeta: change directory -> cambiar de directorio

cd / #Nos llava al home, en la raíz del disco

cd ~ #La virgulilla significa que estamos en el lugar de los documentos o del usuario

ls #Esto es listar los archivos, nos muestra todos los archivos en la raíz

ls -al #El espacio -al significa que es un argumento especial para ver archivos ocultos

#Usar la flecha hacía arriba nos muestra el último comando utilizado

ls -l #Muestra casi todos los archivos sin los que están ocultos

ls -a #Muestra el grupo de archivos pero no en una lista

clear #Limpia la consola o ctrl + l

cd .. #Nos devuelve a la carpeta anterior

cd U + tab #Esto se usa para un autocompletado o para buscar una referencia

cd /D #Cambiamos de disco en window

df -h #Muestra todos los directorios en Ubuntu

cd /mnt/d #Cambia de directorio usando WSL Ubuntu en window

AHORA COMENZAMOS CON LA CREACIÓN DE CARPETAS

Lo vamos a hacer justos desde zoom

cd ..

cd ..

cd /mnt/c

cd ~ #Vamos a la raíz

mkdir Tecnicatura #Recordar que en window las mayúsculas no tienen relevancia, pero si en Linux

cd tecnicatura

mkdir Python touch vacio.txt #Crea un archivo con su extención: ESCRIBIR DENTRO

ctrl + s #Guardamos lo que escribimos en el archivo

./ #Significa la carpeta actual

../ #Significa la carpeta anterior

cat vacio.txt #Vemos el contenido del archivo

history #Veremos la historia completa de los comandos que hemos utilizado

!72 + enter #Veremos el comando que utilizamos en ese número

history -c #Borramos todos los comando que se han ido guardando

rm vacio.txt #Borra el archivo seleccionado, ¡¡¡¡CUIDADO!!!!

rm --help #Muestra como funciona el comando

CREAR UN REPOSITORIO DE GIT Y HAZ TU PRIMER COMMIT

cd tecnicatura

mkdir class-git

cd class-git #Entramos en la carpeta que necesitamos trabajar

git init #Creamos un repositorio en la carpeta central, se crea el archivo .git

IMPORTANTE: SI YA ESTA CREADO EL REPOSITORIO NO SE DEBE VOLVER A PONER ESTE COMANDO

code . #Abrimos VSC, el punto hace que se abra el archivo en el que estamos situados

ctrl + n #Creamos un archivo nuevo y escribimos en el, como lo hicimos antes

ctrl + s #Guardamos poniendo el nombre: historia.txt

git status #Vemos el estado del proyecto en tiempo real, esta en el área de trabajo

git add historia.txt #Enviamos el archivo al área de preparación

git status #Para ver el estado de cambios

git rm --cached historia.txt #Quitamos el archivo del área de preparación, cached significa que esta en memoria ram

git config #Tedremos la lista de como funciona la configuración

git config --list #Configuraciones por defecto, faltan cosas importantes

git config --list --show-origin #Veremos donde están las configuraciones guardadas

LAS CONFIGURACIONES SI ESTÁN HECHAS NO SE DEBEN HACER DE NUEVO

git config --global user.name "Ariel Betancud"

git config --global user.email "betancudariel@gmail.com" #El correo debe ser el mismo que usaremos en GitHub

git config --list #Ahora veremos que ya están todos los datos completos

git add . #Ingresamos todos los archivos al área de preparación (ram)

git commit -m "Mensaje importante del commit" #El primer commit esta hecho

code . #Hacemos cambios en el archivo y guardamos

git status #Hay cambios para commitear

git add .

git commit -m "Mi segundo commit"

git log historia.txt #Vemos toda la historia de este archivo, el número largo es el hash del commit

Abrir git bash en Window o la terminal de Linux o de Mac: al abrir Git Bash hacerlo como administrador, en terminal también o usar sudo para permisos especiales.

cd tecnicaturagit #Ingresamos al direcotorio donde están nuestras carpetas de trabajo

ls #Vemos los archivos y directorios que ya tenemos

cd git #No hay nada

cd .. #Salimos

rm historia.txt #Eliminamos el archivo que habíamos hecho, esto en git bash (window) esto es para practica

rm Git #rm: cannot remove 'Git': Is a directory

rm --recursive -R Git #By default, rm does not remove directories. Use the --recursive (-r or -R) arguments

option to remove each listed directory, too, along with all of its contents. Esto es para practica

rm --help #Nos muestra lo que les puse arriba como documentación en Inglés.

mkdir class-git #Creamos la carpeta o directorio para trabajar en Git local por ahora.

cd class-git #Entramos para crear el README.md para este sector.

touch README.md #Vamos a crear un archivo nuevo, md significa markdown y se pueden trabajar con editores de texto, este es un lenguaje que transforma el texto a html.

Enlace a la documentación en GitHub de MARKDOWN

Leemos la documentación para ir creando en README.md como lo enseña GitHub.

code . #Abrimos VSC para editar el archivo.

Empezamos a cargar lo visto en las clases anteriores (Comandos) en el README y pasamos a commitear

git status

git add .

git status

git commit -m "Cargamos el README dentro del directorio class-git"

git status

git log #Para ver los dos commits hechos: Si tienes commiteada alguna clase anterior veras mas commits de los que yo tengo.

cd ..

cd ..

cd tecnicatura # Entro a la carpeta tecnicatura cd class-git # Entro a la subcarpeta class-git ls # Listo archivos y carpetas para ver qué hay touch historia.txt # Creo el archivo historia.txt vacío code . # Abro VSCode en la carpeta actual #Modificamos el archivo historia.txt colocando lo siguiente: Bienvenido mi nombre es Verito ctrl + s # Guardo los cambios en VSCode git status # Veo el estado: historia.txt aparece en rojo como "sin trackear" git add . # Agrego todos los archivos modificados al área de staging git status # Veo el estado: historia.txt ahora está en verde listo para commit git commit # Abre vim para escribir el mensaje del commit sin usar -m #Agregar mensaje y salir con Esc # Presiono Escape para salir del modo insertar en vim :wq! + enter # Escribo :wq! y Enter para guardar y salir de vim Esc + shift + z + z # Otra forma #Agregamos otra línea de mensaje en historia.txt desde VSC: estoy estudiando programación

ctrl + s

git add .

git commit

#Se abre un editor de código basado en línea de comandos, editor de texto como VSC llamado vim

Esc + i #Para comenzar a escribir mensaje del commit, no suele ser necesario

ctrl + x #Para salir en linux

s + enter #Para decir si al cambio y aceptar el nombre, ósea no cambiamos el nombre, la (s) es de si y la (y) es de yes, no olvidar enter en linux

git show #Vemos todos los cambios en el último commit

git log historia.txt #Vemos todos los commit

q #Para salir del registro de commits

#Copiamos un hash mas antiguo y otro reciente, ingresamos el siguiente comando

git diff hash_commit_numerico hash_commit_numerico #Comparamos diferentes commits y sus cambios, poner la versión mas vieja primero, luego la mas nueva

q #Para salir

cd ..

cd ..

TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.

cd tecnicatura # Entro a la carpeta tecnicatura cd class-git # Entro a la subcarpeta class-git ls # Listo archivos y carpetas del directorio actual touch historia.txt # Creo el archivo vacío historia.txt cd .. # Subo un nivel, vuelvo a la carpeta anterior code . # Abro VSCode en la carpeta actual para editar historia.txt #Agamos cambios en el archivo historia.txt git commit -a # Agrega todos los cambios y abre vim para editar el mensaje del commit #Abrimos el vim para editar el commit esc + i # i = modo insertar en vim para poder escribir #Esto para escribir esc # Esc = salgo del modo insertar en vim #Para poner el comando de salida del editor :wq! # :wq! = guardo y salgo de vim, w=write q=quit !=forzar #Comando para salir del editor git log # Muestro el historial completo de commits #Vemos los commit hechos hasta ahora git show # Muestro detalles del último commit y sus cambios git log --oneline # Muestro historial resumido con hash corto de cada commit #Copiamos el hash corto del commit seleccionado Copiar el hash # Copio el código hash largo o corto del commit #El número largo que tiene el commit después de un git log o el hash corto git reset hash-nombre-commit # Vuelvo a ese commit, por defecto es --mixed #Este nos permite volver a una versión anterior, hay 2 tipos de reset: el duro y el suave git status # Veo el estado actual, los cambios quedan en staging con --soft #Veremos que por default hizo un reset suave --soft y quedaron los cambios en el working git add . # Agrego todos los cambios al staging area #Volvemos a commitear git commit -m "Agregamos datos de estudios en historia.txt" # Hago commit con mensaje directo git config --list # Muestro toda la configuración de git: usuario, email, etc #Veremos la configuración que ya hemos hecho con en nombre y email git log --oneline # Muestro historial resumido para copiar hash #Copiar hash git reset --hard hash # Vuelvo al commit y borro todos los cambios posteriores #Es el duro, todo vuelve a su estado anterior, es el más usado, desaparece todo #Crear, modificar y commitear de nuevo el archivo historia.txt dejar cosas en el staging git reset --soft hash # Vuelvo al commit pero dejo todo en staging para recomitear #Este es el suave, lo que tengamos en staging segirá allí git diff # Muestro diferencias entre working directory y staging #y nos muestra TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.

cd tecnicatura # Entro a la carpeta tecnicatura cd class-git # Entro a la subcarpeta class-git ls # Listo los archivos y carpetas que hay en el directorio actual touch historia.txt # Creo el archivo vacío historia.txt cd .. # Subo un nivel, vuelvo a la carpeta padre tecnicatura code . # Abro VSCode en la carpeta actual #Agamos cambios en el archivo historia.txt git commit -a # Agrega todos los cambios modificados y abre vim para escribir el mensaje #Abrimos el vim para editar el commit esc + i # i = entro en modo insertar en vim para poder escribir #Esto para escribir esc # Esc = salgo del modo insertar en vim #Para poner el comando de salida del editor :wq! # :wq! = guardo y salgo de vim. w=write q=quit !=forzar #Comando para salir del editor git log # Muestro el historial completo de commits con autor, fecha y mensaje #Vemos los commit hechos hasta ahora git show # Muestro el detalle del último commit: qué cambió línea por línea git log --oneline # Muestro historial resumido con hash corto + mensaje #Copiamos el hash corto del commit seleccionado Copiar el hash # Copio el código hash largo o corto del commit que quiero usar #El número largo que tiene el commit después de un git log o el hash corto git reset hash-nombre-commit # Vuelvo a ese commit. Por defecto hace --mixed #Este nos permite volver a una versión anterior, hay 2 tipos de reset: el duro y el suave git status # Veo el estado: con --soft los cambios quedan en staging #Veremos que por default hizo un reset suave --soft y quedaron los cambios en el working git add . # Agrego todos los archivos modificados al staging area #Volvemos a commitear git commit -m "Agregamos datos de estudios en historia.txt" # Creo commit con mensaje directo sin abrir vim git config --list # Muestro toda la configuración de git: user.name, user.email, etc #Veremos la configuración que ya hemos hecho con en nombre y email git log --oneline # Muestro historial resumido para copiar el hash #Copiar hash git reset --hard hash # Vuelvo a ese commit y BORRO todos los cambios posteriores #Es el duro, todo vuelve a su estado anterior, es el más usado, desaparece todo #Crear, modificar y commitear de nuevo el archivo historia.txt dejar cosas en el staging git reset --soft hash # Vuelvo al commit pero dejo todo en staging para modificar y recomitear #Este es el suave, lo que tengamos en staging segirá allí git diff # Muestro diferencias entre disco y staging/working directory #y nos muestra los cambios en memoria ram y en disco git add . # Paso todos los cambios al staging area #Agregamos todo al staging git status # Verifico que todo esté en verde, listo para commit #Ya esta todo en memoria ram, a git solo le importan los archivos, guarda las carpetas como rutas y automaticamente las crea git commit -m "Commiteamos lo último de hoy" # Guardo snapshot definitivo con mensaje git log # Veo historial sin los commits borrados por el --hard #vemos lo nuevo que hemos hecho sin lo que borramos con el reset fuerte hacer cambios en historia.txt # Edito y modifico la última línea del archivo #Cambiamos la última línea y ctrl + s # Guardo los cambios en VSCode git diff # Veo qué líneas cambié antes de pasar a staging #Agregar cambios al archivo historia.txt una vez más git commit -am "cambio en la última línea del historia.txt" # add + commit en un solo paso para archivos ya trackeados git log # Muestro historial actualizado con el nuevo commit q # q = salgo de la vista de git log #Esto para salir git log --stat # Muestro historial con estadísticas: archivos cambiados y líneas #veremos los cambios especificos que hicimos en cuales archivos por medio del commit y veremos los cambios en bits q # Salgo de git log --stat #salimos de la línea de commits, ahora queremos ver como era originalmente el archivo, osea la primera versión, copiamos el nombre del primer commit git checkout hash # Viajo en el tiempo al estado del archivo en ese commit viejo #Veremos el archivo en su estado original git status # Veo que estoy en "detached HEAD" git checkout master # Vuelvo a la rama principal master/main con la última versión #Volvemos a la versión master del archivo historia.txt git checkout hash # Vuelvo otra vez al commit viejo para modificar cosas #Volvemos a hacer esto y cambiamos cosas del archivo git commit -am "Reemplazo de una versión por otra de la historia" # Hago nuevo commit desde el commit viejo git log # Veo que se creó un historial alternativo/fork #Veremos un nuevo hash para el nuevo commit, se recomienda esta tecnica para quitar posibles errores no encontrados, desde aquí se debe crear una nueva rama para guardar estos cambios y continuar desde lo que si esta funcionando. git branch cambios # Creo rama nueva llamada cambios para trabajar separado #Por esto es que se recomienda trabajar con ramas secundarias, con nombres alternativos, nombres practicos, release, hotfix, etc. y las ramas primarias no se deben tocar, las ramas primarias son master o main y una segunda que podemos poner de nombre second, develop, etc. git checkout master # Vuelvo a la rama master git branch second # Creo rama de desarrollo llamada second #Creamos las ramas de trabajo git branch tuNombre # Creo rama personal con mi nombre git branch hotfix # Creo rama para arreglos urgentes git branch # Listo todas las ramas. * = rama actual donde estoy parado #Vemos las ramas que tenemos git branch -d cambios # Borro rama cambios si ya fue mergeada #Borramos la rama, si no se borra utilizar git branch -D cambios # Borro rama cambios a la fuerza aunque no esté mergeada cd .. # Subo un nivel de carpeta cd .. # Subo otro nivel más TAREA -> AGREGAR LOS COMENTARIOS EN LOS COMANDOS, PARA SABER QUE PASA CON CADA UNO.

Hagan esto si quieren hacer pruebas:

cd tecnicatura # Vamos a hacer pruebas, es por esto que creamos una carpeta nueva cd practicas # Entramos en la carpeta practicas touch reset_file.txt # Creo el archivo vacío reset_file.txt #Agregar información y hacer uno a dos commits git add reset_file.txt # Agrego solo reset_file.txt al staging area git add . # Agrego todos los archivos modificados de la carpeta al staging git commit -m"Iniciando el primer commit" # Creo el primer commit con mensaje, guardando snapshot del archivo

#Comenzar con las pruebas de git reset

¿Cómo funciona Git Reset en tu flujo de trabajo?

Git reset permite moverte entre diferentes commits para deshacer o rehacer cambios. Git guarda todo lo nuevo del repositorio como commits, que son instantáneas del estado del código en un momento dado y existen variaciones de este comando.
Variaciones de Git Reset git reset --soft # Borra el historial y los registros de Git de commits anteriores, pero guarda los cambios en Staging para aplicar las últimas actualizaciones a un nuevo commit git reset --hard # Deshace todo, absolutamente todo. Toda la información de los commits y del área de staging se elimina del historial git reset --mixed # Borra todo, exactamente todo. Toda la información de los commits y del área de staging se elimina del historial git reset HEAD # Saca archivos del área de staging sin borrarlos ni realizar otras acciones. Esto impide que los últimos cambios en estos archivos se envíen al último commit. Podemos incluirlos de nuevo en staging con git add si cambiamos de opinión. Ten en cuenta que, si deshaces commits en un repositorio compartido en GitHub, estarás cambiando su historia y esto puede causar problemas de sincronización con otros colaboradores.

¿Qué es git reset HEAD?

git reset HEAD es un comando que te permite revertir los cambios que ya habías preparado para subir, y moverlos de vuelta a tu proyecto. Con este comando puedes cancelar los cambios que ya habías agregado, para que puedas revisarlos, modificarlos o deshacerlos antes de confirmarlos con un commit.
git rm # Por otro lado, es un comando que nos ayuda a eliminar archivos de Git sin eliminar su historial del sistema de versiones. Para recuperar el archivo eliminado, necesitamos retroceder en la historia del proyecto, recuperar el último commit y obtener la última confirmación antes de la eliminación del archivo.

Es importante tener en cuenta que git rm no puede usarse sin evaluarlo antes. Debemos usar uno de los flags siguientes para indicarle a Git cómo eliminar los archivos que ya no necesitamos en la última versión del proyecto.
Variaciones de Git rm git rm --cached # Elimina archivos del repositorio local y del área de staging, pero los mantiene en el disco duro. Deja de trackear el historial de cambios de estos archivos, por lo que quedan en estado untracked, que significa: que un archivo no está siendo rastreado por Git git rm --force # Elimina los archivos de Git y del disco duro. Git guarda todo, por lo que podemos recuperar archivos eliminados si es necesario empleando comandos avanzados. Al usar git rm lo que haremos será eliminar este archivo completamente de git

¿Cuál es la diferencia entre git rm y git reset Head?

La diferencia principal entre git rm y git reset HEAD radica en que git rm elimina archivos del repositorio y de la historia del proyecto, mientras que git reset saca los cambios del área de preparación y los mueve del espacio de trabajo, sin afectar la historia del repositorio.
Es importante tener en cuenta el efecto que cada comando tiene en el proyecto y usarlos según tus necesidades y objetivos específicos.
¿Cuándo utilizar git reset en lugar de git revert?

Para reescribir la historia del repositorio y eliminar confirmaciones anteriores, se utiliza git reset. Para deshacer cambios de confirmaciones anteriores de forma segura sin modificar la historia del repositorio, se emplea git revert.
Resumen # Para evitar problemas en el trabajo, es valioso entender las implicaciones y riesgos de cada comando y elegir el enfoque adecuado según las necesidades y el flujo de trabajo del proyecto.

Con git rm eliminamos un archivo de Git, pero mantenemos su historial de cambios. Si no queremos borrar un archivo, sino dejarlo como está y actualizarlo después, no debemos usar este comando en este commit.
Empleando git reset HEAD, movemos los cambios de Staging a Unstaged, pero mantenemos el archivo en el repositorio con los últimos cambios en los que hicimos commit. Así, no perdemos nada relevante.
Siguientes pasos # Bueno, todos los cambios están en el área de Staging, incluido el archivo con los cambios que no están listos. Esto significa que debemos sacar ese archivo de Staging para poder hacer commit de todos los demás.

Crear cambios en el archivo creado, donde vamos a hacer varios commits, para ir probando los nuevos comandos, al finalizar las pruebas, eliminar el directorio con todo su contenido.
Comandos para trabajo remoto con GIT

git clone url_del_servidor_remoto #Nos permite descargar los archivos de la última versión de la rama principal y todo el historial de cambios en la carpeta .git

git push #Luego de hacer git add y git commit debemos ejecutar este comando para mandar los cambios al servidor remoto.

git fetch #Lo usamos para traer actualizaciones del servidor remoto y guardarlas en nuestro repositorio local (en caso de que hayan, por supuesto).

git merge #También usamos el comando git merge con servidores remotos. Lo necesitamos para combinar los últimos cambios del servidor remoto y nuestro directorio de trabajo.

git pull #Básicamente, git fetch y git merge al mismo tiempo.

#Adicionalmente, tenemos otros comandos que nos sirven para trabajar en proyectos muy grandes:

git log --oneline #Te muestra el id commit y el título del commit.

git log --decorate #Te muestra donde se encuentra el head point en el log.

git log --stat #Explica el número de líneas que se cambiaron brevemente.

git log -p #Explica el número de líneas que se cambiaron y te muestra que se cambió en el contenido.

git shortlog #Indica que commits ha realizado un usuario, mostrando el usuario y el título de sus commits.

git log --graph --oneline --decorate --all

git log -3 #Limitamos el número de commits.

git log --after=“2018-1-2”

git log --after=“today”

git log --after=“2018-1-2” --before=“today” #Commits para localizar por fechas.

git log --author=“Name Author” #Commits hechos por autor que cumplan exactamente con el nombre.

git log --grep=“INVIE” #Busca los commits que cumplan tal cual está escrito entre las comillas.

git log --grep=“INVIE” –i #Busca los commits que cumplan sin importar mayúsculas o minúsculas.

git log – index.html #Busca los commits en un archivo en específico.

git log -S “Por contenido” #Buscar los commits con el contenido dentro del archivo.

git log > log.txt #guardar los logs en un archivo txt

Repasa: ¿Qué es Git?

Cómo funcionan las ramas en GIT Las ramas son la manera de hacer cambios en nuestro proyecto sin afectar el flujo de trabajo de la rama principal. Esto porque queremos trabajar una parte muy específica de la aplicación o simplemente experimentar.

git branch nombre-rama #Con este comando se genera una nueva rama.

git checkout nombre-rama #Con este comando puedes saltar de una rama a otra.

git checkout -b rama #Genera una rama y nos mueve a ella automáticamente, Es decir, es la combinación de git branch y git checkout al mismo tiempo.

git reset id-commit #Nos lleva a cualquier commit no importa la rama, ya que identificamos el id del tag., eliminando el historial de los commit posteriores al tag seleccionado.

git checkout rama-o-id-commit #Nos lleva a cualquier commit sin borrar los commit posteriores al tag seleccionado.

Vamos a hacer una practica: mientras la rama master esta cambiando normalmente, vamos a crear una rama paralela que va a crear nuevas secciones: osea una sección y a esta rama la vamos a llamar segunda(second) y con esto, la vamos a fusionar para ver como queda en la rama master y así entender el flujo de ramas entre git. Al crear otra rama estamos creando una copia de todos los commit que ya tiene la rama master en la nueva rama y todos los cambios que hagamos en esta nueva rama, no los va a ver la rama master, hasta que no la volvamos a fusionar con un proceso que se llama merge.

Abrir terminal #En ubuntu

Abrir como adminstrados git bash #En window

cd Tecnicatura

cd class-git

code . #En ubuntu

code . #En window, abrir como administrador, generar cambios desde VSC

touch index.html #Cargamos un h1 con nuestro nombre

ctrl + s #Guardamos

clic mouse derecho #Abrimos en el navegador con Live Server vemos los cambios

git status

git commit -am "mensaje del commit" #Este solo funciona con archivos creado previamente

git commit -a -m "Mensaje del commit" #Esto es lo mismo que el anterior

git commit -a + enter #Se abrira el entorno para editar el vim con el mensaje

esc + i #Escribir el mensaje

esc

:wq! #esto en window

ctrl + x #Esto en linux

s + enter #No cambiar el nombre ni ruta de ubicación

git log #Veremos los cambios guardados

q #Para salir

git log --stat #Veremos los cambios nombrando cada archivo

q #Para salir

git branch #Muestra en la rama que estamos, desde aquí crearemos una nueva

git show #Muestra el último cambio que hicimos, esto significa que desde el HEAD -> master es que haremos cambios

q #Para salir

ctrl + l #Limpiamos consola

git branch second #creamos una nueva rama llamada second

git show #Nos muestra ahora que esta en el HEAD -> master, cabecera aquí es donde esta apuntando, es decir el último commit esta pegado a dos ramas distintas, aunque todavía estemos en master

q #Para salir

git status #No hay nada para hacer commit

git chekout second #Nos movemos hacía otras ramas, en este caso a second, esto no se ve en mac ni en ubuntu, para ver donde estamos hay que ingresar...

git branch #veremos en que rama estamos ubicados o ingresando...

git status #Veremos en que HEAD estamos apuntando

mkdir Java

mkdir JavaScript

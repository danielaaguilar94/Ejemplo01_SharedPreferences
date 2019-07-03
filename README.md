# Ejemplo01_SharedPreferences

Ejemplo de prueba implementando SharedPreferences y persistencia de datos.
Se compone de dos componentes EditText, dos botones, Guardar y Cargar, y dos TextViews en el activity principal o
primer Activity llamado MainActivity, se hacen referencias de las views, se ejecuta el método cargarPreferencias 
y se ejecutan las acciones a realizar por cada botón 
en el método sobreescrito onClick, en el cual si se produce la acción de dar clic al botón Guardar, 
se crea el SharedPreferences, en donde se define el nombre del archivo donde se guardaran los datos de usuario y contraseña
o credenciales, se define el modo de seguridad.
Seguido de esto se obtienen los datos de los TextView, se hace uso del editor de SharedPreferences en el cual podemos almacenar 
los dos datos en el archivo mediante un identificador para cada dato, y en el modo visual se muestran los datos obtenidos 
de los EditText en los TextViews.

Para cargar esos datos se ejecuta el método cargarPreferencias()  en el onCreate seguido despues de las referencias de las views
el cual leerá el archivo de credenciales cada que inicie la actividad, y los mostrará en el TextView. Por otra parte para cargar esos
datos y llevarlos a la segunda actividad o pantalla llamada ConsultaPreferencias el cual tomará el intent y checará si se envío algo
en el Bundle, y es así se eejecuta la acción de leer cada campo enviado en el bundle y se muestra en los EditText de esta segunda pantalla.
Para ver la creación del archivo "credenciales", basta con ir en el emulador o en el dispositivo en el que se probó la aplicación,
en mi caso data/data/nombredelproyectoAndroid/shared_prefs/ y dentro de esa carpeta se verá el archivo credenciales con formato
xml.

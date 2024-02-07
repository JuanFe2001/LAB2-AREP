## Escuela Colombiana de Ingeniería
### Arquitecturas Empresariales – AREP
# Lab1-AREP
#### TALLER 1: APLICACIONES DISTRIBUIDAS (HTTP, SOCKETS, HTML, JS,MAVEN, GIT)
Para este laboratorio Debemos construir una aplicación para consultar la información de películas de cine.  La aplicación recibirá una frase de búsqueda del título, por ejemplo “Guardians of the galaxy”  y deberá mostrar el los datos de la película correspondiente. Para esto utilice el API gratuito de https://www.omdbapi.com/ (Puede crear obtener una llave gratuita para realizar consultas). Se le pide que su implementación sea eficiente en cuanto a recursos así que debe implementar un Caché que permita evitar hacer consultas repetidas al API externo.
## Elementos necesarios 
Para poder ejecutar o correr el proyecto se necesitan unos requisitos minimos los cuales son:
* [Tener Instalado Maven](https://maven.apache.org/download.cgi)
* [Git](https://git-scm.com/downloads)
* [Tener una version de Java 17 o mas](https://www.oracle.com/co/java/technologies/downloads/)

## La aplicacion cuenta con 4 clases las cuales son

**MovieServer**: La clase actúa como servidor para una aplicación web de consulta de información de películas.

**APIRestMovies**: Actúa como interfaz para realizar solicitudes a una API REST que proporciona información sobre películas.

**Cache**: Gestiona una caché de información de películas utilizando un ConcurrentHashMap.

**Main**: Tiene como propósito general iniciar la aplicación del servidor de películas.

## Clonar el Repositorio

Lo primero que tienes que hacer para probar el proyecto para esto debes clonar este repositorio con el siguiente comando
 **git clone (URL del Repositorio)** 
 
 Una vez hecho esto ya puedes correr el proyecto

### Corriendo el proyecto
Para correr el proyecto se puede de dos formas:

## POR CONSOLA
Por consola nos metemos hasta la carpeta Lab1 del proyecto y desde ahi ponemos los siguientes comandos

* mvn clean compile
* mvn exec:java
El primer comando nos ayudara a compilar el proyecto y el segundo a ejecutarlo
## DIRECTAMENTE DEL IDLE
Si queremos ejecutarlo de la otra forma solo tenemos que correr la clase Main con ayuda de nuestro IDLE

## NOTA:
En los dos casos lo mas recomendable para ver el funcionamiento de la pagina es utilizar el Navegador de FireFox

## Funcionamiento:
Una vez veamos en la consola el mensaje listo para recibir podemos ver la pagina poniendo http://localhost:35000/ en FireFox
Debe aparecernos asi
![image](https://github.com/JuanFe2001/Lab1-AREP/assets/123691538/b2e2a7d0-8c19-43bd-aeb8-a28124b896fb)
Y al hacer la consulta debera aparecernos asi:
![image](https://github.com/JuanFe2001/Lab1-AREP/assets/123691538/cfb6a610-a0a3-452b-9955-c03c6c726873)

# Generar el JavaDoc
Para Generar el JavaDoc en la consola en la carpeta Lab1 por consola ponemos el siguiente comando
mvn site
Este comando generara el JavaDoc y lo guardara en la carpeta site mas especificamente en esta direccion

## \Lab1-AREP\Lab1\target\site

## Autor
* Juan Felipe Vivas Manrique










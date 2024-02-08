## Escuela Colombiana de Ingeniería
### Arquitecturas Empresariales – AREP
# LAB2-AREP
#### TALLER 2: DISEÑO Y ESTRUCTURACIÓN DE APLICACIONES DISTRIBUIDAS EN INTERNET
En este taller se exploro la arquitectura de las aplicaciones distribuidas. Concretamente, exploraramos la arquitectura de  los servidores web y el protocolo http sobre el que están soportados. 
Escribimos un servidor web que soporte múlltiples solicitudes seguidas (no concurrentes). El servidor lee los archivos del disco local y retornar todos los archivos solicitados, incluyendo páginas html, archivos java script, css e imágenes. Construimos una aplicación web con  javascript, css, e imágenes para probar su servidor. Incluya en la aplicación la comunicación asíncrona con unos servicios REST en el backend. NO use frameworks web como Spark o Spring, use solo Java y las librerías para manejo de la red.
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

## Adicionalmente
Se añadieron archivos css, js y html, el servidor retorna estos archivos como lo veremos a continuacion

## POR CONSOLA
Por consola nos metemos hasta la carpeta Lab1 del proyecto y desde ahi ponemos los siguientes comandos

* mvn clean compile
* mvn exec:java
El primer comando nos ayudara a compilar el proyecto y el segundo a ejecutarlo
## DIRECTAMENTE DEL IDLE
Si queremos ejecutarlo de la otra forma solo tenemos que correr la clase Main con ayuda de nuestro IDLE

## NOTA:
En los dos casos lo mas recomendable para ver el funcionamiento de la pagina es utilizar el Navegador de FireFox

## DEMOSTRACION
![image](https://github.com/JuanFe2001/LAB2-AREP/assets/123691538/89d88e95-f9c3-4e7e-a115-705462d3509c)
Archivo HTML
![image](https://github.com/JuanFe2001/LAB2-AREP/assets/123691538/80732c17-966f-4b87-97bb-3b53840cd662)
Archivo .js
![image](https://github.com/JuanFe2001/LAB2-AREP/assets/123691538/a9b1acb7-5cb1-4c0e-9d6e-e0ec3bf21124)
Archivos .css
![image](https://github.com/JuanFe2001/LAB2-AREP/assets/123691538/c5427a24-b925-49c8-ac63-5b5f833319b0)
![image](https://github.com/JuanFe2001/LAB2-AREP/assets/123691538/7744674f-4877-403a-aa6d-84a69bcdb64d)
Imagen (Archivo .jpg)
![image](https://github.com/JuanFe2001/LAB2-AREP/assets/123691538/723b5dbb-b395-440f-b40a-62ec7a47c736)

# Generar el JavaDoc
Para Generar el JavaDoc en la consola en la carpeta Lab1 por consola ponemos el siguiente comando

* mvn site

## Autor
* Juan Felipe Vivas Manrique



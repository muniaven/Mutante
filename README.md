# Mutante
Challenge mutantes
Examen Mercadolibre
Magneto quiere reclutar la mayor cantidad de mutantes para poder luchar
contra los X-Men.
Te ha contratado a ti para que desarrolles un proyecto que detecte si un
humano es mutante basándose en su secuencia de ADN.
Para eso te ha pedido crear un programa con un método o función con la siguiente firma (En
alguno de los siguiente lenguajes: Java / Golang / C-C++ / Javascript (node) / Python / Ruby):

boolean isMutant(String[] dna); // Ejemplo Java

En donde recibirás como parámetro un array de Strings que representan cada fila de una tabla
de (NxN) con la secuencia del ADN. Las letras de los Strings solo pueden ser: (A,T,C,G), las
cuales representa cada base nitrogenada del ADN.

Sabrás si un humano es mutante, si encuentras más de una secuencia de cuatro letras
iguales​, de forma oblicua, horizontal o vertical.
Ejemplo (Caso mutante):
String[] dna = {"ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"};
En este caso el llamado a la función isMutant(dna) devuelve “true”.
Desarrolla el algoritmo de la manera más eficiente posible.
Desafíos:
Nivel 1:
Programa (en cualquier lenguaje de programación) que cumpla con el método pedido por
Magneto.
Nivel 2:
Crear una API REST, hostear esa API en un cloud computing libre (Google App Engine,
Amazon AWS, etc), crear el servicio “/mutant/” en donde se pueda detectar si un humano es
mutante enviando la secuencia de ADN mediante un HTTP POST con un Json el cual tenga el
siguiente formato:
POST → /mutant/
{
“dna”:["ATGCGA","CAGTGC","TTATGT","AGAAGG","CCCCTA","TCACTG"]
}
En caso de verificar un mutante, debería devolver un HTTP 200-OK, en caso contrario un
403-Forbidden
Nivel 3:
Anexar una base de datos, la cual guarde los ADN’s verificados con la API.
Solo 1 registro por ADN.
Exponer un servicio extra “/stats” que devuelva un Json con las estadísticas de las
verificaciones de ADN: {“count_mutant_dna”:40, “count_human_dna”:100: “ratio”:0.4}
Tener en cuenta que la API puede recibir fluctuaciones agresivas de tráfico (Entre 100 y 1
millón de peticiones por segundo).
Test-Automáticos, Code coverage > 80%.
Entregar:
● Código Fuente (Para Nivel 2 y 3: En repositorio github).
● Instrucciones de cómo ejecutar el programa o la API. (Para Nivel 2 y 3: En README de
github).
● URL de la API (Nivel 2 y 3).

///////////////////////////////////////////////////////////////////////////////////////////

La aplicación fue desarrollada con:

1. Eclipse IDE for Java Developers.
2. Java JDK 1.8
3. Jersey 2.32
4. jax-rs 2.32
5. Tomcat 9.0.44

Para ejecutar:
1. Se crea en carpeta TOMCAT_HOME/webapps/TestMagneto
2. Se crea carpeta WEB-INF dentro de TestMagneto
3. En WEB-INF se crea carpeta classes, dentro de esta caprte se copia el compilado generado en Eclipse.
4. En la carpeta WEB-INF se crea carpeta lib y se incluyen los jars de Jersey y jax-rs 2.32, pueden usar Maven para patraer las dependencias si asó lo desea.
5. en WEB-INF se copia el archivo web.xml.

Inicie Tomcat, para probar puede usar el cliente Postman o REQBIN.
En el cliente seleccionado coloque URL Ej: http://localhost:8080/TestMagneto/mutant/ismutant/, seleccionar el content-manager JSON y en el cuerpo coloque la combinación ADN deseada Ej :

{
    "dna": [
        "TTGCGA",
        "CAGTGC",
        "TTATGT",
        "AGAAGG",
        "CCTCTA",
        "TCACTG"
    ]
}





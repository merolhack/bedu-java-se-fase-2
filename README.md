BEDU Java SE: Fase 2
============

Gradle, Patrones de diseño, JUnit, Spring Boot, Thymeleaf, Spring Data

## Sesión 1 ##

Revisar tareas que puede ejecutar Gradle:

```bash
gradle tasks
```

* Ejemplo 1:

```bash
cd s1/e1
gradle hello
```

* Ejemplo 2:

```bash
cd s1/e2
gradle build
java -jar build/libs/e2.jar
```

* Ejemplo 4:

```bash
cd s1/e4
gradle run
```

### Reto ###

* Reto 1:

```bash
cd s1/r1
gradle build
java -jar build/libs/r1.jar
```

* Reto 2:

```bash
cd s1/r2
gradle run
```

### Gradle plugins ###

* Markdown Gradle Plugin: https://github.com/kordamp/markdown-gradle-plugin

```bash
gradle tasks
gradle run
gradle copyReadMe
gradle markdownToHtml
```

## Sesión 2 ##

Tipos de patrones de diseño:

* Creación: proporcionan mecanismos de creación de objetos que incrementan la flexibilidad y la reutilización de código existente.
* Estructura: explican cómo ensamblar objetos y clases en estructuras más grandes a la vez que se mantiene la flexibilidad y eficiencia de la estructura.
* Comportamiento: se encargan de una comunicación efectiva y la asignación de responsabilidades entre objetos.

### Ejercicio 1: Creación ###

Singleton: Es una referencia única a la clase

```bash
cd s2/e1
gradle build && java -jar build/libs/e1.jar
```

### Ejercicio 2: Estructura ###

```bash
cd s2/e2
gradle build && java -jar build/libs/e2.jar
```

### Reto 1: Adapter ###

```bash
cd s2/r1
gradle build && java -jar build/libs/r1.jar
```

### Ejercicio 3: Command ###

```bash
cd s2/e3
gradle build && java -jar build/libs/e3.jar
```

### PostWork ###

Desarrollar aplicación para una cadena de helados:

```bash
cd s2/pw
gradle build && java -jar build/libs/pw.jar
```

## Recursos ##

* Gradle configuration example: https://stackoverflow.com/q/47470162

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

* Creación: Diferentes maneras de crear objetos o grupos de objetos
* Estructura: Se utilizan para mejorar la modularidad, la flexibilidad, la extensibilidad y la reutilización del código.
* Comportamiento: 

### Creación ###

Singleton: Es una referencia única a la clase

```bash
cd s2/e1
gradle build && java -jar build/libs/e1.jar
```

### Estructura ###

```bash
cd s2/e2
gradle build && java -jar build/libs/e2.jar
```

### Adapter ###

```bash
cd s2/r1
gradle build && java -jar build/libs/r1.jar
```

### Command ###

```bash
cd s2/e3
gradle build && java -jar build/libs/e3.jar
```

## Recursos ##

* Gradle configuration example: https://stackoverflow.com/q/47470162

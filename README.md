# Culqi Java Example

Este es un ejemplo con [Culpi-Java 1.1.8](https://github.com/culqi/culqi-java/)

## Datos de Prueba

<table>
  <tr>
    <td>Card Number</td>
    <td>4111 1111 1111 1111</td>
  </tr>
  <tr>
    <td>Date</td>
    <td>9/20</td>
  </tr>
  <tr>
    <td>CVV</td>
    <td>123</td>
  </tr>
</table>


## ¿Cómo instalar el jar de Culqi en un proyecto Maven? 

```bash
mvn install:install-file -Dfile={dir}/culqi-java-1.1.8.jar  -DgroupId=com.culqi -DartifactId=culqi-java -Dversion={version} -Dpackaging=jar
```


Luego agregas la siguiente dependencia en el pom.xml

```xml
<dependency>
    <groupId>com.culqi</groupId>
    <artifactId>culqi-java</artifactId>
    <version>{version}</version>
</dependency>
```

## Autor

Willy Aguirre ([@marti1125](https://github.com/marti1125) - Team Culqi)

## Licencia

El código fuente de culqi-java-example está distribuido bajo MIT License, revisar el archivo [LICENSE](https://github.com/culqi/culqi-java-example-BETA/blob/master/LICENSE).

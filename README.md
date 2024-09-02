# Planeta BIES 

## Requisitos
Antes de ejecutar el proyecto, asegúrate de tener instalados los siguientes requisitos:

- **Java JDK >= 17**: Puedes descargarlo desde [Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) o usar un gestor de paquetes.
- **Apache Maven 3.9.9**: Puedes descargarlo desde [Apache Maven](https://maven.apache.org/download.cgi).


## Configuración del Proyecto

Para configurar el proyecto, sigue estos pasos:


1. **Instala las Dependencias:**

    ```bash
    mvn install
    ```

2. **Compila el Proyecto:**

    ```bash
    mvn compile
    ```

3. **Empaqueta el proyecto:**

    ```bash
    mvn package
    ```
4. **Crear el javadoc*

    ```bash
    mvn javadoc:javadoc
    ```

    
## Estilo de Código

Este proyecto sigue la guía de estilo de Google para Java. Asegúrate de que tu código cumpla con las siguientes normas:

- Usa el formato de Google Java.
- Ejecuta las herramientas de verificación y formateo antes de hacer commit.

Para verificar el estilo del código, ejecuta:

```bash
mvn checkstyle:check
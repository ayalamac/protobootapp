# Aplicación de Demostración

## Descripción
Esta es una aplicación de demostración en Java que muestra un punto de conexión "Hola" y otros para mostrar un proceso de integración continua a través de diferentes proveedores como AWS CodeBuild (con el archivo buildspec.yml), Github Actions (con el directorio .github/workflows) y pronto también en Jenkins de manera local, construyendo en la sesión un Jenkinsfile .

## Registro de cambios después del *fork* al proyecto original

| Commit ID   | Tipo     | Descripción                                               |
|-------------|----------|-----------------------------------------------------------|
| **17bf152** | test | Revert changes in code coverage limit |
| **a22faa9** | chore | Add Spring Boot Actuator features |
| **4430d84** | test | Revert changes in failing tests |
| **d9fbb43** | ci | Change java runtime to corretto17 for CodeBuild stage |
| **fd5095e** | refactor | Rename controller methods |
| **b567c26** | ci | Update workflow to use actions to v4 and better presentation |
| **225f978** | test | Update assertions to ignore localization |
| **4e45a18** | docs | Update README, adding Dependencies and Build steps included in POM file |
| **04d56be** | ci | Update table start line number and fix previous auto-update in README |
| **78e28bc** | ci | Change pipeline to automatically update the README file |
| **544900c** | docs | Update the changelog to be based on commits' titles |
| **74086bd** | docs | Add basic README file to introduce the project |
| **e596df0** | mix | Add several changes to code base |
| **bc637cb** | docs | add detailed documentation for each method |
| **e60be6d** | refactor | Rename methods to use more descriptive names |
| **18b9490** | feat | Add explicit port configuration |

## Características
- Tres endpoints `/hola`, `/cuadrado` y `/cubo`, con las funcionalidades del app
- Una clase de servicio `Calculadora.java` que tiene la lógica principal
- Pruebas unitarias creadas para los servicios de la calculadora

## Instalación
1. Realizar un *fork* de este repositorio y clonarlo a tu máquina.
2. Instalar dependencias: `mvn clean install -U`

## Uso
1. Ejecutar la aplicación: En tu IDE haz *clic* en el ícono de ejecutar. En la mayoría de IDEs, `CTRL + F5` también ejecutan la aplicación
2. Abrir el navegador y navegar a [http://localhost:8081](http://localhost:8081) o, el puerto que esté definido en la propiedad `server.port` del archivo `src/main/resources/application.properties`

## Configuración del Proyecto - POM.xml

El archivo `pom.xml` es el núcleo de cualquier proyecto Maven. Incluye los detalles de configuración sobre el proyecto y sus dependencias.

### Dependencias

La sección de dependencias en el archivo `pom.xml` es donde especificamos las bibliotecas externas que nuestro proyecto necesita. Cada dependencia se especifica con su `groupId`, `artifactId` y `version`. Maven descarga y vincula automáticamente estas bibliotecas desde el Repositorio Central de Maven.

Las dependencias en este proyecto son:

- `spring-boot-starter-web`: Proporciona todas las bibliotecas necesarias para desarrollar aplicaciones web.
- `spring-boot-starter-actuator`: Proporciona características de producción listas para usar, como métricas y monitoreo de la salud de la aplicación.
- `spring-boot-starter-test`: Proporciona las bibliotecas necesarias para probar la aplicación.

### Herramientas y Pasos de Construcción

En la sección de construcción, definimos los plugins que se utilizarán durante el ciclo de vida de construcción de Maven. Algunos de los plugins utilizados en este proyecto son:

- `maven-checkstyle-plugin`: Realiza la validación de estilo de código utilizando la configuración especificada en `google_checks.xml`.
- `jacoco-maven-plugin`: Proporciona la funcionalidad de cobertura de código. Configurado para fallar si la cobertura de código es menor al 70%.
- `spotbugs-maven-plugin` y `findsecbugs-plugin`: Realizan análisis estático de código para encontrar posibles errores y vulnerabilidades de seguridad.
- `maven-pmd-plugin`: Realiza análisis de código para encontrar posibles problemas como código muerto, código duplicado, convenciones de nomenclatura, etc.
- `spring-boot-maven-plugin`: Proporciona funcionalidades para construir y ejecutar aplicaciones Spring Boot.

Para más detalles, por favor refiérase al archivo `pom.xml` en la raíz del proyecto.

## Licencia
Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).

## Créditos
Este proyecto es un *fork* del **repositorio original** de [León Jaramillo](https://github.com/leonjaramillo/protobootapp)
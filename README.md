# Aplicación de Demostración

## Descripción
Esta es una aplicación de demostración en Java que muestra un punto de conexión "Hola" y otros para mostrar un proceso de integración continua a través de diferentes proveedores como AWS CodeBuild (con el archivo buildspec.yml), Github Actions (con el directorio .github/workflows) y pronto también en Jenkins de manera local, construyendo en la sesión un Jenkinsfile .

## Registro de cambios después del *fork* al proyecto original

| Commit ID  | Tipo     | Descripción                                               |
|------------|----------|-----------------------------------------------------------|
| **78e28bc** | ci | Change pipeline to automatically update the README file |
| **74086bd**    | docs      | Add basic README file to introduce the project           |
| **e596df0**    | mix      | Add several changes to code base                          |
| **bc637cb**    | docs     | add detailed documentation for each method               |
| **e60be6d**    | refactor | Rename methods to use more descriptive names             |
| **18b9490**    | feat     | Add explicit port configuration                           |

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

## Licencia
Este proyecto está licenciado bajo la [Licencia MIT](LICENSE).

## Créditos
Este proyecto es un *fork* del **repositorio original** de [León Jaramillo](https://github.com/leonjaramillo/protobootapp)
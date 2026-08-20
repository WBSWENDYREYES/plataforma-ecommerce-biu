# WENDY ECOMMERCE BIU

Este proyecto es el backend de una plataforma ecommerce incluyendo la pasarela de pago.
Tendremos registro de usuarios, productos, carrito de compras, entre otras opeciones.

## 📋 Requisitos Previos

Antes de configurar el proyecto, asegúrate de tener instalado:
* **Java Development Kit (JDK)**: Versión 17 o superior.
* **Eclipse IDE**: Versión *Eclipse IDE for Enterprise Java and Web Developers*.
* **Servidor de Aplicaciones**: [Apache Tomcat](https://apache.org) (Compatible con tu versión, ej. v10.1).
## 🛠️ Configuración e Importación en Eclipse

Sigue estos pasos para montar el proyecto localmente:

### 1. Importar el proyecto
1. Abre Eclipse IDE.
2. Ve a `File` -> `Import...`
3. Selecciona `General` -> `Existing Projects into Workspace` y haz clic en `Next`.
4. Elige la carpeta raíz de este proyecto y haz clic en `Finish`.

### 2. Asociar el Servidor Apache Tomcat
Si el proyecto muestra errores rojos en los Servlets o JSPs, debes enlazar Tomcat:
1. Haz clic derecho sobre el proyecto -> `Properties`.
2. Ve a la sección `Targeted Runtimes`.
3. Marca la casilla de tu servidor **Apache Tomcat**.
4. Haz clic en `Apply and Close`.

*(Si no tienes el servidor creado en Eclipse, ve a la pestaña `Servers`, haz clic derecho -> `New` -> `Server` -> Selecciona `Apache` y busca tu versión de Tomcat local).*

## 🚀 Cómo Ejecutar la Aplicación

1. En el **Project Explorer** de Eclipse, haz clic derecho sobre el nombre del proyecto.
2. Selecciona `Run As` -> `Run on Server`.
3. Selecciona tu servidor **Apache Tomcat** configurado y haz clic en `Finish`.
4. Abre tu navegador web favorito e ingresa a la siguiente dirección:
http://localhost:8080/WendyE-commerce1/

## 📁 Estructura del Proyecto

* `src/main/java`: Contiene las clases de Java, Servlets y controladores.
* `src/main/webapp`: Contiene las vistas en JSP, archivos HTML, CSS y JavaScript.
* `src/main/webapp/WEB-INF/lib/`: Carpeta donde se deben colocar las librerías externas `.jar` (como conectores de bases de datos).

## ✒️ Autor
* **Tu Nombre** - [TuUsuarioGit](https://github.com/WBSWENDYREYES/plataforma-ecommerce-biu/tree/master)
ING. WENDY REYES ROJAS REPUBLICA DOMINICANA
WREYES@SOFTWENDY.COM
WREYESROJAS@GMAIL.COM


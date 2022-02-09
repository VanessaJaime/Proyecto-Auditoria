# DOCUMENTACIÓN DEL PROYECTO DE AUDITORÍA DE SOFTWARE "MATH"  

### "SOFTWARE MATEMÁTICO QUE SUMA, RESTA Y SACA EL DOBLE DE UN NÚMERO X"  
  
  
#### ÍNDICE
- Introducción
- Objetivo del Proyecto
- Definiciones y especificación de requerimientos
    + Definición general del proyecto de software
    + Especificación de requerimientos del proyecto
- Arquitectura del Sistema
- Pruebas del Aplicativo
- Recomendaciones  

---

#### **1. INTRODUCCIÓN**
En el presente documento se mostrará toda la información acerca del software creado, cual es el objetivo de este, con que finalidad se lo realizo, y las características del software.

#### **2. OBJETIVO DEL PROYECTO**
Poner en práctica todo lo aprendido a lo largo del trimestre en la materia de Auditoría de Software, usando los conocimientos adquiridos para poder realizar lo pedido en el proyecto.

#### **3. DEFINICIONES Y ESPECIFICACIÓN DE REQUERIMIENTOS**
##### **_3.1 DEFINICIÓN DEL SOFTWARE_**
**_MATH_** es un software que fue creado para la materia de Desarrollo de Software III, este software es un formulario que consta con 3 operaciones matemáticas que son: Suma, Resta y Doble. 
El software puede ser modificado para añadirle más operaciones matemáticas según se desee. 
También cuenta con la función salir para que una vez haya realizado los procedimientos requeridos salga del aplicativo.

![Aplicativo](https://i.imgur.com/iG5FrZo.jpg)

##### **_3.2 ESPECIFICACIÓN DE REQUERIMIENTOS Y HERRAMIENTAS UTILIZADAS_**
**_MATH_** es un software creado en el lenguaje de programación JAVA mediante el software NETBEANS, por lo cual en caso de que se quiera modificar el software va a ser necesario que se use un IDE que soporte JAVA "ECLIPSE o NETBEANS", también es importante tener la última versión del JRE y JDK de JAVA, ya que en ocasiones el software puede dar problemas al no tener instaladas o actualizadas las versiones requeridas. 

**_NETBEANS_** es un entorno de desarrollo integrado libre, hecho principalmente para el lenguaje de programación Java. Es un proyecto de código abierto de gran éxito con una gran base de usuarios. 
La plataforma NetBeans permite que las aplicaciones sean desarrolladas a partir de un conjunto de componentes de software llamados módulos. 
Un módulo es un archivo Java que contiene clases de java escritas para interactuar con las API de NetBeans y un archivo especial (manifest file) que lo identifica como módulo.

NetBeans IDE permite el desarrollo de todos los tipos de aplicación Java **"J2SE, web, EJB y aplicaciones móviles"**. 

**IMPORTANTE:** La plataforma **_Netbeans_** ofrece servicios reusables comunes para las aplicaciones de escritorio, permitiendo a los desarrolladores centrarse en la lógica de sus aplicaciones. 
Entre las características que tiene la aplicación están:
+ Gestión de la interfaz de usuario ( menús y barras de herramientas )
+ Gestión de configuración de usuario
+ Gestión de almacenamiento (guardar o cargar algún tipo de dato)
+ Gestión de ventana
+ Marco Asistente (soporta diálogos paso a paso)
+ Librería visual de Netbeans
+ Herramientas de desarrollo integrado

**NetBeans IDE es libre, código abierto, multiplataforma con soporte integrado para el lenguaje de programación Java.**
![Netbeans](https://miracomosehace.com/wp-content/uploads/mch/logo-apache-netbeans_14033.jpg)

#### **_4. ARQUITECTURA DEL SOFTWARE_**  
**4.1 Descripción Jerárquica**
El software programado está organizado en un solo paquete ya que es un programa sencillo al tener un solo paquete y dentro de este contener solo 3 clases. Podemos observar que la clase **Contenedor** es donde se ejecuta el programa. 

![Jerarquia](https://i.imgur.com/Xp8h991.jpg)

**Paquete**  
El aplicativo consta con un solo paquete llamado **ejemplo7trabajoautonomo**, el cual contiene las 3 clases que se crearon para el desarrollo de este software.  

*Clase* **CONTENEDOR**
La clase Contenedor va a heredar la librería que se importó ***JFRAME***, en esta clase se va a realizar el diseño del formulario del aplicativo por medio de código. 

Al momento de escribir el código, la línea ***this.suma.addActionListener(new menuOpcionesListener(this));*** se relaciona con la clase **menuOpcionesListener** que tenemos, ademas de que tambien hereda los botones creados en la clase ***Formulario***.

Esta clase es la que se va a ejecutar para compilar el software.

![contenedor](https://i.imgur.com/6p8OeBj.jpg)  

![contenedor](https://i.imgur.com/K7FRe0h.jpeg) 

*Clase* **FORMULARIO**  

En esta clase despues de importar las librerías a utilizar crearemos los botones que se vayan a usar en el formulario, estos a la vez van a estar relacionados con la clase **menuOpcionesListener**.

![formulario](https://i.imgur.com/PJrFrEJ.jpeg)  

Luego de crear los botones se realiza el código que le va a dar funcionamiento a los botones.

![formulario](https://i.imgur.com/6CXFy2e.jpeg)

*Clase* **MENUOPCIONESLISTENER** 
![menu](https://i.imgur.com/jBvOCBg.jpeg)  

**Compilación del Software**
**_SUMA_**
![1](https://i.imgur.com/ZcBQnGg.jpeg)  

**_DOBLE_**
![2](https://i.imgur.com/9E0uYHe.jpeg)  

**_RESTA_**
![3](https://i.imgur.com/BIoozBQ.jpeg)  

**_5. RECOMENDACIONES_**
El software puede ser modificado a su gusto, añadiendole distintas operaciones matemáticas a su gusto.
1. Para realizar esto en la clase Formulario se crean los nuevos botones con las operaciones matemáticas que se quieran agregar.
2. En la misma clase Formulario se crea el código que va a cumplir cda botón.
3. Después de realizar esto, desde la clase Contenedor se heredan los datos de la clase Formulario.
4. Al ejecutar se mostrará los nuevos botones añadidos junto a sus funcionalidades.




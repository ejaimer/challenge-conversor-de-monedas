<header>
  <h1 align = "center" width="70%"> CONVERSOR DE MONEDAS </h1>
  <img src="https://github.com/user-attachments/assets/e48df976-9de7-423c-b941-5e489fa5cbcc" width="10%">
</header>
<h2>Implementación challenge conversor de monedas - Alura</h2>
![Badge finished](https://img.shields.io/badge/STATUS-FINISHED-GREEN)

## Indice
* [Titulo e imagen de portada](#Titulo-e-imagen-de-portada)
* [Insignias](#insignias)
* [Indice](#indice)
* [Descripcion del proyecto](#descripcion-del-proyecto)
* [Estado del proyecto](#estado-del-proyecto)
* [Funcionalidades del proyecto](#Funcionalidades-del-proyecto)
* [Acceso al proyecto](#Acceso-al-proyecto)
* [Tecnologias utilizadas](#Tecnologias-utilizadas)
* [Personas Contribuyentes](#Personas-contribuyentes)
* [Personas-Desarrolladores del Proyecto](#Personas-desarrolladores)
* [Licencias](#Licencias)
* [Conclusion](#Conclusion)

## Descripcion del proyecto
Proyecto challenge "Conversor de monedas" del curso Java Orientado a Objetos - ALURA . Este proyecto consiste en implementar un programa hecho en java utilizando la orientacion a objetos , APIs,Exception.
El programa debe tener la funcionalidad e convertir una cierta cantidad a otro tipo de moneda , utilizando el API de ExchangeRate el cual permite obtener las tasas de cambio en tiempo real.

## Estado del proyecto
Culminado

## 🔨 Funcionalidades del proyecto
- `Funcionalidad 1`: El programa te muestra un menu en consola con 10 opciones , el usuario ingresa una opcion :
  ![menu_cambio_moneda](https://github.com/user-attachments/assets/e0e68445-f040-4b72-ae4b-a679109c2c8e)

- `Funcionalidad 2`: Luego de ingresado la opcion , el cual tiene que ser válido o de lo contrario te solicitara ingresarlo otra vez , te solicitará un valor de moneda a realizar el cambio de acuerdo a la opcion elegida en el cual se detalla de que tipo a que tipo se realizará. El resultado se mostrará en pantalla:
  
  ![funcionalidad 2 cambio de moneda](https://github.com/user-attachments/assets/c67008e8-21ef-434f-9d57-d0b916f246e5)
  
- `Funcionalidad 3`: El programa seguira mostrando el menu para poder realizar mas cambio de monedas , a menos que elijamos la opcion 10 el cual permite finalizar la ejecucion del programa.Todas los cambios que realiamos seran almacenados en una lista de la Calse RegistroCambiosMoneda , el cual me permitira almacenar las operaciones de cambio que hizo el usuario.

  ![ingresar mas cambios](https://github.com/user-attachments/assets/2f7da485-653d-4d3d-9a8c-4441dbc82844)

- `Funcionalidad 4`: Al elegir la opcion 9 , imprimira el registo de cambios guardado en una lista :

  ![registro de cambios](https://github.com/user-attachments/assets/12f3d88a-7b06-47f0-92a1-9c43ce2a03fb)

  
- `Funcionalidad 5`: Si se elige una opcion no valida , se mostrara un mensaje para ingresar una opcion válida:

  ![opcion no valida](https://github.com/user-attachments/assets/3879e3a4-03c0-43ca-ba66-9d9fe14e0095)

- `Funcionalidad 6`: Finalizacion del programa al elegir la opcion 10:

  ![finalizacion del programa](https://github.com/user-attachments/assets/d2bf45d4-3ec1-406d-b995-ee9e1b1d80d9)

  
## 🔗Acceso al proyecto 
Si deseas puedes acceder al proyecto a traves del siguinete enlace:

  https://github.com/ejaimer/challenge-conversor-de-monedas/tree/main/src/com/edward

## ✔️ Tecnologias utilizadas
- Java
- Maven
- ExchangeRate-API

## Personas-Desarrolladores del proyecto
| [<img src="https://avatars.githubusercontent.com/u/70885445?s=400&u=6cbe5aa76688201740b9ae2cafbf789ab55bc533&v=4" width=115><br><sub>Edward Jaime Ricra</sub>](https://github.com/ejaimer) |
| :---: | 

## Conclusiones
- Se utilizo 3 clases Concretas : MenuCoversor,ConusltaTasa,RegistroCambiosMoneda para poder modelar la funcionalidad de nuestro programa.
- Se una clase Record,TasaDeCambio , esta última para poder registar los valores de cambios obtenidos de la API Exchange.



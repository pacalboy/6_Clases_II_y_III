# 6_Clases_II_y_III
Creación de clases. Creación de jerarquía de clases.

## Repaso Clases I
Crea una clase **Vehiculo** cuyos atributos sean máximo número de pasajeros, número actual de pasajeros, motor, peso y matrícula. Crea un constructor por defecto, un constructor completo y un constructor que sólo reciba motor y matrícula. Crea getters de todos los atributos y setters de peso, motor y pasajeros. Crea el método toString. Crea un método que sea transportar y reciba un número de pasajeros. La funcionalidad de este método será añadir los pasajeros pasados como parámetro al número actual de pasajeros. Crea un método descargar pasajeros que establezca el número actual de pasajeros a 0.  
  
Crea una clase **motor** con 3 atributos: potencia, número de motor y número de cilindros. Los tres atributos serán necesarios para construir el motor. El único atributo que puede ser modificado a posteriori es la potencia. Todos los atributos pueden ser consultados de forma pública. Añade el método toString.  
  
Crea un **main** en el que crees 2 motores con todos sus atributos. Muestra todos los atributos del motor 1 usando los métodos get. Muestra todos los atributos del motor 2 usando el toString.  
Crea 3 vehículos. El primer vehículo créalo con el motor 1 e invéntate una matrícula. El vehículo 2 créalo con todos los atributos inventados (utiliza el motor 2). El primer vehículo créalo por defecto.  
  
Muestra la potencia del motor del primer vehículo (accede desde el vehículo)  
Muestra el número máximo de pasajeros del vehículo 2.  
Haz un toString del vehículo 3.  
Transporta 15 pasajeros en el vehículo segundo. Muestra el número de pasajeros de dicho vehículo. Transporta 10 pasajeros en el segundo vehículo. Muestra el número de pasajeros de dicho vehículo. Descarga los passajeros del vehículo 2. Muestra el número actual de pasajeros de dicho vehículo.

## Equals HashCode

Crea los métodos equals y hashCode en la clase Motor.  
  
Para los siguientes métodos, utiliza siempre el valor de retorno para mostrarlo por consola utilizando un sout. 
Crea un método en tu aplicación que sirva para que dados dos Vehículos, compare si tienen el mismo código hash. Llámalo comparaHash.  
Crea un método en tu aplicación llamado comparaMotores que sirva para comparar si los motores de dos vehículos dados como parámetros tienen las mismas características.  
Crea un método llamado mediaPotencia que recibiendo dos Vehículos como parámetros, devuelva la media de la potencia de sus motores.  
Crea un método llamado devolverPesado que recibiendo dos Vehículos devuelva aquel que tenga mayor peso.

## Gran Repaso Clases
Crea una clase **empleado**. Cada empleado deberá tener un nombre, apellido1, apellido2, dni, número seguridad social, género, fecha de nacimiento y activo, contrato y taquilla. Los 3 primeros atributos serán cadenas de caracteres, podrán ser modificados y consultados. DNI y nSS sólo podrán ser consultados. Estos dos atributos se proporcionarán en el momento de construir el objeto. El género se almacenará en un carácter, no es un atributo obligatorio en el momento de crear los empleados, puede ser consultado y modificado sólo por la letra 'M' o 'H'. La fecha de nacimiento es un valor de tipo Calendar, no es un atributo obligatorio en el momento de la creación, puede ser consultado y su modificación se hará recibiendo día, mes y año como parámetros. El parámetro activo es un boolean que por defecto es false, puede ser consultado, este atributo sólo se modifica con los métodos darBaja (al dar de baja se borra el contrato) y darAlta (para dar de alta es necesario un contrato). Tanto contrato como taquilla son dos tipos definidos en otra clase, ambos tienen métodos de consulta y modificación. Añade el método toString  
  
Crea las clases Taquilla y Contrato.  
**Contrato** tiene los atributos nombreEmpresa, nContrato, salarioBase, horasExtras, fecha de inicio (Calendar) y tipo (String: por ejemplo temporal, obra o servicio, definitivo...). El nombre de la empresa es siempre igual para todos los contratos. Los atributos salarioBase, fechaInicio y tipo son necesarios para construir el objeto. El nContrato será autoincrementado por un contador global de contrator. horasExtra siempre a 0 por defecto. La fecha es una constante, tanto tipo como salario se pueden modificar. Todos los atributos, incluso los globales, se pueden consultar. Añade un método sumarHorasExtras que reciba un número e incremente el número de horasExtras realizadas. Crea un método calcularSueldoMes que reciba como parámetro el precio de las horas extras y devuelva el total del salario que debe recibir el empleado dicho mes (salarioBase + horasExtras * precioHora). Añade toString.  
  
La clase **Taquilla** tiene un atributo identificador y otro codigo. El identificador se debe proporcionar al constructor. El código es un número de 4 dígitos generado de forma aleatoria en el momento de construir el objeto. Crea un método privado generarCodigoAcceso que genere y devuelva dicho código aleatorio. Crea otro método renovarCodigo que reciba como parámetro el código actual. Si es código actual es correcto se llama a generarCodigoAcceso para generar un nuevo código. Sólo el identificador tiene métodos set y get. Crea un método toString (sólo aquí se mostrará el valor del código de acceso).  
  
  
Crea 2 taquillas.  
Crea 2 contratos.  
Crea 2 empleados.  
Asigna una fecha de nacimiento al empleado 2.  
Asigna otros atributos que consideres de interés a estos empleados.  
Asigna a cada empleado un contrato y una taquilla.  
Muestra ambos empleados  
El empleado uno a trabajado 10 horas extras este mes. Calcula el salario que le corresponde.  
El empleado dos necesita modificar el identificador de su taquilla y cambiar la clave.  
El empleado uno ha modificado su contrato a tipo Indefinido. Muestra el contrato del empleado 1.  
El empleado dos se ha dado de baja. Muestra el estado de empleado dos.  
Crea un nuevo contrato para el empleado 2. Da de alta al empleado 2 con el nuevo contrato.  
Asigna el género 'M' al empleado 1. Muestra el género del empleado 1.  
Asigna el género 'J' al empleado 1. Muestra el género del empleado 1.  
Muestra cuántos contratos se han hecho hasta la fecha.

## Herencia
**ClubFutbol**  
Se pide implementar las clases de la imagen. Para hacerlo de forma eficiente tenéis que tener en cuenta qué atributos y métodos se repiten para extraerlos a la clase base. Los métodos concentrar y viajar mostrarán "\<nombre\> se concentra". Los métodos concetrar y viajar en cada clase ampliarán dicho mensaje para que aparezca el nombre de la clase y algún atributo propio. Por ejemplo: "El Futbolista con dorsal \<numero\> y nombre: \<nombre\> se concentra".  

![](/4.Herencia/ClubFutbol/herencia.png)
  
**BonoBus**  
Los atributos que almacenan son: id, saldo y fecha de creación, fecha de validez. Existe una variable global que indica el precio de 1 billete BonoBus. Entre su funcionalidad podemos encontrar: pagar un viaje, pagar n viajes y recargar saldo con x euros. Estos métodos devolverán booleanos que representen si el usuario se ha podido subir al autobús. Y el método recargar devolverá el saldo final. El id es un atributo autoincrementado gracias a una variable global que contabiliza cuántos BonoBus se han creado. El saldo es un atributo que en la creación siempre tendrá el valor 0. La fecha de creación es un atributo que toma la fecha en el momento local. La fecha de validez es un atributo que se crea partir de la fecha de creación incrementándole 2 años. Sólo los atributos saldo y fecha de validación pueden ser consultados.  
Se desea crear un **BonoJoven** para los jóvenes de Granada menores de 25 años. Para este bono es necesario almacenar la edad del poseedor en el momento de creación. Además, es necesario almacenar el nombre y apellidos del poseedor junto con su dni. La fecha de validez será calculada según la edad, hasta que el poseedor cumpla los 25 años. La funcionalidad de pagar un viaje ahora tiene que ir acompañada del dni y debe comprobarse que el dni que muestra el portador coincide con el dni que almacena el BonoJoven. Por otro lado, el BonoJoven no permite comprar más de un viaje. El precio que se cobra por el viaje es la mitad del Bonobus estándar. El resto de funcionalidades son iguales para ambas clases.  
Crea otro tipo de BonoBus, **BonoJubilado**, el precio de este abono es un tercio del precio estándar. Implementa el resto de funcionalidad como consideres correcto.  
Gestiona todos los posibles errores.

## Abstract
Adaptar el ejercicio del personal del **club de fútbol** a clase abstracta.  
Adaptar la jerarquía del **bonoBus** a clases abstractas utilizando una clase BonoReducido y otra Bono, no instanciables.

## Interface
Se pide implementar las clases de las imágenes.  

**Resizable**  

![](/6.Interface/resizable.png)  

**ReadingItem**  

![](/6.Interface/readingItem.png)  

**SeleccionFutbol**  

![](/6.Interface/seleccionFutbol.png)  

**Dog**  

![](/6.Interface/dog.png)  

**School**  

![](/6.Interface/school.png)  

**Nuisance**  

![](/6.Interface/nuisance.png)  

**Pet**  

![](/6.Interface/pet.jpg)  

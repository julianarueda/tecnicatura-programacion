//Ejercicio 1: Calcular estación del año
let mes = 4;
let estacion;
if(mes == 1 || mes == 2 || mes == 12){
    estacion = "Verano";
}
else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Otoño";
}
else if(mes == 6 || mes == 7 || mes == 8){
    estacion = "Invierno";
}else if(mes == 9 || mes == 10 || mes == 11){
    estacion = "Primavera";
}
else{
    estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estación de: "+estacion);

//Ejercicio 2: Hora del día
// de 6 a 11: Good morning
// de 12 a 16: Good afternoom
// de 17 a 19: Good evening
// de 20 a 23: Good night
// Trabajamos con 24 horas

let horaDia = 10;
let mensaje;
if(horaDia >= 6 && horaDia <= 11){
    mensaje = "Good morning";
}
else if(horaDia >= 12 && horaDia <= 16){
    mensaje = "Good afternoom";
}
else if(horaDia >= 17 && horaDia <= 19){
    mensaje = "Good evening";
}
else if(horaDia >= 20 && horaDia <= 23){
    mensaje = "Good night";
}
else{
    estacion = "Valor incorrecto";
}
console.log(mensaje);

//Estructura switch
switch(mes){
    case 1: case 2: case 12:
        estacion = "Verano";
        break;
    case 3: case 4: case 5:
        estacion = "Otoño";
        break;
    case 6: case 7: case 8:
        estacion = "Invierno";
        break;
    case 9: case 10: case 11:
        estacion = "Primavera";
        break;
    default:
        estacion = "Valor incorrecto";
}
console.log("El valor corresponde a la estación de: "+estacion);

//Con var puedes reasignar en cualquier momento 

var nombre = 'Ariel';
nombre = 'Osvaldo';
console.log(nombre);

function saludar(){
    var nombre3 = 'Natalia';
    console.log(nombre3);
}

if(true){
    var edad = 34;
    console.log(edad);
}
console.log(edad); //En la función funciono correctamente, en la estructura if fallo.

function saludar2(){
    let nombre2 = 'Ariel';
    console.log(nombre2);
}

if(true){
    let edad2 = 33;
    console.log(edad2);
}


// const se utiliza para valores constantes que no pueden ser reasignadas

const fechaNacimiento = 2006;
console.log(fechaNacimiento);

//let days = ['Lunes','Martes','Miercoles','Jueves','Viernes','Sábado','Domingo'];

let days = 3;

switch(days){
    case 1:
        console.log('hoy es Lunes');
        break;
    case 2:
        console.log('hoy es Martes');
        break;
    case 3:
        console.log('hoy es Miercoles');
        break; 
    case 4:
        console.log('hoy es Jueves');
        break;
    case 5:
        console.log('hoy es Viernes');
        break;
    case 6:
        console.log('hoy es Sábado');
        break;
    case 7:
        console.log('hoy es Domingo');
        break;
    default:
        console.log("Error en el ingreso del día de la semana");
        break;
}

let days2 = ['Lunes','Martes','Miercoles','Jueves','Viernes','Sábado','Domingo'];

function getDay(n){
    if(n < 1 || n > 7){
        throw new Error('out of range');
    }
    return days2[n-1];
}

console.log(getDay(5));

//Hacer un ejercicio similar al que esta hecho, pero ahora con los
//meses del año, debes hacerlo con la estructura switch y luego con 
//la función en la opción mejorada

let month = 12;

switch(month){
    case 1:
        console.log('hoy es Enero');
        break;
    case 2:
        console.log('hoy es Febrero');
        break;
    case 3:
        console.log('hoy es Marzo');
        break; 
    case 4:
        console.log('hoy es Abril');
        break;
    case 5:
        console.log('hoy es Mayo');
        break;
    case 6:
        console.log('hoy es Junio');
        break;
    case 7:
        console.log('hoy es Julio');
        break;
    case 8:
        console.log('hoy es Agosto');
        break;
    case 9:
        console.log('hoy es Septiembre');
        break;
    case 10:
        console.log('hoy es Octubre');
        break;
    case 11:
        console.log('hoy es Noviembre');
        break;
    case 12:
        console.log('hoy es Diciembre');
        break;
    default:
        console.log("Error en el ingreso del mes del año");
        break;
}

let month2 = ['Enero','Febrero','Marzo','Abril','Mayo','Junio','Julio','Agosto','Septiembre','Octubre','Noviembre','Diciembre'];

function getMonth(n){
    if(n < 1 || n > 12){
        throw new Error('out of range');
    }
    return month2[n-1];
}

console.log(getMonth(3));
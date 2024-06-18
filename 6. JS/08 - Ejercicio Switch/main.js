// Parte 1: Buscar el nombre del mes basado en el número
function buscarMes(numeroMes) {
  let mes;
  switch (numeroMes) {
    case 1:
      mes = "Enero";
      break;
    case 2:
      mes = "Febrero";
      break;
    case 3:
      mes = "Marzo";
      break;
    case 4:
      mes = "Abril";
      break;
    case 5:
      mes = "Mayo";
      break;
    case 6:
      mes = "Junio";
      break;
    case 7:
      mes = "Julio";
      break;
    case 8:
      mes = "Agosto";
      break;
    case 9:
      mes = "Septiembre";
      break;
    case 10:
      mes = "Octubre";
      break;
    case 11:
      mes = "Noviembre";
      break;
    case 12:
      mes = "Diciembre";
      break;
    default:
      mes = "ERR0R";
      break;
  }
  return mes;
}

let numeroMes = parseInt(prompt("Introduce el número del mes (1-12):"), 10);
if (!isNaN(numeroMes)) {
  let mes = buscarMes(numeroMes);
  console.log("El mes es:", mes);
  alert("El nombre del mes es: " + mes);
} else {
  console.log("ERR0R");
  alert("ERR0R");
}

// Parte 2: Convertir número en string a número
function stringANumero(numeroString) {
  let numero;
  switch (numeroString.toLowerCase()) {
    case "uno":
      numero = 1;
      break;
    case "dos":
      numero = 2;
      break;
    case "tres":
      numero = 3;
      break;
    case "cuatro":
      numero = 4;
      break;
    case "cinco":
      numero = 5;
      break;
    default:
      numero = "ERR0R";
      break;
  }
  return numero;
}

let numeroString = prompt(
  "Introduce un número del uno al cinco en formato string:"
);
let numero = stringANumero(numeroString);
console.log("El número es:", numero);
alert("El número es: " + numero);

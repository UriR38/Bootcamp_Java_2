// Parte 1
function suma(num1, num2, num3) {
  (num1 = 10), (num2 = 15), (num3 = 25);
  return num1 + num2 + num3;
}
const sumados = suma();
console.log(sumados);

// Parte 2
function IntroduceNombre(nombre, apellido1, apellido2) {
  nombre = "Oriol";
  apellido1 = "Rodriguez";
  apellido2 = "Martinez";
  return nombre + " " + apellido1 + " " + apellido2;
}
const nombreCompleto = IntroduceNombre();
console.log(nombreCompleto);

// Parte 3
function numerosAleatorios(num1, num2) {
  num1 = Math.floor(Math.random() * 11);
  num2 = Math.floor(Math.random() * 11);

  if (num1 > num2) {
    return num1;
  } else {
    return num2;
  }
}
numeroMayor = numerosAleatorios();
console.log("El numero mas grande es: " + numeroMayor);

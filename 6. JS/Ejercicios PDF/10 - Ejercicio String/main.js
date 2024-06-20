// Ejercicio 1
function sustituirAporO(cadena) {
  return cadena.replace(/a/gi, "o");
}
let resultado1 = sustituirAporO("Academia");
console.log(resultado1);

// Ejercicio 2
function comprobarYReemplazar(cadena) {
  if (cadena.toLowerCase().startsWith("aca")) {
    console.log(sustituirAporO("academia"));
    console.log(sustituirAporO("escuela"));
  } else {
    console.log("La cadena no empieza con 'aca'");
  }
}

comprobarYReemplazar("academia"); // "ocodemio" "escuelo"
comprobarYReemplazar("escuela"); // "La cadena no empieza con 'aca'"

// Ejercicio 3
function saludarTresVeces(saludo) {
  for (let i = 0; i < 3; i++) {
    console.log(saludo);
  }
}

saludarTresVeces("Hola"); // "Hola" "Hola" "Hola"

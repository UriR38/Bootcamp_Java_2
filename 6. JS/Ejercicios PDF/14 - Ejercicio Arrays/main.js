// Parte 1
let pizzeriaCerbecera = ["🍔", "🌯", "🍣", "🍕", "🍜", "🍱", "🍙", "🍘"];
let findP = false;

for (let i = 0; i < pizzeriaCerbecera.length; i++) {
  if (pizzeriaCerbecera[i] === "🍕") {
    findP = true;
    i++;
  }
  if (findP) {
    pizzeriaCerbecera[i] = "🍺";
  }
}
console.log(pizzeriaCerbecera);

// Parte 2
let pizzaConPiña = ["🍕", "🍕", "🍍", "🍕", "🍕"];
for (let i = 0; i < pizzaConPiña.length; i++) {
  if (pizzaConPiña[i] === "🍍") {
    let elementoABuscar = "🍍";
    let posicion = pizzaConPiña.indexOf(elementoABuscar);
    console.log(pizzaConPiña[i], "en la posicion:", posicion);
  }
}

// Parte 3
let pizzaConPiña2 = ["🍕", "🍕", "🍍", "🍕", "🍕"];
let elementoAEliminar = "🍍";
let indice = pizzaConPiña2.indexOf(elementoAEliminar);

if (indice !== -1) {
  pizzaConPiña2.splice(indice, 1);
}
console.log(pizzaConPiña2);

//Parte 4
let fresitasChampiñones = ["🍓", "🍋", "🍓", "🍋", "🍓"];
let buscamosFresas = "🍓";

for (let i = 0; i < fresitasChampiñones.length; i++) {
  if (fresitasChampiñones[i] === "🍓") {
    fresitasChampiñones[i] = "🍄";
  }
}
console.log(fresitasChampiñones);

// Parte 5
let calorcitoConLeche = ["🌶", "🥛", "🌶", "🥛", "🌶", "🥛"];
let nuevoElemento = "🥵";
for (let i = 0; i < calorcitoConLeche.length; i++) {
  if (calorcitoConLeche[i] === "🥛") {
    calorcitoConLeche.splice(i + 1, 0, "🥵");
    i++;
  }
}
console.log(calorcitoConLeche);

// Parte 6
let cartas = ["🂡", "🂢", "🂡", "🂢", "🂡"];
let cartaComodin = "🃏";
function insertarComodin(cartas, comodin) {
  let resultado = [];
  for (let i = 0; i < cartas.length; i++) {
    resultado.push(cartas[i]);
    if (i < cartas.length - 1) {
      resultado.push(comodin);
    }
  }
  return resultado;
}
let nuevoArray = insertarComodin(cartas, cartaComodin);
console.log(nuevoArray);

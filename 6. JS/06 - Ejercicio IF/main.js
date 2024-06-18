function numRandom() {
  return Math.round(Math.random());
}
const numero = numRandom();
if (numero === 0) {
  console.log("El numero es: 0.");
} else if (numero == 1) {
  console.log("El numero es: 1.");
} else {
  console.log("ERROR");
}

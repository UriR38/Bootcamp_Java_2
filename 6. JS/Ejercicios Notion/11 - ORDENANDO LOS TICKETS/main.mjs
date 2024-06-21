const drinksConsumed = [
  { nombre: "Alice", bebida: "🍹", hora: "18:30:00" },
  { nombre: "Bob", bebida: "🍷", hora: "19:15:00" },
  { nombre: "Charlie", bebida: "🍹", hora: "20:00:00" },
  { nombre: "Alice", bebida: "🍸", hora: "21:45:00" },
  { nombre: "Bob", bebida: "🥂", hora: "22:30:00" },
  { nombre: "Charlie", bebida: "🍵", hora: "23:15:00" },
  { nombre: "Alice", bebida: "🍹", hora: "03:30:00" },
  { nombre: "Bob", bebida: "🍺", hora: "04:15:00" },
  { nombre: "Charlie", bebida: "🍸", hora: "05:00:00" },
];
// Primera parte
const bebida = drinksConsumed.map((drink) => drink.bebida);
const primerCoctel = bebida.indexOf("🍹");
const primeroEnBBC = drinksConsumed[primerCoctel];
console.log(
  `El primero en beber una 🍹 fue ${primeroEnBBC.nombre} a las ${primeroEnBBC.hora}`
);

const primerMartini = bebida.indexOf("🥂");
const primeroEnBBM = drinksConsumed[primerMartini];
console.log(
  `El primero en beber una 🥂 fue ${primeroEnBBM.nombre} a las ${primeroEnBBM.hora}`
);

//Segunda parte
const primerCafe = bebida.indexOf("☕️");
const primeroEnBBCafe = drinksConsumed[primerCafe];
// console.log(
//   `El primero en beber ☕️ fue ${primeroEnBBCafe.nombre} a las ${primeroEnBBCafe.hora}`
// );    - - - - - > no encuentra el cafe, y peta, porq no existe en el array.

//Tercera parte
const ultimaCopa = bebida.lastIndexOf("🍸");
const ultimaCopaEnBB = drinksConsumed[ultimaCopa];
console.log(
  `El utlimo en beber una 🍸 fue ${ultimaCopaEnBB.nombre} a las ${ultimaCopaEnBB.hora}`
);

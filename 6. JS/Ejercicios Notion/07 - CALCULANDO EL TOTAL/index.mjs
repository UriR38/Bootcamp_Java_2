// Tarea 2
import { menu } from "./foods.mjs";
// const categorias = menu.map(menu => menu.category);

const categoriasFiltadas = [...new Set(menu.map((menu) => menu.category))];
for (let i = 0; i < categoriasFiltadas.length; i++) {
  if (categoriasFiltadas[i] === "") {
    categoriasFiltadas.splice(i, i);
  }
}
console.log(categoriasFiltadas);

//Tarea 3
// categoriasFiltadas.includes('Japanese')
console.log(categoriasFiltadas.includes("Japanese"));

//Tarea 4
const japaneseFood = menu.filter((menu) => menu.category === "Japanese");
console.log(japaneseFood);

//Tarea 5
const ticket = ["🥜", "🌮", "🥗", "🍕", "🍣", "🧀"];
const prices = menu
  .filter((item) => ticket.includes(item.icon))
  .map((item) => item.price);

const precio = prices.reduce((acc, price) => acc + price, 0);
console.log(ticket,"Total of the ticket:",precio);


// 1. **🗣️ LA COMANDA: 🗣️**
const dinner = [];
dinner.push("🍔", "🌭");
console.log(dinner);
//Output: []
//Expected output: ['🍔', '🌭']

// 2.  🗣️ 1ª RECLAMACIÓN: 🗣️
dinner.push("🍟", "🍟");
console.log(dinner);
//Output: ['🍔', '🌭']
//Expected output: ['🍔', '🌭', '🍟', '🍟']

// 3.  🗣️ 2ª RECLAMACIÓN: 🗣️
const dinner3 = ["🍔", "🌭", "🍟", "🍟"];
dinner3.push("🧋", "🧋");
console.log(dinner3);
//Output: ['🍔', '🌭', '🍟', '🍟']
//Expected output ['🍔', '🌭', '🍟', '🍟', '🧋', '🧋']

// 4. 🗣️ (Ruido de pasos… )🚶🏻‍♂️EL JEFE SE ACERCA! 🗣️

// Primer metodo: reverse
const dinner4 = ["🍔", "🌭", "🍟", "🍟", "🍕", "🧋", "🧋"];
dinner4.reverse();
dinner4.unshift("🍸");
console.log(dinner4);
// console.log(dinner.reverse()); --> Otra forma y más compacta de usar el reverse.

// Segundo metodo: Bucle for
reOrdenar = [];
for (let i = dinner4.length - 1; i >= 0; i--) {
  reOrdenar.push(dinner[i]);
}
dinner4.unshift("🍸");
console.log(dinner4);

// Tercer metodo: Bucle for sin array
const dinner45 = ["🍔", "🌭", "🍟", "🍟", "🍕", "🧋", "🧋"];
for (let i = 0; i < Math.floor(dinner45.length / 2); i++) {
  const temp = dinner45[i];
  dinner45[i] = dinner45[dinner45.length - 1 - i];
  dinner45[dinner45.length - 1 - i] = temp;
}
dinner45.unshift("🍸");
console.log(dinner45);

// Cuarto metodo: forEach sin array auxiliar
const dinner46 = ["🍔", "🌭", "🍟", "🍟", "🍕", "🧋", "🧋"];
dinner46.forEach((element) => {
let index;
  let reOrdenar = dinner46.length - 1 - index;
  if (index < reOrdenar) {
    
    [dinner46[index], dinner46[reOrdenar]] = [dinner46[reOrdenar], dinner46[index]];
  }
})
dinner46.unshift("🍸");
console.log(dinner46);


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
    [dinner46[index], dinner46[reOrdenar]] = [
      dinner46[reOrdenar],
      dinner46[index],
    ];
  }
});
dinner46.unshift("🍸");
console.log(dinner46);

// Quinto 🗣️ UNA NUEVA COMANDA: 🗣️
const ticket01 = ["🍺", "🍺", "🥜"];
//👨🏻‍🦰 Output: ['🍺', '🍺', '🥜']
const ticket02 = ["🍺", "🥪", "🥙"];
//👱🏽‍♂️ Output: ['🍺', '🥪', '🥙']

//Metodo concat()
const combinedTicket1 = ticket01.concat(ticket02);
console.log(combinedTicket1);

// Metodo con operador ...
const combinedTicket2 = [...ticket01, ...ticket02];
console.log(combinedTicket2);

//Metodo push
ticket01.push(...ticket02);
console.log(ticket01);

//Metodo con bucle forEach
const combinedTicket3 = [];
ticket01.forEach((element) => combinedTicket3.push(element));
ticket02.forEach((element) => combinedTicket3.push(element));
console.log(combinedTicket3);

//Metodo con for
const combinedTicket4 = [];
for (let i = 0; i < ticket01.length; i++) {
  combinedTicket4.push(ticket01[i]);
}
for (let i = 0; i < ticket02.length; i++) {
  combinedTicket4.push(ticket02[i]);
}
console.log("4:", combinedTicket4);

const combinedTicke5 = ["🍺", "🍺", "🍺", "🥜", "🍺", "🥪", "🥙"];
for (let i = 0; i < combinedTicke5.length; i++) {
  if (combinedTicke5[i] === "🍺" && combinedTicke5[++i] === "🍺") {
    combinedTicke5.splice(i, i);
  }
  if (combinedTicke5[i] === "🥙") {
    combinedTicke5.splice(i, i);
  }
}
console.log(combinedTicke5);

const combinedTicket6 = ["🍺", "🍺", "🍺", "🥜", "🍺", "🥪", "🥙"];
combinedTicket6.pop();
combinedTicket6.shift(); 
console.log(combinedTicket6);

//Expected output ['🍺', '🍺', '🥜', '🍺', '🥪']

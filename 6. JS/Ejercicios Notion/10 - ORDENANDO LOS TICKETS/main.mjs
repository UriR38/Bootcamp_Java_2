//Primera parte
const ticket01 = ["☕", "☕", "☕", "☕"];
const ticket02_1 = ["☕", "🥖", "☕", "🥯", "🍵", "🥐", "🥪"];

const ticket01F = ticket01.every((element) => element === "☕");
const ticket02F = ticket02_1.every((element) => element === "☕");
console.log("Ticket 1:", ticket01F, "|", "Ticket 2:", ticket02F);

//Segunda Parte
const ticket02 = ["🍹", "🥖", "☕", "🥯", "🍵", "🥐", "🥪"];

// Slice
const persona1 = ticket02.slice(2, 3).concat(ticket02.slice(5, 6));
const persona2 = ticket02.slice(4, 5).concat(ticket02.slice(1, 2));
const persona3 = ticket02.slice(0, 1).concat(ticket02.slice(6, 7));
const otros = ticket02.slice(3, 4);

console.log("Person 1 Ticket:", persona1);
console.log("Person 2 Ticket:", persona2);
console.log("Person 3 Ticket:", persona3);
console.log("Remaining items in the original ticket:", otros);

// Splice
// Utilizando splice() para extraer los elementos
const Persona1 = [ticket02.splice(2, 1)[0], ticket02.splice(3 - 1, 1)[0]];
const Persona2 = [ticket02.splice(3 - 1, 1)[0], ticket02.splice(1, 1)[0]];
const Persona3 = [ticket02.splice(0, 1)[0], ticket02.splice(1, 1)[0]];
const Otros = ticket02;

console.log('Person 1 Ticket:', Persona1);
console.log('Person 2 Ticket:', Persona2);
console.log('Person 3 Ticket:', Persona3);
console.log('Remaining items in the original ticket:', Otros);
/* Expeted Output:
Person 1 Ticket: [ '☕', '🥐' ]
Person 2 Ticket: [ '🍵', '🥖' ]
Person 3 Ticket: [ '🍹', '🥪' ] 
Remaining items in the original ticket: [ '🥯' ]*/

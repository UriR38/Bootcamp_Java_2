const tickets = [1, 100000, 21, 30, 4];

//Sort()
tickets.sort();
console.log(tickets);

// Bucle for
for (let i = 0; i < tickets.length - 1; i++) {
    for (let j = 0; j < tickets.length - 1 - i; j++) {
      if (tickets[j] > tickets[j + 1]) {
        const temp = tickets[j];
        tickets[j] = tickets[j + 1];
        tickets[j + 1] = temp;
      }
    }
  }
  console.log(tickets);

  // ...
  const ordenar = [...tickets].sort((a, b) => a - b);
  console.log(ordenar);
let numero = 1;
let i = 0;
do {
    if (i === 0) {
        i++;
        numero--;
        console.log(numero);
    } else {
        numero++;
        console.log(numero);
    }
} while (numero < 5);

// En la primera iteración, numero se decrece de 1 a 0 y se imprime 0.
// En las iteraciones siguientes, numero se incrementa y se imprime cada valor hasta llegar a 4.
// La salida será: 0, 1, 2, 3, 4.
// Este código básicamente realiza un conteo desde 0 hasta 4, imprimiendo cada número en el proceso.
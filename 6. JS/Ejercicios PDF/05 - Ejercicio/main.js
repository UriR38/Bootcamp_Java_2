// 1
const miNombre = () => "Oriol Rodriguez Martinez";
console.log(miNombre());
// 2
function ejerBolean(sinValor) {
    console.log(sinValor);
}
ejerBolean(true);
// 3
function parametrosInfinitos(... arrayParametrosInfinitos) {
    arrayParametrosInfinitos.forEach(arrayParametrosInfinitos => {
        console.log(arrayParametrosInfinitos);
    });
}
parametrosInfinitos(1, 2, 3, 4, 5);


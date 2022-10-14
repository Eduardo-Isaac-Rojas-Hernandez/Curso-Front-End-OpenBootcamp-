//Factorial del numero 10.

var acumulador=1;

for(let i=1; i<=10; i++){
    var factorial= i*acumulador;
    acumulador=factorial;
}
console.log("El factorial de 10 es : ", factorial)

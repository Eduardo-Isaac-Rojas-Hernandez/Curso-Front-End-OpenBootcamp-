// Factorial de 10 usando sentencia while

var acumulador=1;
var i=1;
while(i<=10){
    var factorial= i*acumulador;
    acumulador=factorial;
    i++;
} 
console.log("El factorial de 10 es : ", factorial);
var acumulador=1;
var i=1;

while(true){
    let factorial=i*acumulador;
    acumulador=factorial;
    i++;
    if(i>10){
        console.log("El factorial de 10 es : ", factorial);
        break;
    }
}

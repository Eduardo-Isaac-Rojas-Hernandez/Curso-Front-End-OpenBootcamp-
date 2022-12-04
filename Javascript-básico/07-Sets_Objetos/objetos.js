const miObjeto = {
    nombre : "Isaac",
    apellido : "Rojas",
    edad : 35,
    altura : 1.80,
    esDev : true,
}

const edad = miObjeto.edad

const edad1 = "edad"

const listaAmigos = [
    {...miObjeto},
    {nombre: "Nancy", apellido: "Balderas", edad: 36, altura: 1.75, esDev: false},
    {nombre: "Ian", apellido: "Vicente", edad: 30, altura: 1.70, esDev: false},
]

const lista2 = listaAmigos.sort((a, b) => b.edad - a.edad )
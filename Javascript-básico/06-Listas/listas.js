const compra = ["leche", "huevos", "pan", "cereal", "carne", "tomate", "zanahoria", "café", "azucar", "Aceite de oliva"]

compra.push("Aceite de girasol")

compra.pop()

const peliculasFavoritas = [
    {titulo:"2001: Una odisea en el espacio", director: "Stanley Kubric", fecha: new Date(1968, 4, 3)},
    {titulo:"Thelma and Louise", director:"Ridley Scott", fecha: new Date(1991, 5, 24)},
    {titulo:"Jo Jo Rabbit", director:"Taika Waititi", fecha: new Date(2020, 1, 24)},
]

const peliculasPosteriores = peliculasFavoritas.filter(compara => compara.fecha > new Date(2010, 1, 1))

const directores = peliculasFavoritas.map(directores => directores.director)

const titulos = peliculasFavoritas.map(titulos => titulos.titulo)

const directoresYtitulos = directores.concat(titulos)

const titulosDirectores = [...directores, ...titulos]
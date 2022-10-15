
var nombre = "Eduardo";

var apellido = "Rojas Hernández";

var estudiante = nombre.concat(" " + apellido);

var estudianteMayus = estudiante.toUpperCase();

var estudianteMinus = estudiante.toLowerCase();

var longitud = estudiante.length;

var primera_letra = nombre[0];

var ultima_letra = apellido[apellido.length-1];

var sin_espacios = estudiante.replace(/[" "]/g, "");

var booleano = estudiante.includes(nombre);
public class Main {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.edad = 56;
		cliente.nombre = "Isaac Hernández";
		cliente.telefono = 57657;
		cliente.credito = 2345.5;
		
		System.out.println("Edad : " + cliente.edad);
		System.out.println("Nombre : " + cliente.nombre);
		System.out.println("Telefono : " + cliente.telefono);
		System.out.println("Crédito : " + cliente.credito);
		
		Trabajador trabajador = new Trabajador();
		trabajador.edad = 28;
		trabajador.nombre = "Marimar";
		trabajador.telefono = 57936;
		trabajador.sueldo = 500;
		
		System.out.println("Edad : " + trabajador.edad);
		System.out.println("Nombre : " + trabajador.nombre);
		System.out.println("Telefono : " + trabajador.telefono);
		System.out.println("Sueldo : " + trabajador.sueldo);
		
	}
}

class Persona {
    
     int edad;
     String nombre;
     int telefono;
 
    }
    
class Cliente extends Persona{
    
    double credito;
    
    }
    
class Trabajador extends Persona{
    
    double sueldo;
    
    }
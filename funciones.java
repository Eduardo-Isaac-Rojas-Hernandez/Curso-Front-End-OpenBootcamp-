// Jvdroid-main: 



public class Main {
	public static void main(String[] arg) {

		int resultado = suma(10, 10, 30);
		System.out.println("Resultado : " + resultado);
		
		coche micoche = new coche();
		int puertas = micoche.agregarpuerta();
		
		System.out.println("Numero de puertas : " +puertas);
	}

	public static int suma(int a, int b, int c) {

		return a + b + c;
	}
	
}
           
     class coche{
          
          int puertas = 4;
          
          public int  agregarpuerta(){
              this.puertas ++ ;     
              return puertas;
          }
          
     }
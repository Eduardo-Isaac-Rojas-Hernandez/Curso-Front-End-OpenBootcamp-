public class Main {

		public static void main(String[] args) {
	    
	    int numif = 6;
	    
	    if( numif < 0) {
	        System.out.println("Número negativo");
	        } else {
	            System.out.println("Número positivo");
	            }
	    
	   
	     int numwhile = -5;
	    
	    while( numwhile < 3){
	        numwhile ++;
	        System.out.println("while : " + numwhile);
	        }
	     
	    int numwhile1 = 0;    
	              
	    do{
	        numwhile1 ++;;
	        System.out.println("do-while :"+numwhile1);
	        } while( numwhile1 < 3);
	        
	    
	    for(int numfor =0; numfor <= 3; numfor ++){
	        System.out.println("numerofor : "+numfor); 
	        }
	        
	        
	        var estacion = "jdjdjfb";
	        
	        switch( estacion){
	            
	            case "primavera" :
	            System.out.println("Es primavera");
	            break;
	            
	            case "verano" :
	            System.out.println("Es verano");
	            break;
	            
	            case "otoño" :
	            System.out.println("Es otoño");
	            break;
	            
	            case "invierno" :
	            System.out.println("Es invierno");
	            break;
	            
	            default :
	            System.out.println("No es estación : " +                         estacion);
	            
	            }
	        
	    }
}
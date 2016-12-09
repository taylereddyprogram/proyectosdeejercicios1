
package entradas;

// ejercicio propuesto del numero 10 ,a
public class entradas {
    
    public static void main(String[]arg){
        
        String nombre="tayler";
        double costodeentrada=100;
        int numerodeentradas=4;
        double descuento;
        double costosindescuento=costodeentrada*numerodeentradas;
        double costototal;
        
        
        if(numerodeentradas>=1&&numerodeentradas<=4){
        
             if(numerodeentradas==1){
                   
                 costototal=numerodeentradas*100;
                   
                 System.out.println(nombre+" compra "+numerodeentradas+" entradas");
                 System.out.println("y le cuenta "+costototal+" soles");
                   
             }
             if(numerodeentradas==2){
                
                 descuento=costosindescuento*0.10;
                 costototal=costosindescuento-descuento;
                 
                  System.out.println(nombre+" compra "+numerodeentradas+" entradas");
                  System.out.println("y le cuenta "+costototal+" soles");
             }
             if(numerodeentradas==3){
                
                 descuento=costosindescuento*0.15;
                 costototal=costosindescuento-descuento;
                 
                  System.out.println(nombre+" compra "+numerodeentradas+" entradas");
                  System.out.println("y le cuenta "+costototal+" soles");
             }
             if(numerodeentradas==4){
                
                 descuento=costosindescuento*0.20;
                 costototal=costosindescuento-descuento;
                 
                 System.out.println(nombre+" compra "+numerodeentradas+" entradas");
                 System.out.println("y le cuenta "+costototal+" soles");
             }
        
        }else{
            System.out.println("el numero de entradas ingresado no es valido");
        }
    
          
    }
    
}

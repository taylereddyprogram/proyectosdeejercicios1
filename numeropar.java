
package numerospares;

// ejercicio propuesto b del ejercicio 3
public class numeropar {

   
    public static void main(String[] args) {
        
        int numero=0;
        int suma=0;
        
        for(int i=0;i<100/2;i++) {
         numero=numero+2;
         suma=suma+numero;
         System.out.println(numero);
         
         }
       
        System.out.println(suma);
    }
    
}



package javaapplication1;

/*crea un algoritmo de 5 numeros determina el mayor y menor*/

import java.util.*;
import javax.swing.*;
public class JavaApplication1 {

   
    public static void main(String[] args) {
     
        Scanner entrada=new Scanner(System.in);
        
        int x,y;
        
       System.out.println("introduce numero");
       int numeros=entrada.nextInt();
       System.out.println("introduce numero");
       int numeros2=entrada.nextInt();
       System.out.println("introduce numero");
       int numeros3=entrada.nextInt();
       System.out.println("introduce numero");
       int numeros4=entrada.nextInt();
       System.out.println("introduce numero");
       int numeros5=entrada.nextInt();
        
    if(numeros>numeros2&&numeros>numeros3&&numeros>numeros4&&numeros>numeros5){
     
        x=numeros;
      }else{
         if(numeros2>numeros&&numeros2>numeros3&&numeros2>numeros4&&numeros2>numeros5){
                 x=numeros2;   
         }else{
               if(numeros3>numeros&&numeros3>numeros2&&numeros3>numeros4&&numeros3>numeros5){
                 x=numeros3; 
             }else{
                  if(numeros4>numeros&&numeros4>numeros3&&numeros4>numeros2&&numeros4>numeros5){
                      x=numeros4; 
                  }else{
                   x=numeros5;
                  }
               }
             }
        }
     
    if(numeros<numeros2&&numeros<numeros3&&numeros<numeros4&&numeros<numeros5){
     
        y=numeros;
      }else{
         if(numeros2<numeros&&numeros2<numeros3&&numeros2<numeros4&&numeros2<numeros5){
                 y=numeros2;   
         }else{
               if(numeros3<numeros&&numeros3<numeros2&&numeros3<numeros4&&numeros3<numeros5){
                 y=numeros3; 
             }else{
                  if(numeros4<numeros&&numeros4<numeros3&&numeros4<numeros2&&numeros4<numeros5){
                      y=numeros4; 
                  }else{
                   y=numeros5;
                  }
               }
             }
        
         
    
        }
     
      System.out.println("elmayores"+ x+"y el menor es "+y);
    
    }
}
        
    
    




package numeromayor;

//ejercicio 1

import java.util.*;

public class numeroMayor {

   
    public static void main(String[] args) {
        
     Scanner entrada = new Scanner(System.in);
        
        System.out.println("introduce numeros");
        
        int A=entrada.nextInt();
        int B=entrada.nextInt();
        
        if(A==B){
               System.out.println("introdusca dos  numeros diferentes");
        }else{
              if(A>B){
                    System.out.println(A+"es mayor");
              }else{
                    if(B>A){
                    System.out.println(B+"es mayor");
              }     
        }
    }
   }
}


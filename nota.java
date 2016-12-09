
package notas;
import java.util.*;

//ejercicio 7
public class nota {

   
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("introduce calificacion");
        
        double nota=entrada.nextDouble();
        
        if(nota>=1&&nota<10){
              System.out.println("su calificacion es E");
        }
        if(nota>=10&&nota<13){
              System.out.println("su calificacion es D");
        }
        if(nota>=13&&nota<16){
              System.out.println("su calificacion es C");
        }
        if(nota>=16&&nota<19){
              System.out.println("su calificacion es B");
        }
        if(nota>=19&&nota<=20){
              System.out.println("su calificacion es A");
        }
        if(nota==0||nota>20){
              System.out.println("la nota no es valida");
        }
        
      }
    }
    


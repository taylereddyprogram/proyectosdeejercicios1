
package edad;
// determine la etapa de cada persona segun du edad ,nines,pubertar,adolecencia,adultes,vejes
import java.util.*;
public class Edad {

   
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("introduce nombre");
        
        String nombre=entrada.nextLine();
        
        System.out.println("introduce edad");
        
        int    edad=entrada.nextInt();
        
        
        if(edad>=1&&edad<96){
             if(edad>=1&&edad<=11){
                   System.out.println("esta persona esta en la etapa de niñes");
                }
             if(edad>=12&&edad<=14){
                   System.out.println("esta persona esta en la etapa de pubertad");
                }
             if(edad>=15&&edad<=18){
                   System.out.println("esta persona esta en la etapa de adolecencia");
                }
             if(edad>=19&&edad<=30){
                   System.out.println("esta persona esta en la etapa de juventus");
                }
             if(edad>=31&&edad<=45){
                   System.out.println("esta persona esta en la etapa de adultes");
                }
             if(edad>=46&&edad<=95){
                   System.out.println("esta persona esta en la etapa de vejes");
                }
        
        }else{
                System.out.println("la edad ingresada esta fuera de rango");
                }
    }
    
}

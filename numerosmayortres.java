
package numerosMAyores;

//ejercicio 2

public class numerosmayortres {

   
    public static void main(String[] args) {
        
        int A = 2;
        int B = 1;
        int C = 4;
        
        
        if(A>B&&A>C){
            System.out.println(A+" es mayor");
        }else{
             if(B>A&&B>C){
                   System.out.println(B+ " es mayor");
             }else{
                   System.out.println(C+" es mayor");
             }
        }
    }
    
}

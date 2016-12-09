
package hipotenusa;
 
//ejercicio 4

public class hipo {

   
    public static void main(String[] args) {
        
        double catA=8;
        double catB=6;
        
        double cat=Math.pow(catA, 2)+Math.pow(catB, 2);
        
        double hipotenusa=Math.sqrt(cat);
        
        System.out.println("la hipotenusa de del triangulo es "+hipotenusa);
    }
    
}

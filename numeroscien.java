
package numerosscien;


public class numeroscien {

  
    public static void main(String[] args) {
        
        int numero=0;
        int entre=0;
        int mayor=0;
        int menor=0;
        
        for(int i=0;i<=100;i++){
          
            System.out.println(i);
            
        }
        for(int y=81;y<=100;y++){
          
            mayor++;
            
        }
            for(int x=0;x<30;x++){
          
            menor++;
            
        }
            for(int z=51;z<75;z++){
          
            entre++;
            
        }
        
        
        System.out.println("hay "+(mayor-1)+"  numeros mayores que 80");
         System.out.println("hay "+(menor-1)+"  numeros menores que 30");
          System.out.println("hay "+(entre)+"  entre 50  y 75");
    }
    
}

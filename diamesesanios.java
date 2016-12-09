
package diamesesanios;

//ejercicio 15

public class diamesesanios {
    
    public static void main(String[]arg){
        
        int anios=0;
        int meses=0;
        int numerodedias=37;
        int dias=numerodedias;
      
        
      while(dias>=365){
            anios=anios+1;
            dias=dias-365;
            
         }
   
       while(dias>30){
            meses=meses+1;
            dias=dias-30;
            
            
         }
        while(dias>7){
                meses=meses+1;
                dias=dias-7;
                
        }
        
        if(anios==1){
                System.out.println(anios+" anio");
        }else{
                System.out.println(anios+" anio");
        }
         if(meses==1){
                System.out.println(meses+" mes");
        }else{
                System.out.println(meses+" meses");
        }
          if(dias==1){
                System.out.println(dias+" dia");
        }else{
                System.out.println(dias+" dias");
        }
        
        
  }   
}

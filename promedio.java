
package promedio;

//ejercicio12

import javax.swing.*;
public class promedio {
    
    public static void main(String[]arg){
    int nota;
    int contador=0;
    int acumula=0;
    double promedio;
    
    for(int i=0;i<3;i++){
    
        contador++;
        
        nota=Integer.parseInt(JOptionPane.showInputDialog("introduce nota numero "+contador));
        acumula=acumula+nota;
        
     }  
        promedio=acumula/3;
        
        System.out.println("el promedio es "+promedio);
        
  }

}

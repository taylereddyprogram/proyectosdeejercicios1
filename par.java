
package numeropar;

import javax.swing.JOptionPane;

//ejercicio 6
public class par {

   
    public static void main(String[] args) {
       
        int n=Integer.parseInt(JOptionPane.showInputDialog("introduce numero"));
        
        
        int resto=n%2;
        
        if(resto==0){
              System.out.println("el numero "+n+" es par");
        }else{
              System.out.println("el numero "+n+" es impar");
        }
    }
    
}

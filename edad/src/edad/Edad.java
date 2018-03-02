
package edad;

import javax.swing.JOptionPane;

public class Edad {

public static void main(String[] args) {
      
int año_actual,fecha_nacimiento, edad;
año_actual=Integer.parseInt(JOptionPane.showInputDialog("ingrese el año actual..."));
fecha_nacimiento=Integer.parseInt(JOptionPane.showInputDialog("ingrese su fecha de nacimiento..."));
edad= (año_actual - fecha_nacimiento);
JOptionPane.showInputDialog(null,"su edad es :"+ edad);
   


    
    }
    
}

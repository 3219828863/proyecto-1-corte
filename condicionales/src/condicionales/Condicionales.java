
package condicionales;

import java.util.Scanner;


public class Condicionales {

    
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
       int calificacion;
        System.out.println("ingrese su calificacion");
        calificacion=entrada.nextInt();
        
        if(calificacion > 50)
        {
      System.out.println("gano...");
        }
      else
        if (calificacion < 50)
        {
      System.out.println("perdio");
        }
        
     
        
    }
    
}

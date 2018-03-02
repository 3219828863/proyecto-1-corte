
package triangulo;

import java.util.Scanner;



public class Triangulo {

    
    public static void main(String[] args) {
        
 double area,base,altura;   
        System.out.println("ingrese la altura...");
        Scanner captura=new Scanner(System.in);
        altura=captura.nextDouble();
        
        System.out.println("ingrese la base...");
        Scanner captura1=new Scanner (System.in);
        base=captura1.nextDouble();
        
        area=(base*altura)/2;
        
         System.out.println("el area del triangulo es "+area);
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}

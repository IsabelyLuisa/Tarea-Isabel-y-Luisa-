/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocondiciones;
import java.util.Scanner;


/**
 *
 * @author Usuario
 */
public class ProyectoCondiciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double a,b,c; 
    System.out.println("ingresar el dato a");  
    Scanner LeerDatoa=new Scanner (System.in);
    a=LeerDatoa.nextDouble();
             
     System.out.println("ingresar el dato b"); 
    Scanner LeerDatob=new Scanner (System.in);
    b=LeerDatob.nextDouble();
    
         if(b>0){
         c=a/b; 
System.out.println ("el resultado de la division es"+c);    
}

else {
System.out.println ("no se puede realizar la division");
}
        
        
    }
}
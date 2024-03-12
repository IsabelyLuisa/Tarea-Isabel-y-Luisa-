/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogithub;

/**
 *
 * @author Usuario
 */
import java.util.Scanner; 
public class ProyectoGithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     int a;
     System.out.println ("leer la variable a"); 
     Scanner LeerDatoa=new Scanner(System.in);
     a= LeerDatoa.nextInt();
             
     
     int b;
     System.out.println ("Leer la variable b");
     Scanner LeerDatob=new Scanner (System.in);
     b=LeerDatob.nextInt (); 
     
     
     int c,d,e,f; 
     c=a+b;
     d=a-b;
     e=a*b;      
     f=Math.min(a, b);
     System.out.println ("La suma es"+c);
     System.out.println ("La resta es"+d);
     System.out.println ("la multiplicacion es"+e);
     System.out.println ("el valor minimo es"+f);
     
     
  
     
    }
    
}

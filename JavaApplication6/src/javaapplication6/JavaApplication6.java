/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication6;

import java.util.Scanner;

/**
 *
 * @author JUAN
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    protected void suma(int y , int w )
    {
        int suma = y+w;
        System.out.println("el resultado es:"+suma);
    }
    protected void resta(int b , int c)
    {
        int resta = b-c;
         System.out.println("el resultado es:"+resta);
    }
     protected void multiplicacion(double b , double c)
    {
        double  total = b*c;
        System.out.println("el resultado es:"+total);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Teclado=new Scanner(System.in);
        JavaApplication6 operaciones=new   JavaApplication6 ();
            System.out.println("presione 1 para realizar suma ");
             System.out.println("presione 2 para realizar resta");
             System.out.println("presione 4 para realizar multiplicacion");
        System.out.println("deme la opcion que desea ");
        
           int opc=Teclado.nextInt();
           switch (opc)
           {
               case 1:
                   System.out.println("deme primer numero ");
                   int a=Teclado.nextInt();
                    System.out.println("segundo nuemero ");
                       int b=Teclado.nextInt();
                   
                   System.out.println("presione 1 para realizar suma ");
                   operaciones.suma(a, b);
                       break;
                       
               case 2:
                   System.out.println("deme primer numero ");
                   int c=Teclado.nextInt();
                    System.out.println("segundo nuemero ");
                       int   v=Teclado.nextInt();
                   
                   operaciones.resta(c, v);
                   break;
                   
               case 3:
                    System.out.println("deme primer numero ");
                   double y=Teclado.nextDouble();
                    System.out.println("segundo nuemero ");
                      double   x=Teclado.nextDouble();
                   
                   operaciones.multiplicacion(y, x);
                   break;
               default :
                   System.out.println("opcion invalida ");
                   break;
                  
                   
           }
        
        
    }
    
}

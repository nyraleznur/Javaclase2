package aplicaciontres;

import java.util.Scanner;



public class AplicacionTres {

     public static void main(String[] args) {
         
//         int numero1=10,numero2=20;
//         float num1=50f,num2=20.5f;
//         double n1=1.2333333333;
//         String nombre="Pepe";
//         char v='f';
//         boolean dato=true;
//         boolean dato2=false;
//         System.out.println(numero1+" "+numero2);
//         System.out.println(num1+"  "+num2);
//         System.out.println("El número es "+n1);
//         System.out.println("Su nombre es: "+nombre);
//         System.out.println(nombre.equals("pepe"));
//         System.out.println(nombre.equalsIgnoreCase("pepe"));
           Scanner captura=new Scanner(System.in);
           int n1,n2,r;
           String nombre;
           System.out.println("Digite su nombre ");
           nombre=captura.next();
           System.out.println("Digite un número ");
           n1=captura.nextInt();
           System.out.println("Digite un número");
           n2=captura.nextInt();
           r=n1+n2;
           System.out.println("\nEl resultado es de \n"+r);
           System.out.println("Su nombre es "+nombre);
           
                          
         
         
        
        
        
    }
    
}

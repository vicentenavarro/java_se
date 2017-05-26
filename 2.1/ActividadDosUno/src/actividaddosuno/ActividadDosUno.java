/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividaddosuno;
import java.util.Scanner;
/**
 *
 * @author usuario
 */
public class ActividadDosUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
    Scanner sc;
     sc=new Scanner (System.in);
     int numeroUno;
     int numeroDos;
     float numeroFloat;
     String letraUno;
     String letraDos;
     
     //Introducir los tres números
     numeroUno = sc.nextInt();
     sc.nextLine();
     numeroDos = sc.nextInt();
     sc.nextLine();
     numeroFloat = sc.nextFloat();
     sc.nextLine();
        System.out.println("Escribe una palabra: ");
     letraUno=sc.nextLine();
     System.out.println("Escribe otra palabra: ");
      letraDos=sc.nextLine();
     
     float suma= (float)numeroUno + (float)numeroDos + numeroFloat;
        System.out.println(suma);
        
     if (numeroUno>=numeroDos){
         System.out.println("El número entero mayor es " + numeroUno);
         float restoEntero = numeroUno%numeroDos;
         float division = restoEntero/numeroFloat;
         System.out.println("El resultado de la división del float con el resto de la división es: " + division);
         
     }
     else{
         System.out.println("El número entero mayor es " + numeroDos);
         float restoEntero = numeroDos%numeroUno;
         float division = restoEntero/numeroFloat;
         System.out.println("El resultado de la división del float con el resto de la división es: " + division);
     }
     
      
      
        System.out.println("La cadena de letras es : " + letraUno +" "+ letraDos);
        
   
     
             
    
        
     
    }
    
}

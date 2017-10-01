/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumawhile;

/**
 *
 * @author Emmanuel
 */
import java.util.Scanner;
public class Sumawhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner(System.in);
         
     int numero, sumaDigitos=0;
     
     System.out.println("ingrese el numero: ");
     numero=leer.nextInt();
     int guardado=numero;
     
     while(numero !=0){
         sumaDigitos=sumaDigitos+(numero%10);
         numero=numero/10;
         
     }
     System.out.println("la suma de los digitos con While es de " +guardado+ " es: "+sumaDigitos);
    }
    
}

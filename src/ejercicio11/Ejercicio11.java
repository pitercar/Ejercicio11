/*
LLeer un número y calcularle el factorial a todos los enteros comprendidos entre 1 y el número leído.
 */
package ejercicio11;
import java.util.*;

/**
 *
 * @author Piter
 */
public class Ejercicio11 {
    
    private int inicio=1;
    private int numero;
    
    public void cargarDatos(){
        Scanner entrada=new Scanner(System.in);

        System.out.println("Digite el numero a factoriar... ");
		   
	numero=entrada.nextInt();
    }
    
    public void factorial(){
        
        System.out.println("El numero a factoriar es "+numero);
        System.out.println(" ");
        
        for(int i=inicio; i<=numero; i++){
        
            inicio=inicio*i;
        
            System.out.println("El factorial de "+i+"  es "+inicio);       
        }   
    }
}

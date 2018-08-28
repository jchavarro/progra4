/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

/**
 *
 * @author JuanCaCha
 */
public class ejer5 {
        public static void main(String[] ARGS)
    {
        int a=0;
        int i,n=97;
 
        a = 0;
        
        for(i = 1; i <= n; i++){
            if((n % i) == 0)
                a++;    
        }
 
        if(a <= 2)
            System.out.println("El numero es primo");
        else
            System.out.println("El numero no es primo");
        
    }
}

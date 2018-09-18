/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author JuanCaCha
 */
public class Ejercicio2 {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        
        try{
            FileReader fr = new FileReader("C:\\Users\\JuanCaCha\\Desktop\\Talleres\\Archivos\\archivo.txt");
            BufferedReader br = new BufferedReader(fr);
            String numeros;
            int n_convertido ;
            int i = 0;
            double a = 0;
            double promedio; 
            System.out.println("Los numero son:");
            while( (numeros = br.readLine()) !=null){
                System.out.println(numeros);
                n_convertido =Integer.parseInt(numeros);
                a=+ n_convertido;
                i++;
            }

            promedio = a /i;
            
            System.out.println("El promedio es:"+ promedio);
            
        }catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}

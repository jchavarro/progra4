/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 *
 * @author JuanCaCha
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Entrada1 = new Scanner(System.in);
        int[] Numero = new int[10];
        // TODO code application logic here
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el numero "+ (i+1) + " :");
            Numero[i] = Entrada1.nextInt();
        }

        try {
           File archivo1 = new File("archivo.txt");
           FileWriter fw = new FileWriter(archivo1);
           BufferedWriter bw = new BufferedWriter(fw);
           for(int i=0; i<10; i++){
                bw.write(String.valueOf(Numero[i]));
            
                bw.newLine();
            }
            bw.close();
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
    
}

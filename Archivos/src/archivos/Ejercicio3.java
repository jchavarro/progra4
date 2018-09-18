/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivos;
import taller.herencia.p1.Disco;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
/**
 *
 * @author JuanCaCha
 */
public class Ejercicio3 {
    public static void main(String[] args) throws ClassNotFoundException {
        
    
        Disco d;
        try{
            File archivo = new File("archivo1.txt");
            FileOutputStream fos = new FileOutputStream(archivo);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            d =new Disco("Adios","ja", "salsa", "mp3", "3 minutos");
            oos.writeObject(d);
            d =new Disco("Juaña","onj", "Rap", "mp3", "4 minutos");
            oos.writeObject(d);
            d =new Disco("Peja","la mon", "pop", "mp3", "5minutos");
            oos.writeObject(d);
            

            FileInputStream fis = new FileInputStream("C:\\Users\\JuanCaCha\\Desktop\\Talleres\\Archivos\\archivo1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            d=(Disco)ois.readObject();
            System.out.println(d.toString());
            d=(Disco)ois.readObject();
            System.out.println(d.toString());
            d=(Disco)ois.readObject();
            System.out.println(d.toString());
            
        }catch (FileNotFoundException e) {
        e.printStackTrace();
        } catch (IOException e) {
        e.printStackTrace();
        }
    }
}

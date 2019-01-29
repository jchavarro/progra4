/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author JuanCaCha
 */
public class Agenda {
    
    File a = new File ("agenda.txt");
    
    public void añadir(ArrayList<Contacto> contactos){
    
        try{
            
            FileOutputStream fos=new FileOutputStream(this.a);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(contactos);
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<Contacto> AbrirContactos (){
        
        ArrayList<Contacto> backup = new ArrayList<>();
        try{
            if (this.a.exists()) {
                FileInputStream fos=new FileInputStream(this.a);
                ObjectInputStream ois=new ObjectInputStream(fos);
                backup = (ArrayList<Contacto>) ois.readObject();
            }else{
                añadir(backup);
            }
            
            
        } catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return backup;
    }

    public void Exportar(String f, ArrayList<Contacto> c) {
        
        try {       
            File fr=new File(f);
            FileWriter fw=new FileWriter(fr);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < c.size(); i++) {
                bw.write (c.get(i).toString());
                bw.newLine();
            }
        bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        
        
    }

   public ArrayList<Contacto> Importar(String f,ArrayList<Contacto> ac){
       try{
            File fx=new File(f);
            FileReader fr=new FileReader(fx);
            BufferedReader br = new BufferedReader(fr);
            String cadena;
            String a[];
            while((cadena=br.readLine()) != null){
                
                
                a = cadena.split(";");
                String nombres=a[2];
                String correo=a[1];
                String direccion=a[1];
                String telefono=a[3];
                String alias =a[0];
                Contacto c = new Contacto(nombres,telefono,direccion,correo,alias);
                ac.add(c);
                
            }
          
       }catch(IOException e){
   
       }
       
       
       return null;
   }
   

}

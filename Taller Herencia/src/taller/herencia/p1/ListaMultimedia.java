/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.herencia.p1;

import java.util.ArrayList;
/**
 *
 * @author JuanCaCha
 */
public class ListaMultimedia {
    private int sz;
    private ArrayList <Multimedia> LM = new ArrayList<>();
    

    /**
    *
    * El numero maximo de objetos que va a almacenar.
     * @param sz
    */
    public ListaMultimedia(int sz) {
        this.sz = sz;
        LM.ensureCapacity(sz);
    }


    public int size() {
        return sz;
    }
    
    public boolean add(Multimedia m){
        return LM.add(m);
    }
    public Multimedia get(int i){
        return LM.get(i);
    }


    @Override
    public String toString(){
       
       //return LM.toString();
       for(int i=0; i<LM.size();i++){
           System.out.println("Titulo: " + LM.get(i).Titulo + "\n" + "Autor: " + LM.get(i).Autor + "\n" 
                + "Formato :" + LM.get(i).Formato + "\n"+ "Duracion: " + LM.get(i).Duracion + "\n");
       }
        return null;
       
    }

}

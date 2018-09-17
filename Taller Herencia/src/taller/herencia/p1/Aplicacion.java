/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.herencia.p1;

/**
 *
 * @author JuanCaCha
 */
public class Aplicacion {
    
    public static void main(String[] args) {
        ListaMultimedia a = new ListaMultimedia(10);
        
        Pelicula a1 = new Pelicula("Tomas","la monja", "mCine", "mp5", "113 minutos");
        Pelicula a2 = new Pelicula("Toma","la monj", "mCie", "mp4", "112 minutos");
        Pelicula a3 = new Pelicula("Tom","la mon", "mine", "mp6", "111 minutos");
        
        a.add(a1);
        a.add(a2);
        a.add(a3);
        
        System.out.println(a.toString());
        
        ListaMultimedia b = new ListaMultimedia(20);
        Disco b1 = new Disco("Adios","ja", "salsa", "mp3", "3 minutos");
        Disco b2 = new Disco("Juaña","onj", "Rap", "mp3", "4 minutos");
        Disco b3 = new Disco("Peja","la mon", "pop", "mp3", "5minutos");
        
        System.out.println(b.toString());
        
        Disco b4 = new Disco("Peja","la mon", "", "", "");
        
        
    }
}

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
public class Disco extends Multimedia {
    
    private String Genero;

    public Disco(String Genero, String Titulo, String Autor, String Formato, String Duracion) {
        super(Titulo, Autor, Formato, Duracion);
        this.Genero = Genero;
    }
    @Override
    public String toString(){

        return ("Titulo: " + Titulo + "\n" + "Autor: " + Autor + "\n" + "Genero: "
                +Genero + "Formato :" + Formato + "\n"+ "Duracion: " + Duracion);
    }
    
}

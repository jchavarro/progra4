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
public class Multimedia {



    protected  String Titulo;
    protected  String Autor;
    protected  String Formato;
    protected  String Duracion;

    public Multimedia(String Titulo, String Autor, String Formato, String Duracion) {
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Formato = Formato;
        this.Duracion = Duracion;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public String getFormato() {
        return Formato;
    }

    public String getDuracion() {
        return Duracion;
    }


  
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return ("Titulo: " + Titulo + "\n" + "Autor: " + Autor + "\n" 
                + "Formato :" + Formato + "\n"+ "Duracion: " + Duracion);
    }
    
    public boolean equals(Multimedia Objeto){
        return this.Titulo.equals(Objeto.Titulo) && this.Autor.equals(Objeto.Autor);
    
    }

}

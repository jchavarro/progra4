/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.herencia.p3;

/**
 *
 * @author JuanCaCha
 */
public class Libro extends Publicaciones{

    
    private boolean Prestado = false;

    public Libro(int Codigo, String Titulo, int Año_publicacion, boolean prestado) {
        super(Codigo, Titulo, Año_publicacion);
        this.Prestado = Prestado;
    }
    
    @Override
    public String toString(){
        return ("Codigo: " + Codigo + "\n" + "Titulo" + Titulo + "\n" + "Año de publicacion: " 
                + Año_publicacion + "\n" + "Prestado: " + Prestado);
        
    }
    
    public int getCodigo() {
        return Codigo;
    }

    public int getAño_publicacion() {
        return Año_publicacion;
    }

    public boolean isPrestado() {
        return Prestado;
    }
    
}

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
public class Revista extends Publicaciones{
    private int Numero;

    public Revista(int numero, int Codigo, String Titulo, int Año_publicacion) {
        super(Codigo, Titulo, Año_publicacion);
        this.Numero = numero;
    }
    @Override
    public String toString(){
        return ("Codigo: " + Codigo + "\n" + "Titulo" + Titulo + "\n" + "Año de publicacion: " 
                + Año_publicacion + "\n" + "Numero: " + Numero);
        
    }

    public int getCodigo() {
        return Codigo;
    }

    public int getAño_publicacion() {
        return Año_publicacion;
    }
    
    
}

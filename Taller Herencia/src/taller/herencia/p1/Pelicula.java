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
public class Pelicula extends Multimedia {
    private String Actor_principal;
    private String Actriz_principal;

    public Pelicula(String Titulo, String Autor, String Formato, String Duracion, String Actor_principal,String Actriz_principal) {
        super(Titulo, Autor, Formato, Duracion);
        this.Actriz_principal = Actriz_principal;
        this.Actor_principal = Actor_principal;
        
    }
    public Pelicula(String Actor_principal,String Titulo, String Autor, String Formato, String Duracion) {
        super(Titulo, Autor, Formato, Duracion);
        this.Actor_principal = Actor_principal;
    }   
 /*   
    public Pelicula(String Actriz_principal,String Titulo, String Autor, String Formato, String Duracion) {
        super(Titulo, Autor, Formato, Duracion);
        this.Actriz_principal = Actriz_principal;
    }   
*/
    public String getActor_principal() {
        return Actor_principal;
    }

    public String getActriz_principal() {
        return Actriz_principal;
    }
    
    @Override
    public String toString(){
        return ( "Titulo: " + Titulo + "\n" + "Autor: " + Autor + "\n" 
                + "Formato :" + Formato + "\n"+ "Duracion: " + Duracion
                + "Actor principal: " + Actor_principal+ "Actriz principal: "
                + Actriz_principal);
    }
    


    
    
    
}

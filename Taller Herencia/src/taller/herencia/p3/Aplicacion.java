/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.herencia.p3;

import java.util.ArrayList;

/**
 *
 * @author JuanCaCha
 */
public class Aplicacion {
    
    public int cuentaPrestados(ArrayList<Libro> a){
        int cantidad = 0;
        for (Object a1 : a) {
            if(a.isPrestado())
                cantidad++;
        }
        return cantidad;
    }
    
    
    public int publicacionesAnterioresA(ArrayList<Publicaciones> a, short año){
        int cantidad = 0;
        for (int i = 0; i < a.size(); i++) {
            if(a.getAño_publicacion<año)
                cantidad++;
        }
        return cantidad;
    }
    
    public static void main(String[] args) {
        ArrayList<Publicaciones> P = new ArrayList<>();
        
        Libro a1 = new Libro(1,"la paca", 1998, true);
        Libro a2 = new Libro(11,"pacha", 1988, false);
        Revista b1 = new Revista(1,1, "Semana", 1993);
        Revista b2 = new Revista(2,11, "Satime", 1998);
        
        P.add(a1);
        P.add(a2);
        P.add(b1);
        P.add(b2);
        
        System.out.println(cuentaPrestados(P));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.herencia.p2;

import java.util.ArrayList;

/**
 *
 * @author JuanCaCha
 */
public class Pila implements ColeccionInterfaz{

    private ArrayList<Object> LP = new ArrayList<>();
    private int sz;
            
  
    @Override
    public boolean estaVacia() {
        return LP.isEmpty();
    }

    @Override
    public Object extraer() {

        Object a;
        a = LP.get(0);
        LP.remove(0);
        return a;
    }

    @Override
    public Object primero() {
        return LP.get(0);
    }

    @Override
    public boolean añadir(Object a) {
        return LP.add(a);
    }
    
}

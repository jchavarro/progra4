/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

import java.io.Serializable;

/**
 *
 * @author JuanCaCha
 */
public class Contacto implements Comparable<Contacto>, Serializable {
    
    private String nombre, telefono, direccion, correo, alias;
    
    public Contacto(String nombre, String telefono, String direccion, String correo, String alias) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.alias = alias;
    }   
    public Contacto() {
        this.nombre = null;
        this.telefono = null;
        this.direccion = null;
        this.correo = null;
        this.alias = null;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public String getAlias() {
        return alias;
    }

    @Override
    public String toString() {
        return "Contacto{" + "nombre=" + nombre + ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + ", alias=" + alias + "\n"+'}';
    }

    
    @Override
    public int compareTo(Contacto t) {
        return this.nombre.compareTo(t.nombre);
    }
    
    
    
}

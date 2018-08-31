/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progra4.semana5;

/**
 *
 * @author utp
 */
public class Cuenta {

    private String Titular;
    private double Cantidad;

    public Cuenta(String Titular) {
        this.Titular = Titular;
    }

    public String getTitular() {
        return Titular;
    }

    public void setTitular(String Titular) {
        this.Titular = Titular;
    }

    public double getCantidad() {
        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }
    
    public void agregarCantidad (double Cantidad){
        this.Cantidad += Cantidad;
    }
    
    public void retirarCantidad (double Cantidad){
        if (Cantidad > this.Cantidad)
            this.Cantidad = 0;
        else 
            this.Cantidad -= Cantidad;
                
    }
        
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

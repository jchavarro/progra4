/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.utp.isc.progra4.semana5;
import java.util.Random;
/**
 *
 * @author utp
 */
public class Persona {
    private final char HOMBRE = 'H';
    private final char MUJER = 'M';
            
    private String nombre;
    private int edad;
    private int identificacion;
    private char genero = HOMBRE;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public Persona(String nombre, int edad, int identificacion, char genero, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.identificacion = identificacion;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
    }
    
    public int calcularIMC(){
        int IMC = 0;
        double IM = 0;
        if(peso/Math.pow(altura, 2) < 20)
            return IMC = -1;
        Random.nextInt
    
    }
    
            
            
            
            
            
            
            
            
            
}












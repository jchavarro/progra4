package PaqueteOp;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utp
 */
public class OperacionesPractica1 {
    public static int suma (String a1, String a2){
        int a;
        a= Integer.parseInt(a1) + Integer.parseInt(a2);
        return a;
    }
    public static int resta (String a1, String a2){
        int a;
        a= Integer.parseInt(a1) - Integer.parseInt(a2);
        return a;
    }
    public static int div (String a1, String a2){
        int a;
        a= Integer.parseInt(a1) / Integer.parseInt(a2);
        return a;
    }
    public static int mult (String a1, String a2){
        int a;
        a= Integer.parseInt(a1) * Integer.parseInt(a2);
        return a;
    }
    public static int porc (String a1, String a2){
        int a;
        a= Integer.parseInt(a1) % Integer.parseInt(a2);
        return a;
    }
    
}

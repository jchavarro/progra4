/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle;

/**
 *
 * @author JuanCaCha
 */
public class ModeloPuzzle {
    int i, cantidad, rango;
    
    public int[] Numaleatorios(int c) {
        int array[] = new int[c];
        for (int i= 0; i < c; i++) {
            array[i] =(int)(Math.random()*(c-1+1)+1);
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    i--;
                }
                
            }
        }
       
        return array;
    } 
    
}

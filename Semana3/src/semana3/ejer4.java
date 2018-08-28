
package semana3;

public class ejer4 {
    
    static double potencia(double n, int m){
        if(m==1)
            return n;
        else
            return n*potencia(n,m-1);
    }
    public static void main(String[] args) {
        
        int n=2, m=10;
        System.out.println(potencia(n,m));
    }
}

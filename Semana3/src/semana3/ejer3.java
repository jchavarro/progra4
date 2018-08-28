
package semana3;

public class ejer3 {
    
    static int fibonacci(int a){
        if (a==0)
            return 1;
        else if (a==1)
            return 1;
        else
            return fibonacci(a-2)+fibonacci(a-1);
    }
    
    public static void main(String[] args){
    
        int a=4;
        System.out.println(fibonacci(a));
    
    }
}

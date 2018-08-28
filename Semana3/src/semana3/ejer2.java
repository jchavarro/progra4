package semana3;

public class ejer2 {

    static int factorial (int a){
        if(a==0)
            return 1;
        else
            return factorial(a-1)*a;
    }   
    public static void main (String[] args){
        int a=5;
        System.out.println(factorial (a));
        
    }
    
}


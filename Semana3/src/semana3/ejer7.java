package semana3;

public class ejer7 {
    public static void main(String[] args) {
        
        double a = 1, b = 2,c = 3, x1, x2;
        
        x1 = (-b+ Math.sqrt(ejer4.potencia(b, 2)+4*a*c))/(2*a);
        x2 = (-b- Math.sqrt(ejer4.potencia(b, 2)+4*a*c))/(2*a);
        
        System.out.println("La raiz 1 es : " + x1);
        System.out.println("La raiz 2 es : " + x2);
    }
}

package semana3;

public class ejer6 {
    public static void main(String[] args) {
        
        int semanas, dias, horas;
        //variables auxiliares
        int aux;              
        // numero de horas a convertir
        int totalhoras =1000;
        
        semanas = totalhoras/168;
        aux = totalhoras%168;
        dias = aux/24;
        horas= aux%24;
        System.out.print(semanas + " Semanas, "); 
        System.out.print(dias + " dias, ");
        System.out.print("con "+ horas + " horas.");
    }
}

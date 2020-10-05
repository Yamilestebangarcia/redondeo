
package redondeo;


public class Redondeo {


    public static void main(String[] args) {
       
        double numero =3.4;
        double numero1=3.5;
        double numero2 =3.6;
        System.out.println("\nround");
        System.out.println("------------------");
        System.out.println(Math.round(numero));//redondeo para de 0.5 para arriba inclusive.
        System.out.println(Math.round(numero1));
        System.out.println(Math.round(numero2));
        System.out.println("\nceil");
        System.out.println("------------------");
        System.out.println(Math.ceil(numero)); //redondeo para arriva da igual el valor decimal
        System.out.println(Math.ceil(numero1));
        System.out.println(Math.ceil(numero2));
        System.out.println("\nfloor");
         System.out.println("------------------");
        System.out.println(Math.floor(numero)); //redondeo para abajo da igual el valor decimal
        System.out.println(Math.floor(numero1));
        System.out.println(Math.floor(numero2));
        
    }
    
}

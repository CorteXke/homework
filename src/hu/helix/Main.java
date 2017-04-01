package hu.helix;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        int deci=26;
        double hektoliter = (double) Math.round((deci * 0.001) * 1000000) / 1000000;
        double liter= (double) Math.round((deci*0.1)* 1000000) / 1000000;
        double mililiter= (double) Math.round((deci*100)*100000/100000);
        double centiliter= (double) Math.round((deci*10)*100000/100000);
        System.out.println("26dl= " +hektoliter + " hl") ;
        System.out.println("26dl= " + liter + " l");
        System.out.println("26dl= " +mililiter + " ml") ;
        System.out.println("26dl= " +centiliter + " cl") ;

    }
}
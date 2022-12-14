package com.noyabr29;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Vinumber {
    public static void main(String[] args) {

        Car BMW_e87= new Car("BMW 123d","WBAUH11049E225990", LocalDate.of(2010, 10, 10));
        Car Volvo=new Car("Volvo XC70", "YV1BZ95H6D1189861", LocalDate.of(2013, 10,10));
        Car Infiniti_FX=new Car("Infiniti_FX50","JNRBS1MW3CM650137", LocalDate.of(2014, 10, 10));
        Car Infiniti_EX=new Car("Infiniti_EX37","JNRBJ0HR6DM240158", LocalDate.of(2013, 10, 10));
        Car Skoda_Superb=new Car("Skoda_Superb ","TMBLJ9NP7F7610636", LocalDate.of(2017, 10,10));


        Car[] cc= { BMW_e87, Volvo, Infiniti_FX, Infiniti_EX,  Skoda_Superb };

       // pattern=LocalDate.parse(pattern, DateTimeFormatter.ofPattern("yyyy"));

        for( Car z : cc){
            LocalDate pattern= LocalDate.of(2000, 10, 10);
            String s=""+z.vin.charAt(9);
            int yr= Integer.parseInt(""+ z.vin.charAt(9), 16);
            pattern=pattern.plusYears(yr);
            int yalan=z.year.compareTo((pattern));
            if(yalan==0) System.out.println(z.model+"-in ili duz qeyd olunub.");
            else System.out.println(z.model+"-in ili sehv qeyd olunub. Duzgun ili "+pattern.getYear());
        }

    }
}

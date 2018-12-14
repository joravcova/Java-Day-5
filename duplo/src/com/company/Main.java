package com.company;

import zvierata.Macka;
import zvierata.Pes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

import static java.time.LocalDate.*;

public class Main {

    public static void main(String[] args) {
        LocalDate datum1 = LocalDate.now();
        System.out.println("Dnes je " + datum1 + " je " + datum1.getDayOfWeek());

        LocalDate datum2 = LocalDate.of(2014, 3, 12);
        System.out.println(datum2);

        System.out.println(datum2.getDayOfWeek());

        LocalDate datum3 = LocalDate.parse("2014-01-12");
        System.out.println(datum3.getYear());

        Date datumNarodenia = new Date();
        System.out.println(datumNarodenia);


        Pes pes1 = new Pes(datumNarodenia, "Peggy");
        pes1.napisCoSom();
        System.out.println("moje meno je : " + pes1.getMeno());

        Date narodenieMacky = new Date();
        narodenieMacky.setYear(2014);

        Macka macka1 = new Macka(datumNarodenia,"Cica");
        macka1.napisCoSom();
        macka1.setVek(4);
        System.out.println("moje meno je : " + macka1.getMeno());

        LocalTime start = LocalTime.now();


        for (int i = 0; i < 100000 ; i++) {
        }
        LocalTime finish = LocalTime.now();
        System.out.println("start:" + start);
        System.out.println("finish: " + finish);
        System.out.println(finish.getSecond() - start.getSecond());

        LocalDateTime datumCas2 = LocalDateTime.now();
        System.out.println(datumCas2);

    }
}
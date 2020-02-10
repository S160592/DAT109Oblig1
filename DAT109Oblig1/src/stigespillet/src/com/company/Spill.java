package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import  com.company.Brikke.*;
import  com.company.Spiller;
import com.company.Brett;

public class Spill {


    public static void main(String[] args) {


 //   public static void startspill() {
        int antall;
        antall = 0;
        //scanner
        Scanner sc = new Scanner(System.in);

        //må spille med 2-4 spillere
        while (antall < 2 || antall > 4) {
            System.out.println("hvor mange spillere? må være mellom 2 og 4.");
            antall = sc.nextInt();

            //liste med 2-4 spillere
            //skriver ut navn
            List<Spiller> spillere = new ArrayList<Spiller>();


            for (int i = 0; i < antall; i++) {
                Spiller spiller = new Spiller("spiller " + (i + 1));
                spillere.add(spiller);
              //  System.out.println(Spiller.getNavn());
            }

            for (Spiller spiller : spillere) {
                System.out.println(spiller);
            }
            System.out.println(spillere.toString());

            //avslutter når noen har nådd 100 - uferdig
            boolean ferdig = false;
            Brett brett = new Brett(spillere);

            while(!ferdig) {
                for (int j = 0; j < antall; j++) {
                    Spiller test = spillere.get(j);

                    System.out.println(test.getNavn());
                  int teller =  test.runde();
                   ferdig = brett.flyttSpiller(test, teller);

                   // System.out.println(teller);
                    System.out.println("------------------------------");



                }

            }

            // System.out.println("spiller " + spillere.get(i).getNavn());


        }
       // runde();


    }
}

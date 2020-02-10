package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.company.Spiller;

public class Brett {
    //  brett med 100 ruter
    private final int rad = 10;
    private final int rekke = 10;
    private int[][] brett = new int[rad][rekke];

    //map for ruter på brettet
    Map<Spiller, Integer> posisjoner;

    public Brett(List<Spiller> spillere) {
        this.posisjoner = new HashMap<Spiller, Integer>();
        for (Spiller spiller : spillere) {
            this.posisjoner.put(spiller, 0);
        }

        //ikke i bruk
        // lager brette med rad * rekker  ,hentet fra YT
        brett = new int[rad][rekke];
        for (int rad1 = 0; rad1 < rad; rad1++) {
            for (int rekke1 = 0; rekke1 < rekke; rekke1++) {
                brett[rad1][rekke1] = rad1 * rad + rekke1 + 1;
            }
        }

    }



    public  boolean flyttSpiller(Spiller spiller, int verdi) {
        int posisjon = posisjoner.get(spiller);
        posisjon = posisjon + verdi;
        System.out.println( "///er på plass " + posisjon + "///");

       //stige fra 5 til 10
        if(posisjon == 5) {
            posisjoner.put(spiller, 10);
            System.out.println("går opp en stige ");
        }
            //slange fra 17 til 3
            if(posisjon==17) {
                posisjoner.put(spiller, 3);

                System.out.println("ble spist av en slange ");
            }

        //stige fra 20 til 50
        if(posisjon == 20) {
            posisjoner.put(spiller, 10);
            System.out.println("går opp en stige ");
        }
        //slange fra 30 til 20
        if(posisjon==30) {
            posisjoner.put(spiller, 20);

            System.out.println(" ble spist av en slange ");
        }
        //stige fra 75 til 98
        if(posisjon == 75) {
            posisjoner.put(spiller, 98);
            System.out.println("går opp en stige ");
        }
        //slange fra 81 til 55
        if(posisjon==81) {
            posisjoner.put(spiller, 55);

            System.out.println("spist av en slange ");
        }

        //hvis spilleren havner på rutenr 100 så vinner han
        if (posisjon >= 100) {
            System.out.println( spiller + " vinner!");
            posisjoner.put(spiller, 100);

            return true;
        }else {
            posisjoner.put(spiller, posisjon);
            return false;
        }
    }
}


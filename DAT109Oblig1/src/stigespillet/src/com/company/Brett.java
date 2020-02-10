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

        // lager brette med rad * rekker  ,hentet fra YT.
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

        //hvis spilleren er havner på rutenr 100 så vinner han
        if (posisjon == 100) {
            System.out.println("spiller " + spiller + " vinner!");
            posisjoner.put(spiller, 100);
            return true;
        }else {
            posisjoner.put(spiller, posisjon);
            return false;
        }
    }
}


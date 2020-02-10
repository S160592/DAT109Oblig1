package com.company;

import java.util.List;


public class Brikke extends Brett {

    private int plass;
    int brikkenr;

    public Brikke(List<Spiller> spillere) {
        super(spillere);
    }

    public int getBrikkenr() {
        return brikkenr;
    }

    public void setBrikkenr(int brikkenr) {
        this.brikkenr = brikkenr;
    }

    public  int getPlass() {
        return plass;
    }

    public void setPlass(int plass) {


        this.plass = plass;
    }
/*
    //flytt en  brikke. verdi er verdien på terning.
    public  void flyttBrikke(Spiller spiller, int verdi) {
        int posisjon = posisjoner.get(spiller);
        posisjon = posisjon + verdi;
        //this.posisjoner.put(spiller, verdi);

        //hvis spilleren er havner på rutenr 100 så vinner han
        if (posisjon == 100) {
            System.out.println("spiller " + spiller + " vinner!");
            posisjoner.put(spiller, 100);

        }
    } */


}

package com.company;

public class Spiller {


    private String navn;
    private Terning terning = new Terning();

 /*   public  int getPlass() {
        return plass = Brikke.getPlass();
    } */

    private  int plass;

    public Spiller(String navn) {
        this.navn = navn;
       // terning = new Terning();



    }

    public  String getNavn() {
        return navn;
    }

    // en runde på brettet
public  int runde() {
        int trill  = terning.trill();

    //System.out.println(navn + " trillet " + trill);
    return trill;
}

    @Override
    public String toString() {
        return navn;
    }
}

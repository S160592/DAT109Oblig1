package com.company;
import com.company.Brikke;

public class Terning {
    public  int terning;
  //  private  int terning;



    public int getTerning() {
        return terning;
    }

    public int trill() {

          terning = (int) (Math.random()*6)+1;
        System.out.println( "triller " + terning);
       // Brikke.setPlass(Brikke.getPlass() + terning);

        return terning;
    }






}

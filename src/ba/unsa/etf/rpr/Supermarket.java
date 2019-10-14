package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {

    Artikl[] supermarket=new Artikl[1000];
    int brojArtikla=0;




    public Artikl[] getArtikli(){


        return this.supermarket;

    }

    public void dodajArtikl(Artikl a){

        if(brojArtikla==1000) System.out.println("Supermarket je pun");

        else {
            supermarket[brojArtikla] = a;
            brojArtikla = brojArtikla + 1;
        }

    }

    public Artikl izbaciArtiklSaKodom(String kod){

        for (int i = 0; i < brojArtikla; i++) {

            if( kod.equals(supermarket[i].getKod())){
                return supermarket[i];
            }

        }
        return null;

    }

}

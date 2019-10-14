package ba.unsa.etf.rpr;

import java.util.concurrent.atomic.AtomicBoolean;

public class Korpa {

     Artikl[] korpa=new Artikl[50];
     int brojArtikla=0;


public Artikl[] getArtikli(){


    return this.korpa;

}

    public boolean dodajArtikl(Artikl a){

        if(brojArtikla==50) System.out.println("Korpa je puna");

    else {
            korpa[brojArtikla] = a;
            brojArtikla = brojArtikla + 1;
            return true;
        }
    return false;
    }


    public Artikl izbaciArtiklSaKodom(String kod) {

        for (int i = 0; i < brojArtikla; i++) {

            if(korpa[i]==null)continue;

            if( kod.equals(korpa[i].getKod())){

                return korpa[i];
            }

        }
        return null;

    }

    public int dajUkupnuCijenuArtikala() {

    int cijenaKorpe=0;

        for (int i = 0; i <brojArtikla ; i++) {

            if(korpa[i]==null) continue;;

            cijenaKorpe=cijenaKorpe+korpa[i].getCijena();

        }

    return cijenaKorpe;
    }
}

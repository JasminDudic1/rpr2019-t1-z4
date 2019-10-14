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

            for (int i = 0; i < 50; i++) {

                if(korpa[i]==null){
                    korpa[i]=a;
                    break;

                }


            }
            return true;
        }
    return false;
    }


    public Artikl izbaciArtiklSaKodom(String kod) {

        for (int i = 0; i < 50; i++) {

            if(korpa[i]==null)continue;

            if( kod.equals(korpa[i].getKod())){

            Artikl izbacit=korpa[i];
            korpa[i]=null;
            ocisti(i);

            return izbacit;

            }

        }
        return null;

    }

    private void ocisti(int n){

        for (int i = n; i < 49; i++) {

            korpa[i]=korpa[i+1];

        }


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

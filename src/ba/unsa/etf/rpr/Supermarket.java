package ba.unsa.etf.rpr;

import java.util.ArrayList;

public class Supermarket {

    Artikl[] supermarket=new Artikl[1000];
    int brojArtikla=0;




    public Artikl[] getArtikli(){


        return this.supermarket;

    }

    public boolean dodajArtikl(Artikl a){

        if(brojArtikla==1000)
            System.out.println("Supermarket je pun");

        else {

            for (int i = 0; i <1000 ; i++) {

                if(supermarket[i]==null){
                    supermarket[i]=a;
                    break;

                }

            }


            return true;
        }

        return false;

    }

    public Artikl izbaciArtiklSaKodom(String kod){

        for (int i = 0; i < 1000; i++) {

            if(supermarket[i]==null) continue;

            if( kod.equals(supermarket[i].getKod())){

                Artikl izbaceni=supermarket[i];
                supermarket[i]=null;
                ocisti(i);


                return izbaceni;
            }

        }
        return null;

    }


    private void ocisti(int n){

        for (int i = n; i < 999; i++) {

            supermarket[i]=supermarket[i+1];

        }


    }

}
